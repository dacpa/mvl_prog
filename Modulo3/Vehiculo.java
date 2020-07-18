/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvl.vehiculo_clases;

/**
 *
 * @author Hp
 */
public class Vehiculo {
    private String serie;
    private String marca;

    public Vehiculo() {
    }

    public Vehiculo(String serie, String marca) {
        this.serie = serie;
        this.marca = marca;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
