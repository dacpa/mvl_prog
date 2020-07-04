/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvl.proyectolibreria;

//Tarea 23 - Módulo 3 - Netbeans IDE empezamos a codear.
//Alumno: Daniel Pozzo Ardizzi.

public class Regla {
        
    //atributos de la clase
    private String marca;
    private int longitud;
    private String material;

    //constructor vacío    
    public Regla() {
    }

    //constructor lleno
    public Regla(String marca, int longitud, String material) {
        this.marca = marca;
        this.longitud = longitud;
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
     public String mostrarReglaPorPantalla() {
        return "Regla{" + "marca= " + marca + ", longitud= " + longitud + ", material= " + material + '}';
    }
}
