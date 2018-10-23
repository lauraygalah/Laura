/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atenciondelresto;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lorei
 */
public class AtencionDelResto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Conexion conexion=null;
        MesaData mesaData = null;
        try {
           conexion = new Conexion("jdbc:mysql://localhost/atenciondelresto", "root", "");
           mesaData = new MesaData(conexion);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AtencionDelResto.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Guarda una mesa
       Mesa mesa=new Mesa(1,4,true);
       mesaData.guardarMesa(mesa);
       
       // Busca y actualiza una mesaa
        mesa=mesaData.buscarMesa(4);
       System.out.println(mesa.getEstado());
       //mesa.setEstado(true);
       //mesaData.actualizarMesa(mesa);
    }
}
