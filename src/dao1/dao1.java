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

  
    public void guardarVehiculo(Vehiculo v) {
        String archivo = getArchivo(v);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
            bw.write(v.toArchivoString());
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error al guardar vehículo: " + e.getMessage());
        }
    }
    
    public List<Vehiculo> cargarVehiculos(){
      List<Vehiculo> lista = new ArrayList<>();
       lista.addAll(cargarDesdeArchivo(ARCHIVO_BUS, "Bus"));
       lista.addAll(cargarDesdeArchivo(ARCHIVO_BUSETA, "Buseta"));
        lista.addAll(cargarDesdeArchivo(ARCHIVO_MICROBUS, "MicroBus"));
        return lista;
    }
    
    private List<Vehiculo> cargarDesdeArchivo(String archivo, String tipo) {
        List<Vehiculo> lista = new ArrayList<>();
        File f = new File(archivo);
        if (!f.exists()) return lista;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) continue;
               
                String[] campos = linea.split(";");
                String placa      = campos[0];
                String ruta       = campos[1];
                int pasajeros     = Integer.parseInt(campos[2]);
                boolean disponible = Boolean.parseBoolean(campos[3]);

                Vehiculo v = switch (tipo) {
                    case "Bus"     -> new Bus(placa, ruta);
                    case "Buseta"  -> new Buseta(placa, ruta);
                    default        -> new MicroBus(placa, ruta);
                };
                v.setPasajerosActuales(pasajeros);
                v.setDisponible(disponible);
                lista.add(v);
            }
        } catch (IOException e) {
            System.out.println("Error al cargar " + archivo + ": " + e.getMessage());
        }
        return lista;
    }
    
    
    }
    
    


