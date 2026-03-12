/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao1;

/**
 *
 * @author 2jcue
 */
import model.Buseta;
import model.Bus;
import model.MicroBus;
import model.Vehiculo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class dao1 {
        private static final String ARCHIVO_BUS     = "bus.txt";
    private static final String ARCHIVO_BUSETA  = "buseta.txt";
    private static final String ARCHIVO_MICROBUS = "microbus.txt";

    // Guarda UN vehículo al final de su archivo correspondiente
    public void guardarVehiculo(Vehiculo v) {
        String archivo = getArchivo(v);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
            bw.write(v.toArchivoString());
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error al guardar vehículo: " + e.getMessage());
        }
    }

}
