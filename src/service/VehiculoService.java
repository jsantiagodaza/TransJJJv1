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
    
      public boolean registrarVehiculo(Vehiculo v) {
        if (existePlaca(v.getPlaca())) {
            System.out.println(" Ya existe un vehiculo con la placa: " + v.getPlaca());
            return false;
        }
        vehiculos.add(v);
        dao.guardarVehiculo(v);
        System.out.println(" Vehiculo registrado exitosamente.");
        return true;
    }
      
         public boolean cambiarEstado(String placa, boolean nuevoEstado) {
        Vehiculo v = buscarPorPlaca(placa);
        if (v == null) {
            System.out.println(" Vehiculo no encontrado.");
            return false;
        }
        v.setDisponible(nuevoEstado);
        dao.reescribirArchivo(vehiculos);
        System.out.println(" Estado actualizado: " + (nuevoEstado ? "Disponible" : "No disponible"));
        return true;
    }
         
         public Vehiculo buscarPorPlaca(String placa) {
        for (Vehiculo v : vehiculos) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                return v;
            }
        }
        return null;
    }

    // Listar todos
    public List<Vehiculo> listarVehiculos() {
        return vehiculos;
    }

    // Solo los disponibles con cupos
    public List<Vehiculo> getVehiculosDisponibles() {
        List<Vehiculo> disponibles = new ArrayList<>();
        for (Vehiculo v : vehiculos) {
            if (v.isDisponible() && v.tieneCupos()) {
                disponibles.add(v);
            }
        }
        return disponibles;
    }

    // Sumar un pasajero al vehículo (lo usa TicketService del Dev 2)
    public boolean agregarPasajero(String placa) {
        Vehiculo v = buscarPorPlaca(placa);
        if (v == null || !v.tieneCupos()) return false;
        v.agregarPasajero();
        dao.reescribirArchivo(vehiculos);
        return true;
    }

    private boolean existePlaca(String placa) {
        return buscarPorPlaca(placa) != null;
    }
         
         
    
}
