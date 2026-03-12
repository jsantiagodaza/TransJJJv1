/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author 2jcue
 */
import dao1.dao1;
import model.Vehiculo;

import java.util.ArrayList;
import java.util.List;
public class VehiculoService {
    private dao1 dao;
    private List<Vehiculo> vehiculos;

    public VehiculoService() {
        this.dao = new dao1();
        this.vehiculos = new ArrayList<>(dao.cargarVehiculos()); // carga al inicio
    }
    
}
