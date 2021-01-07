/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.mundopc;

/**
 *
 * @author alumno
 */
public class Monitor {
    private int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitor;

    public Monitor() {
    }

    public Monitor(String marca, double tamanio) {
        this.idMonitor = ++contadorMonitor;
        this.marca = marca;
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Monitor#:"+" IdMonitor#:"+idMonitor+","+" Marca#: "+marca+","+"Tamaño#:"+tamanio+"\n"; 
    }

    public String getMarca() {
        return marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    
    
}
