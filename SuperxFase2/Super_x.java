/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Random;

/*
1)
Atributos clase Super_x (caracterísiticas individuales que diferencian un objeto de otro
y determinan su apariencia, estado u otras cualidades)
*/
public class Super_x {
    int energia;
    private String nombre;
    private String pais_origen;
    private String habilidad_ppal;
    private boolean murio;
    
      /*
    2) Constructor
     (un constructor es un método especial de una clase que se llama automáticamente
    siempre que se declara un objeto de esa clase. Su función es inicializar el
    objeto y sirve para asegurarnos que los objetos siempre contengan valores válidos).
    */
    //Constructor vacío
    public Super_x() {
    }
    //Constructor lleno

    public Super_x(int energia, String nombre, String pais_origen, String habilidad_ppal) {
        this.energia = energia;
        this.nombre = nombre;
        this.pais_origen = pais_origen;
        this.habilidad_ppal = habilidad_ppal;
        System.out.println(this.nombre + " se ha presentado a la batalla con energía al " + this.energia +"%.");
    }
            
    /*
    4)
    */
                  
  /*
    3)
    Métodos para asignar valores a los atributos y/o retornar (son devueltos) valores de los atributos
    (un método es un conjunto de instrucciones definidas dentro de una clase, que realizan 
    una determinada tarea y a las que podemos invocar mediante un nombre).
    */   
   //Método get del atributo energia (devuelve energia) 
    
    
   

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais_origen() {
        return pais_origen;
    }

    public void setPais_origen(String pais_origen) {
        this.pais_origen = pais_origen;
    }

    public String getHabilidad_ppal() {
        return habilidad_ppal;
    }

    public void setHabilidad_ppal(String habilidad_ppal) {
        this.habilidad_ppal = habilidad_ppal;
    }

    public boolean isMurio() {
        return murio;
    }

    public void setMurio(boolean murio) {
        this.murio = murio;
    }

//Metodo para generar numeros aleatorio
/** 
* 
* @param minimo
* @param maximo 
  @return
  */
  public static int generarNumeroAleatorio(int minimo,int maximo) { 
     int num =(int)Math.floor(Math.random()*((maximo+1)-minimo)+minimo);  
     return num; 
   } 

//Merodo debilidatat 
public int debelitar (int golpe){
   this.energia-= golpe;
   return this.energia;
}
}   

