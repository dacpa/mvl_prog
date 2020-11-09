/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Random;

/**
 *
 * @author Hp
 */
public class Malvado extends Super_x {
    private int indice_maldad;

    public Malvado(int energia, String nombre, String pais_origen, String habilidad_ppal) {
        super(energia, nombre, pais_origen, habilidad_ppal);
    }

    public Malvado(int indice_maldad) {
        this.indice_maldad = indice_maldad;
    }
    public Malvado() {
    }

    public int getIndice_maldad() {
        return indice_maldad;
    }

    public void setIndice_maldad(int indice_maldad) {
        this.indice_maldad = indice_maldad;
     }
    
    //Modo de atacar Malvado
    
     public void atacar(Malvado oponente) {
         
        //genera un aleatorio entre el número 1 y el 50 (representa los niveles de ataque).
        Random randomNumeroGenerado = new Random();
        int daño = randomNumeroGenerado.nextInt(50);
                
        //quitar energia del oponente:
        oponente.especificaSalud(daño);
        System.out.println(oponente.getNombre() + "a recibido un ataque de " + daño + " nivel. Su energía ahora es  " + oponente.getEnergia());
    }
  
 public void especificaSalud(int dañoRecibido){
       if (this.getEnergia() - dañoRecibido <= 0) {
       this.setEnergia(0);
       this.setMurio(true);
       }
       else {
                   this.setEnergia(this.getEnergia() - dañoRecibido);
                  
                   }
}
 }
