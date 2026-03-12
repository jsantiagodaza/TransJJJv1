/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 2jcue
 */
public class Bus extends Vehiculo{
    
    private static final int CAPACIDAD = 45;
    private static final double TARIFA = 15000;
    
    public Bus(String placa, String ruta){
        super(placa, ruta);
        this.capacidadMaxima = CAPACIDAD;
    }
    
    @Override
    public double getTarifaBase() {
        return TARIFA;
    }
}
