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
    
    private int pedidodetalle;
    private short cantidad;
    private int id_pedido;
    private int id_producto;
    private float precio;

    public PedidoDetalle() {
    }

    public int getPedidodetalle() {
        return pedidodetalle;
    }

    public void setPedidodetalle(int pedidodetalle) {
        this.pedidodetalle = pedidodetalle;
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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public PedidoDetalle(int pedidodetalle, short cantidad, int id_pedido, int id_producto, float precio) {
        this.pedidodetalle = pedidodetalle;
        this.cantidad = cantidad;
        this.id_pedido = id_pedido;
        this.id_producto = id_producto;
        this.precio = precio;
    }
    
}
