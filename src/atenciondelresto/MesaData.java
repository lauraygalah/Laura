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

/**
 *
 * @author lorei
 */
public class MesaData {
    
    public class MesaData {
    private Connection connection = null;

    public MesaData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    
    public void guardarMesa(Mesa mesa){
        try {
            
            String sql = "INSERT INTO mesa (id_mesa, nro_mesa, capacidad, estado) VALUES ( ? , ? , ? , ? );";

            try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                statement.setInt(1, mesa.getId_mesa());
                statement.setInt(2, mesa.getNroMesa()));
                statement.setInt(3, mesa.getcantidad());
                statement.setboolean(4 ,mesa.getEstado());
                
                statement.executeUpdate();
                
                ResultSet rs = statement.getGeneratedKeys();
                
                if (rs.next()) {
                    mesa.setId(rs.getInt(1));
                } else {
                    System.out.println("No se pudo obtener el id luego de insertar un alumno");
                }
            }
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
    }
    
    public List<Alumno> obtenerAlumnos(){
       ArrayList<Alumno> alumnos = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM alumno;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Alumno alumno;
            while(resultSet.next()){
                alumno = new Alumno();
                alumno.setId(resultSet.getInt("id"));
                alumno.setNombre(resultSet.getString("nombre"));
                alumno.setFecNac(resultSet.getDate("fecNac").toLocalDate());
                alumno.setActivo(resultSet.getBoolean("activo"));

                alumnos.add(alumno);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        
        
        return alumnos;
    }
    
}

    
}
