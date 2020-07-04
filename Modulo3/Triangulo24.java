/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvl.geometria;

//Tarea 24 - Módulo 3 - Métodos de una clase.
//Alumno: Daniel Pozzo Ardizzi.

public class Triangulo24 {
    //atributos
    private float base;
    private float altura;
    
    //constructor
    public Triangulo24() {
    }

    public Triangulo24(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    //métodos (de la clase Triángulo)

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
     public float calcularAreaTriangulo24 (){
    //variable auxiliar que existe solo en el método calcularArea
      float resultado2;
     resultado2 = (this.base * this.altura)/2;
     return resultado2;
    }
    
}
