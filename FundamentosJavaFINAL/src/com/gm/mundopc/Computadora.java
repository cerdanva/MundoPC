/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.mundopc;

/**
 *
 * @author Cerdan Victor
 */
public class Computadora {
    private  final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorCompu;
    
    
    public Computadora() {
        this.idComputadora=++contadorCompu;
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this.idComputadora=++contadorCompu;
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora#:"+" Idcomputadora#:"+idComputadora+", Nombre#:"+nombre+"\n"+
               raton.toString()+teclado.toString()+monitor.toString();
                
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public String getNombre() {
        return nombre;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }
    
}
