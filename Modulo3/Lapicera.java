/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvl.proyectolibreria;

//Tarea 23 - Módulo 3 - Netbeans IDE empezamos a codear.
//Alumno: Daniel Pozzo Ardizzi.
 
public class Lapicera {
    
    //atributos de la clase
    private String marca;
    private int modelo;
    private String color;

    //constructor
    public Lapicera(String marca, int modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    //constructor vació
    public Lapicera() {
    }

    //métodos
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

      
    //no siempre es necesario, uno se puede armar sus propias salidas
    @Override
    public String toString() {
        return "Lapicera{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + '}';
    }
    //tengo la opción de modificar el método. Lo cual también se debe hacer en el Principal.
    public String mostrarPorPantalla() {
        return "Lapicera{" + "marca= " + marca + ", modelo= " + modelo + ", color= " + color + '}';
    }
    
}
