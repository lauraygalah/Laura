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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;


/**
 *
 * @author lorei
 */
public class MeseroData {

     private Connection connection=null;


    public MeseroData(Conexion conexion) throws SQLException {
        connection = conexion.getConexion();
    }

    public void guardarMesero(Mesero mesero){
        try {
            
            String sql = "INSERT INTO mesero ( nombre, dni) VALUES ( ? , ? );";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            statement.setString(1, mesero.getNombre());
            statement.setInt(2, mesero.getDni());
                        
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                mesero.setId_mesero(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un mesero");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un mesero: " + ex.getMessage());
        }
    }
    
    public List<Mesero> obtenerMesero(){
       ArrayList<Mesero> meseros = new ArrayList<>();

        try {
            String sql = "SELECT * FROM mesero;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Mesero mesero;
            while(resultSet.next()){
                mesero = new Mesero();
                mesero.setId_mesero(resultSet.getInt("id_mesero"));
                mesero.setNombre(resultSet.getString("nombre"));
                mesero.setDni(resultSet.getInt("dni"));
                
                meseros.add(mesero);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las mesas: " + ex.getMessage());
        }
        
        return meseros;
    } 
    
    public void actualizarMesero(Mesero mesero){
        
        try {
            String sql = "UPDATE mesa SET nombre = ? , dni = ? ;";

            PreparedStatement statement=connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1 , mesero.getNombre());
            statement.setInt(2 , mesero.getDni());
            statement.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(MeseroData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public Mesero buscarMesero(String nombre){
    Mesero mesero=null;
    try{
        
        String sql = "SELEC * FROM mesero WHERE nombre =?;";
        
        try (PreparedStatement statement = connection.prepareStatement(sql ,Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, nombre);
            
            ResultSet resultset=statement.executeQuery();
            
            while(resultset.next()){
                mesero = new Mesero();
                mesero.setNombre(resultset.getString("nombre"));
                mesero.setDni(resultset.getInt("dni"));
            }   }
        
    } catch (SQLException ex){
        System.out.println("Error al buscar un mesero: " + ex.getMessage() );
    }
    
    return mesero;
    }

  public void borrarMesero(String nombre){
    try {
            
            String sql = "DELETE FROM mesero WHERE nombre =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, nombre);
           
            
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar una mesero: " + ex.getMessage());
        }
   
    } 
}
