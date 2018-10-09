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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lorei
 */
public class MesaData {
    private Connection connection=null;

    public MesaData(Conexion conexion) throws SQLException {
        connection = conexion.getConexion();
    }
    
    
    public void guardarMesa(Mesa mesa){
        try {
            
            String sql = "INSERT INTO mesa ( nro_mesa, capacidad, estado) VALUES ( ? , ? , ? );";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            statement.setInt(1, mesa.getNro_mesa());
            statement.setInt(2, mesa.getCapacidad());
            statement.setBoolean(3, mesa.getEstado());
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                mesa.setId_mesa(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar una mesa");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una mesa: " + ex.getMessage());
        }
    }
    
    public List<Mesa> obtenerMesa(){
       ArrayList<Mesa> mesas = new ArrayList<>();

        try {
            String sql = "SELECT * FROM mesa;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Mesa mesa;
            while(resultSet.next()){
                mesa = new Mesa();
                mesa.setId_mesa(resultSet.getInt("id_mesa"));
                mesa.setNro_mesa(resultSet.getInt("nro_mesa"));
                mesa.setCapacidad(resultSet.getInt("capacidad"));
                mesa.setEstado(resultSet.getBoolean("estado"));

                mesas.add(mesa);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las mesas: " + ex.getMessage());
        }
        
        return mesas;
    } 
    
    public void actualizarMesa(Mesa mesa){
    
        try {
            
            String sql = "UPDATE mesa SET nro_mesa = ?, capacidad = ? , estado =? WHERE id_mesa = ?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, mesa.getNro_mesa());
            statement.setInt(2, mesa.getCapacidad());
            statement.setBoolean(3, mesa.getEstado());
            statement.setInt(4, mesa.getId_mesa());
            statement.executeUpdate();
            
          
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al actualizar una mesa: " + ex.getMessage());
        }
    
    }
    
    
    public Mesa buscarMesa(int nroMesa){
    Mesa mesa=null;
    try{
        
        String sql = "SELECT * FROM mesa WHERE nro_mesa = ?;";
        
        PreparedStatement statement = connection.prepareStatement(sql ,Statement.RETURN_GENERATED_KEYS);
        statement.setInt(1, nroMesa);
        
        ResultSet resultset=statement.executeQuery();
        
        while(resultset.next()){
            mesa = new Mesa();
            mesa.setId_mesa(resultset.getInt("id_mesa"));
            mesa.setNro_mesa(resultset.getInt("nro_mesa"));
            mesa.setCapacidad(resultset.getInt("capacidad"));
            mesa.setEstado(resultset.getBoolean("estado"));
        }
        statement.close();
        
    } catch (SQLException ex){
        System.out.println("Error al buscar una mesa: " + ex.getMessage() );
    }
    return mesa;
    }
    
     public void borrarMesa(int nroMesa){
    try {
            
            String sql = "DELETE FROM mesa WHERE nro_mesa =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, nroMesa);
           
            
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar una mesa: " + ex.getMessage());
        }
        
    
    } 
    
}
