/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atenciondelresto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lorei
 */
public class PedidoDetalleData {
    
    private Connection connection = null;
    
    public PedidoDetalleData(Conexion conexion){
        
        try {
            connection = conexion.getConexion();
       
        } catch (SQLException ex) {
           System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    public void agregarProducto(PedidoDetalle pedidoDetalle){
        
        String sql = "INSERT INTO pedido_detalle (cantidad, precio_unitario, id_producto, id_pedido) VALUES (?, ?, ?, ?);";
        
        try {
            PreparedStatement  statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            statement.setInt(1, pedidoDetalle.getCantidad());
            statement.setDouble(2, pedidoDetalle.getPrecio_unitario());
            statement.setInt(3, pedidoDetalle.getId_producto());
            statement.setInt(4, pedidoDetalle.getId_pedido());
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
            
            if(rs.next()){
                pedidoDetalle.setId_pedidoDetalle(rs.getInt(1));
            } else {
                System.out.println("No se puede obtener el id despues de insertar un producto");
            }
            statement.close();
            
         } catch (SQLException ex) {
            System.out.println("Error al insertar un producto: "+ ex.getMessage());
        }
     }
    
    public void quitarProducto(int id_producto) {
         try {
            
            String sql = "DELETE FROM pedidoDetalle WHERE id_producto=?;";

          PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
          statement.setInt(1, id_producto);
          
          statement.executeUpdate();
         }
         catch(SQLException ex){
             System.out.println("Error al borrar un producto "+ ex.getMessage());
         }
    }
    
    public double calculoSubtotal(PedidoDetalle pedidoDetalle){
        return pedidoDetalle.getCantidad() * pedidoDetalle.getPrecio_unitario();
    }
}   
