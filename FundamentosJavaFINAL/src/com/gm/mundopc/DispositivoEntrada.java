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
public class DispositivoEntrada {
    private String tipoEntrada;
    private String marca;

    public DispositivoEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return " Tipo de Entrada#: "+tipoEntrada+", Marca#: "+marca;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }
       
    
}
