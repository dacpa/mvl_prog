/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvl.geometria;

//Tarea 24 - Módulo 3 - Métodos de una clase.
//Alumno: Daniel Pozzo Ardizzi.

public class Principal24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    //los geter permiten mostrar la información (los atributos de la clase) y los seter permiten agregar o cambiar la información
    System.out.println ("");
    System.out.println ("*******************************************");
    System.out.println ("Tarea 24 - Módulo 3 - Métodos de una clase.");
    System.out.println ("*******************************************");
    System.out.println ("");
    Rectangulo24 r1=new Rectangulo24(4,3);
    System.out.println("Los datos del rectángulo r1");
    System.out.println("Base="+r1.getBase());
    System.out.println("Altura="+r1.getAltura());
    System.out.println("");
    r1.setAltura(2);
    System.out.println("Los datos del rectángulo r1");
    System.out.println("Base="+r1.getBase());
    System.out.println("Altura="+r1.getAltura());
    System.out.println ("");
    System.out.println("El área de r1 es: "+r1.calcularArea()+" cm.");
    System.out.println ("------------------------------------------");
    System.out.println ("");
    Triangulo24 t1=new Triangulo24(25,14);
    System.out.println("Los datos del triángulo equilátero t1 son:");
    System.out.println ("");
    System.out.println("Base = "+t1.getBase()+" cm.");
    System.out.println("Altura = "+t1.getAltura()+" cm.");
    System.out.println("");
    System.out.println("El área del triángulo equilátero es: "+t1.calcularAreaTriangulo24()+" cm.");
    System.out.println ("");
    System.out.println ("");
    System.out.println ("Alumno: Daniel Pozzo Ardizzi.");
    System.out.println ("");
    System.out.println ("");
   
    }
}
