/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atenciondelresto;

/**
 *
 * @author lorei
 */
public class PedidoDetalle {
    
    private int id_pedidoDetalle;
    private short cantidad;
    private int id_pedido;
    private int id_producto;
    private double precio_unitario;
    
     public PedidoDetalle(int id_pedidoDetalle, short cantidad, int id_pedido, int id_producto, double precio_unitario) {
        this.id_pedidoDetalle = id_pedidoDetalle;
        this.cantidad = cantidad;
        this.id_pedido = id_pedido;
        this.id_producto = id_producto;
        this.precio_unitario = precio_unitario;
    }

    public PedidoDetalle(short cantidad, int id_pedido, int id_producto, double precio) {
        id_pedidoDetalle = -1;       
        this.cantidad = cantidad;
        this.id_pedido = id_pedido;
        this.id_producto = id_producto;
        this.precio_unitario = precio_unitario;
    }
     
     

    public PedidoDetalle() {
        id_pedidoDetalle = -1;
    }

    public int getId_PedidoDetalle() {
        return id_pedidoDetalle;
    }

    public void setId_pedidoDetalle(int id_pedidoDetalle) {
        this.id_pedidoDetalle = id_pedidoDetalle;
    }

    public short getCantidad() {
        return cantidad;
    }

    public void setCantidad(short cantidad) {
        this.cantidad = cantidad;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }
}
