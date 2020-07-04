/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvl.matematica;

//Tarea 25 - Módulo 3 - Seguimos reforzando conceptos básico.
//Alumno: Daniel Pozzo Ardizzi.

public class Principal25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println ("");
    System.out.println ("************************************************************");
    System.out.println ("Tarea 25 - Módulo 3 - Seguimos reforzando conceptos básicos.");
    System.out.println ("************************************************************");
    System.out.println ("");
    
    Calculadora25 c1=new Calculadora25(15,10);
    System.out.println("Calculadora");
    System.out.println ("");
    System.out.println("Los datos son:");
    System.out.println ("");
    System.out.println("Primer número = "+c1.getNum1()+".");
    System.out.println("Segundo número = "+c1.getNum2()+".");
    System.out.println("");
    System.out.println("1 - El resultado de la suma es: "+c1.sumarNumeros()+".");
    System.out.println("2 - El resultado de la resta es: "+c1.restarNumeros()+".");
    System.out.println("3 - El resultado de la multiplicación es: "+c1.multiplicarNumeros()+".");
    System.out.print("4 - El resultado de la división es: ");
            if(c1.dividirNumeros()==Float.POSITIVE_INFINITY || c1.dividirNumeros()==Float.NEGATIVE_INFINITY){
            System.out.println("ERROR!");
        }else{
            System.out.println(c1.dividirNumeros()+".");
         
    System.out.println ("");
    System.out.println ("");
    System.out.println ("Alumno: Daniel Pozzo Ardizzi.");
    System.out.println ("");
    System.out.println ("");
    }
    }

     
}