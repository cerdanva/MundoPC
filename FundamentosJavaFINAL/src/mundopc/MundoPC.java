package mundopc;

import com.gm.mundopc.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class MundoPC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos los Objetos Raton, Teclado y Monitor
        Raton r1= new Raton("USB", "genius");
        Raton r2= new Raton("USB", "genius");
        Raton r3= new Raton("USB", "Logitech");
        Teclado t1= new Teclado("USB","genius");
        Teclado t2= new Teclado("USB","genius");
        Teclado t3= new Teclado("USB","Logitech");
        Monitor m1=new Monitor();
        Monitor m2=new Monitor();
        Monitor m3=new Monitor("Samsung",14);
        
        //Integramos los objetos a la computadora 
        Computadora pc1=new Computadora("PC1",m1,t1,r1);
        Computadora pc2=new Computadora("PC2",m2,t2,r2);
        Computadora pc3=new Computadora("PC3",m3,t3,r3);
        
        //Agregamos las computadoras a la orden
        Orden orden1=new Orden();
        
        orden1.agregarComputadora(pc1);
        orden1.agregarComputadora(pc2);
        orden1.agregarComputadora(pc3);
        
        orden1.mostrarOrden();
    }
    
}
