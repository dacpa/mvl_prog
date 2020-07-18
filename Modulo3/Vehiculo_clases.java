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
public class Vehiculo_clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creamos un objeto v de la clase Vehiculo con constructor vacio
        Vehiculo v=new Vehiculo();
        v.setMarca("Volkswagen");
        v.setSerie("Y154WR5844EGI");
        //Creamos un objeto v2 de la clase Vehiculo con constructor lleno
        Vehiculo v2=new Vehiculo ("Ford","U55DHHGD5485EE");
        //Creamos un objeto b de la clase Bicicleta con el constructor vacio
        Bicicleta b=new Bicicleta();
        b.setMarca("Bianchi");
        b.setTipo("carrera");
        b.setAntiguedad(5);
        //Creamos un objeto m de la clase Moto con el constructor vacio
        Moto m=new Moto ();
        m.setMarca("Hamaya");
        m.setSerie("PUH5854D6LJ");
        m.setUso("ciudad");
        m.setFabricante("Japón");
        //Creamos un objeto a de la clase Auto con el constructor vacio
        Auto a=new Auto ();
        a.setMarca("Ford");
        a.setSerie("JKEYUGD558455D");
        a.setColor("rojo");
        a.setRodado(16);
       
        System.out.println("Los datos del vehículo son:");
        System.out.println ("");
        System.out.println("Marca:"+v.getMarca());
        System.out.println("Serie: "+v.getSerie());
        System.out.println ("");
        System.out.println ("");
        System.out.println("Los datos de la bicicleta son:");
        System.out.println ("");
        System.out.println("Marca:"+b.getMarca());
        System.out.println("Tipo: "+b.getTipo());
        System.out.println("Antigüedad: "+b.getAntiguedad());
        System.out.println ("");
        System.out.println ("");
        System.out.println("Los datos del moto son:");
        System.out.println ("");
        System.out.println("Marca:"+m.getFabricante());        
        System.out.println("Serie: "+m.getSerie());
        System.out.println("Uso: "+m.getUso());
        System.out.println("Fabricante: "+m.getFabricante());
        System.out.println ("");
        System.out.println ("");
        System.out.println("Los datos del auto son:");
        System.out.println ("");
        System.out.println("Marca:"+a.getMarca());
        System.out.println("Serie: "+a.getSerie());
        System.out.println("Color: "+a.getColor());
        System.out.println("Rodado: "+a.getRodado());
        
    }
    
}
