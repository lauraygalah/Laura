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
/**
 *
 * @author lorei
 */
public class ReservaData {
    private Connection connection=null;
    
    public ReservaData(Conexion conexion) throws SQLException {
        connection = conexion.getConexion();
    }
    
    public void agregarReserva(Reserva reserva){
        try {
            String sql = "INSERT INTO reserva ( nombre, dni, fecha_hora, estado, mesa ) VALUES (?, ?, ?, ?, ? );";
            
            
            try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                statement.setString(1, reserva.getNombre());
                statement.setInt(2, reserva.getDni());
                statement.setDate(3, Date.valueOf(reserva.getFecha_hora()));
                statement.setShort(4, reserva.getEstado());
                statement.setInt(5, reserva.getNro_mesa());
                
                statement.executeUpdate();
                
                ResultSet rs= statement.getGeneratedKeys();
                
                if(rs.next()){
                    reserva.setId_reserva(rs.getInt(1));
                } else {
                    System.out.println("No se pudo obtener el id luego de insertar una reserva");
                }
            }
        
        } catch (SQLException ex) {
            System.out.println("Error al insertar una reserva: " + ex.getMessage());
        }
    }
    
    
    public void quitarReserva(String nombre){
       
        try {
             String sql = "DELETE  FROM reserva WHERE nombre=?;";
             
            try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                statement.setString(1, nombre);
                
                statement.executeUpdate();
            }
           
        } catch (SQLException ex) {
                System.out.println("Error al borrar una reserva: " + ex.getMessage());
        }
    }
}
