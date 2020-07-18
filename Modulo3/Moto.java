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
public class Moto extends Vehiculo{
    private String uso;
    private String fabricante;

    public Moto() {
    }

    public Moto(String uso, String fabricante, String serie, String marca) {
        super(serie, marca);
        this.uso = uso;
        this.fabricante = fabricante;
    }

        public String getUso() {
        return uso;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    
    
    
}
