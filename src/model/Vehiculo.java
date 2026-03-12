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

   public abstract double getTarifaBase();
   
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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getPasajerosActuales() {
        return pasajerosActuales;
    }

    public void setPasajerosActuales(int pasajerosActuales) {
        this.pasajerosActuales = pasajerosActuales;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
   public String toArchiveString(){
       return placa + ";" + ruta + ";" + pasajerosActuales + ";" + disponible;
   }

    public void imprimirDetalle() {
        System.out.println("┌─────────────────────────────────────┐");
        System.out.println("  Tipo     : " + this.getClass().getSimpleName());
        System.out.println("  Placa    : " + placa);
        System.out.println("  Ruta     : " + ruta);
        System.out.println("  Capacidad: " + capacidadMaxima);
        System.out.println("  Cupos    : " + getCuposDisponibles());
        System.out.println("  Tarifa   : $" + (int) getTarifaBase());
        System.out.println("  Estado   : " + (disponible ? "Disponible" : "No disponible"));
        System.out.println("└─────────────────────────────────────┘");
    }
}
