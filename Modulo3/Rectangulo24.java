/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvl.geometria;

//Tarea 24 - Módulo 3 - Métodos de una clase.
//Alumno: Daniel Pozzo Ardizzi.

public class Rectangulo24 {
    //atributos
    private int base;
    private int altura;
    
    //constructor (única forma de crear objetos de tipo rectángulo)

    public Rectangulo24() {
    }

    public Rectangulo24(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    //métodos (de la clase Rectangulo)

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
  }
  
    public int calcularArea (){
    //variable auxiliar que existe solo en el método calcularArea
      int resultado;
     resultado = this.base * this.altura;
     return resultado;
    //otra opción de calcular el resultado
    //return this.base * this.altura;
    }
    
}
