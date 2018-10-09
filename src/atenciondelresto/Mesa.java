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
public class Mesa {
    private int id_mesa;
    private int nro_mesa;
    private int capacidad;
    private boolean estado;

    public Mesa(int id_mesa, int nro_mesa, int capacidad, boolean estado) {
        this.id_mesa = id_mesa;
        this.nro_mesa = nro_mesa;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public Mesa(int nro_mesa, int capacidad, boolean estado) {
        id_mesa=-1;
        this.nro_mesa = nro_mesa;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public Mesa() {
        id_mesa=-1;
    }

    public int getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(int id_mesa) {
        this.id_mesa = id_mesa;
    }

    public int getNro_mesa() {
        return nro_mesa;
    }

    public void setNro_mesa(int nro_mesa) {
        this.nro_mesa = nro_mesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
