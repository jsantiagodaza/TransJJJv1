/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SERVICES.DEV2;

import clases.ticket;
import dao.TicketDAO;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.UUID;


public class TicketServices {
    
     private TicketDAO ticketDAO = new TicketDAO();
     
     
         // Generar código único para ticket
         private String generarCodigoTicket(String tipoVehiculo) {
        String prefijo = "BUS";
        if (tipoVehiculo != null && tipoVehiculo.toLowerCase().contains("micro")) {
            prefijo = "MBUS";
        }
        // Número aleatorio de 4 dígitos para precio
        int numero = (int)(Math.random() * 9000) + 1000;
        return prefijo + "-" + numero;
    }
         
          
        // Registrar ticket
        public String registrarTicket(String empresa, LocalDate fecha, LocalTime hora, 
                                   String idVehiculo, float precio, String tipoVehiculo) {
        // Validaciones básicas
        if (precio <= 0) {
            return "Error: El precio debe ser mayor a cero";
        }
        
        // Generar ID único y código
        String id = UUID.randomUUID().toString();
        String codigoTicket = generarCodigoTicket(tipoVehiculo);
        
        // Crear y guardar
        ticket nuevo = new ticket(id, empresa, codigoTicket, fecha, hora, idVehiculo, precio);
        ticketDAO.guardar(nuevo);
        
        return "Ticket creado con éxito. Código: " + codigoTicket;
    }
        
         // Buscar ticket
        public ticket buscarTicket(String id) {
        return ticketDAO.buscarPorId(id);
    }
            public ticket buscarPorCodigo(String codigo) {
        return ticketDAO.buscarPorCodigo(codigo);
    }
            
         // Listar todos
        public ArrayList<ticket> listarTickets() {
        return ticketDAO.obtenerTodos();
    }
   
    
    
     
     
    
}
