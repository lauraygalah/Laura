/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atenciondelresto;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author lorei
 */
public class MeseroData {
     private Connection connection = null;

    public MeseroData(Conexion conexion) throws SQLException {
        connection = conexion.getConexion();
    }
   
    
}
