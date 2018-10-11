/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atenciondelresto;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lorei
 */
public class PedidoData {
 private Connection connection=null;


    public PedidoData(Conexion conexion) throws SQLException {
        connection = conexion.getConexion();
    }

    public void guardarPedido(Pedido pedido){
        try {
            
            String sql = "INSERT INTO pedido ( fecha_hora) VALUES (  ? );";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            statement.setDate(2, Date.valueOf(pedido.getFecha_hora()));
          
                        
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                pedido.setId_mesero(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un mesero");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un pedido: " + ex.getMessage());
        }
    }
    
    public List<Pedido> obtenerPedido(){
       ArrayList<Pedido> pedidos = new ArrayList<>();

        try {
            String sql = "SELECT * FROM pedido;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Pedido pedido;
            while(resultSet.next()){
                pedido = new Pedido();
                pedido.setId_pedido(resultSet.getInt("id_pedido"));
                pedido.setFecha_hora(resultSet.getDate("fecha_hora").toLocalDate());
               
                
                pedidos.add(pedido);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los pedidos: " + ex.getMessage());
        }
        
        return pedidos;
    } 
    
    public void actualizarPedido(Pedido pedido){
        
       try {  
            String sql = "UPDATE pedido SET fecha_hora = ? ;";

            PreparedStatement statement;

            statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setDate(1, Date.valueOf(pedido.getFecha_hora()));
            statement.executeUpdate();
     
     } catch (SQLException ex) {
         Logger.getLogger(PedidoData.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
 
    
    public Pedido buscarPedido(LocalDate fecha){
    Pedido pedido= null;
    try{
        
        String sql = "SELEC * FROM pedido WHERE fecha_hora =?;";
        
        try (PreparedStatement statement = connection.prepareStatement(sql ,Statement.RETURN_GENERATED_KEYS)) {
            statement.setDate(1, Date.valueOf(fecha));
            
            ResultSet resultset=statement.executeQuery();
            
            while(resultset.next()){
                pedido = new Pedido();
                pedido.setfecha(resultset.getString("fecha_hora"));
             
            }   }
        
    } catch (SQLException ex){
        System.out.println("Error al buscar un mesero: " + ex.getMessage() );
    }
    
    return pedido;
    }

  public void borrarPedido(LocalDate fecha){
    try {
            
            String sql = "DELETE FROM pedido WHERE fecha =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setDate(1, Date.valueOf(fecha));
                        
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar una mesero: " + ex.getMessage());
        }
   
    }    
}
