/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvl.matematica;

//Tarea 25 - Módulo 3 - Seguimos reforzando conceptos básico.
//Alumno: Daniel Pozzo Ardizzi.

public class Calculadora25 {
 //atributos
    private float num1;
    private float num2;
    
    //constructor

    public Calculadora25() {
    }

    public Calculadora25(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    //métodos
    //los geter permiten mostrar la información (los atributos de la clase) y los seter permiten agregar o cambiar la información

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
    public float sumarNumeros (){
    //variable auxiliar que existe solo en el método calcularArea
      float sumar;
     sumar = (this.num1 + this.num2);
     return sumar;
    }
     public float restarNumeros (){
    //variable auxiliar que existe solo en el método calcularArea
      float restar;
     restar = (this.num1 - this.num2);
     return restar;
    }
    public float multiplicarNumeros (){
    //variable auxiliar que existe solo en el método calcularArea
      float multiplicar;
     multiplicar = (this.num1 * this.num2);
     return multiplicar;
    }
    public float dividirNumeros (){
    //variable auxiliar que existe solo en el método calcularArea
      float dividir;
     dividir = (this.num1 / this.num2);
     return dividir;
    }

}
