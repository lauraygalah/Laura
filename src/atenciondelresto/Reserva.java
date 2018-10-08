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
public class Reserva {
    private int id_reserva;
    private String nombre;
    private int dni;
    private LocalDate fecha_hora;
    private short estado;
    private int id_mesa;

    public Reserva() {
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(LocalDate fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    public int getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(int id_mesa) {
        this.id_mesa = id_mesa;
    }

    public Reserva(int id_reserva, String nombre, int dni, LocalDate fecha_hora, short estado, int id_mesa) {
        this.id_reserva = id_reserva;
        this.nombre = nombre;
        this.dni = dni;
        this.fecha_hora = fecha_hora;
        this.estado = estado;
        this.id_mesa = id_mesa;
    }
    
    
}
