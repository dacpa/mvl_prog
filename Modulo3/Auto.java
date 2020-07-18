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
public class Auto extends Vehiculo{
    private String color;
    private int rodado;

    public Auto() {
    }

    public Auto(String color, int rodado, String serie, String marca) {
        super(serie, marca);
        this.color = color;
        this.rodado = rodado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRodado() {
        return rodado;
    }

    public void setRodado(int rodado) {
        this.rodado = rodado;
    }


   
    }
    
    

