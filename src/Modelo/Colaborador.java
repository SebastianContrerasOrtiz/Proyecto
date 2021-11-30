/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author sebas
 */
public class Colaborador {
    
    private int codigoTrabajador;
    private String nombre;
    private String apellido;
    private Date fechaIngreso;
    private int sueldo;

    public Colaborador() {
    }

    public Colaborador(int codigoTrabajador, String nombre, String apellido, Date fechaIngreso, int sueldo) {
        this.codigoTrabajador = codigoTrabajador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaIngreso = fechaIngreso;
        this.sueldo = sueldo;
    }

    public int getCodigoTrabajador() {
        return codigoTrabajador;
    }

    public void setCodigoTrabajador(int codigoTrabajador) {
        this.codigoTrabajador = codigoTrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
    
   
    
    
    
}
