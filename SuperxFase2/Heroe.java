/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.Super_x;
import java.util.Random;

/**
 *
 * @author Hp
 */
public class Heroe extends Super_x {
    private int indice_bondad;
    
    public Heroe() {
    }

    public Heroe(int energia, String nombre, String pais_origen, String habilidad_ppal) {
        super(energia, nombre, pais_origen, habilidad_ppal);
    }

    public Heroe(int indice_bondad) {
        this.indice_bondad = indice_bondad;
    }

    //M�todo debilitar
    public int debilitar(int golpe) {       
        this.energia = golpe;        
        return this.energia;
    }

    
      

    public int getIndice_bondad() {
        return indice_bondad;
    }

    public void setIndice_bondad(int indice_bondad) {
        this.indice_bondad = indice_bondad;
    }
 public void atacar(Heroe oponente) {
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

