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
public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrden;
    private static int contadorCompu;
    private static final int maxCompu=14;

    public Orden() {
        this.idOrden=contadorOrden++;
        computadoras=new Computadora[maxCompu];
    }
    
    public void agregarComputadora(Computadora compu){
        if(contadorCompu<maxCompu){
            computadoras[contadorCompu++]=compu;
        }
        else{
             System.out.println("supera la cantidad maxima de computadoras "+maxCompu);
        }
    }
    public void mostrarOrden(){
        System.out.println("Orden#:"+ idOrden);
        System.out.println("Productos de la orden " +idOrden+":");
        for(int i =0; i <contadorCompu; i++) {
            System.out.println(computadoras[i]);
    
    }
}

}