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
        // Número aleatorio de 4 dígitos
        int numero = (int)(Math.random() * 9000) + 1000;
        return prefijo + "-" + numero;
    }
    
     
     
    
}
