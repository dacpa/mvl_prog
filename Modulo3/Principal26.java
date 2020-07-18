/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvl.matematica;

//Importar únicamente la librería especifica de JOptionPane.
import javax.swing.JOptionPane;

//Alumno: Daniel Pozzo Ardizzi.

public class Principal26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    String nombreUsuario = JOptionPane.showInputDialog(null, "Ingrese su nombre","Información del Usuario", JOptionPane.WARNING_MESSAGE);
    JOptionPane.showMessageDialog(null,"Buen día " +nombreUsuario, "Usuario Identificado", JOptionPane.WARNING_MESSAGE);
   
            
    String primerNumero = JOptionPane.showInputDialog("Ingrese el primer número para calcular");
    String segundoNumero = JOptionPane.showInputDialog("Ingrese el segundo número para calcular");
    int numero1 = Integer.parseInt(primerNumero);
    int numero2 = Integer.parseInt(segundoNumero);
    
    System.out.println ("");
    System.out.println ("**********************************************");
    System.out.println ("Tarea 26 - Módulo 3  - Diálogo con el usuario.");
    System.out.println ("**********************************************");
    System.out.println ("");
    
    Calculadora26 c1=new Calculadora26(numero1,numero2);
    System.out.println("Calculadora");
    System.out.println ("");
    System.out.println("Los datos son:");
    System.out.println ("");
    System.out.println("Primer número = "+c1.getNum1()+".");
    System.out.println("Segundo número = "+c1.getNum2()+".");
    System.out.println("");
    
    JOptionPane.showMessageDialog(null,"El resultado de la suma es: "+c1.sumarNumeros());
    JOptionPane.showMessageDialog(null,"El resultado de la resta es: "+c1.restarNumeros());
    JOptionPane.showMessageDialog(null,"El resultado de la multiplicación es: "+c1.multiplicarNumeros());
   
            if(c1.dividirNumeros()==Float.POSITIVE_INFINITY || c1.dividirNumeros()==Float.NEGATIVE_INFINITY){
            System.out.println("ERROR!");
        }else{
            JOptionPane.showMessageDialog(null,"El resultado de la división es: " +c1.dividirNumeros());
           
         
    System.out.println ("");
    System.out.println ("");
    System.out.println ("Alumno: Daniel Pozzo Ardizzi.");
    System.out.println ("");
    System.out.println ("");
    }
    
 }

  
    }
     