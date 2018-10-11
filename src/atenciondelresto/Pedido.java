/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atenciondelresto;

import java.time.LocalDate;

/**
 *
 * @author lorei
 */
public class Pedido {
    
    private int id_pedido;
    private LocalDate fecha_hora;
    private int id_mesa;
    private int id_mesero;

      public Pedido(int id_pedido, LocalDate fecha_hora, int id_mesa, int id_mesero) {
        this.id_pedido = id_pedido;
        this.fecha_hora = fecha_hora;
        this.id_mesa = id_mesa;
        this.id_mesero = id_mesero;
    }
      
    public Pedido() {
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public LocalDate getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(LocalDate fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public int getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(int id_mesa) {
        this.id_mesa = id_mesa;
    }

    public int getId_mesero() {
        return id_mesero;
    }

    public void setId_mesero(int id_mesero) {
        this.id_mesero = id_mesero;
    }

    void setfecha(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
