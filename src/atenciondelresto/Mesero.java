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
public class Mesero {
    private int id_mesero;
    private String nombre;
    private int dni;

    public Mesero(int id_mesero, String nombre, int dni) {

        this.id_mesero = id_mesero;
        this.nombre = nombre;
        this.dni = dni;
    }

    public Mesero(String nombre, int dni) {
        
        this.nombre = nombre;
        this.dni = dni;
    }
     
    public Mesero() {
        id_mesero = -1;
    }

    public int getId_mesero() {
        return id_mesero;
    }

    public void setId_mesero(int id_mesero) {
        this.id_mesero = id_mesero;
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
}
