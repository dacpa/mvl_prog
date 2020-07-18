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
public class Bicicleta extends Vehiculo{
    private String tipo;
    private int antiguedad;

    public Bicicleta() {
    }

    public Bicicleta(String tipo, int antiguedad, String serie, String marca) {
        super(serie, marca);
        this.tipo = tipo;
        this.antiguedad = antiguedad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    
    
    
}
