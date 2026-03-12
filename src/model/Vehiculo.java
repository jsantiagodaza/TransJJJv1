/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 2jcue
 */
public abstract class Vehiculo {
  

    protected String placa;
    protected String ruta;
    protected int capacidadMaxima;
    protected int pasajerosActuales;
    protected boolean disponible;
    
    public Vehiculo(String placa, String ruta ){
        this.placa = placa;
        this.ruta = ruta;
        this.pasajerosActuales = 0;
        this.disponible = true;
    }

   public abstract double getTarifaBasa();
   
   public boolean tieneCupos(){
       return pasajerosActuales < capacidadMaxima;
   }
    
   public int getCuposDisponibles(){
       return capacidadMaxima - pasajerosActuales;
   }
   
   public void agregarPasajeros(){
       if (tieneCupos()){
           pasajerosActuales++;
       }
   }
}
