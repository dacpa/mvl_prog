/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvl.proyectolibreria;

//Tarea 23 - Módulo 3 - Netbeans IDE empezamos a codear.
//Alumno: Daniel Pozzo Ardizzi.

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1er forma de mostrar la información
        System.out.println ("Tarea 23 - Módulo 3 - Netbeans IDE empezamos a codear.");
        System.out.println ("");
        System.out.println("Liberia MVL");
        Lapicera lapi1=new Lapicera("Bic",3,"Azul");
        Lapicera lapi2=new Lapicera("Faber Castel",32,"Azul");
        //2da forma de mostrar la información
        System.out.println(lapi1.toString());
        System.out.println(lapi2.toString());
        //3er forma de mostrar la información. Modifico el método
        System.out.println(lapi1.mostrarPorPantalla());
        System.out.println(lapi2.mostrarPorPantalla());
        
        Lapicera lapi3=new Lapicera();
        lapi3.setMarca("Pilot");
        lapi3.setModelo(78);
        lapi3.setColor("Rojo");
        //Opciones
        System.out.println(lapi3.toString());
               
        System.out.println(lapi3.getMarca());
        //para la concatenación se usa el signo + / La información se muestra desde el Principal
        System.out.println("La marca de la lapicera 3 es: "+ lapi3.getMarca() + ". Modelo nro. " + lapi3.getModelo() + ". Color: "+ lapi3.getColor());
        //cambiando el método personalizado
         System.out.println(lapi3.mostrarPorPantalla());
        System.out.println (""); 
        Regla reg1=new Regla ();
        reg1.setMarca("Kandor");
        reg1.setLongitud(30);
        reg1.setMaterial("Madera");
        
        System.out.println(reg1.mostrarReglaPorPantalla());
        
        System.out.println("La marca de la regla es: "+ reg1.getMarca() + ". Longitud (cm): " + reg1.getLongitud() + ". Material: "+ reg1.getMaterial());
        System.out.println ("");
        System.out.println ("");
        System.out.println ("Alumno: Daniel Pozzo Ardizzi.");
    
    }
    
}
