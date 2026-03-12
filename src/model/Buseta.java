/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 2jcue
 */
public class Buseta extends Vehiculo{
    
    private static final int CAPACIDAD = 19;
    private static final double TARIFA = 8000; 
   
    
    public Buseta(String placa, String ruta){
        super(placa, ruta);
        this.capacidadMaxima = CAPACIDAD;
    }
    
     @Override
    public double getTarifaBase() {
        return TARIFA;
    }
}
