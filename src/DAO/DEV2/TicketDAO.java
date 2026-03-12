/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.DEV2;


import clases.ticket;
import java.util.ArrayList;

public class TicketDAO {
    
    private ArrayList<ticket> tickets = new ArrayList<>();
    
      // CREATE
    public void guardar(ticket t) {
        tickets.add(t);
        System.out.println("Ticket guardado: " + t.getCodigoTicket());
    }
    
    // READ - Buscar por ID
    public ticket buscarPorId(String id) {
        for (ticket t : tickets) {
            if (t.getId().equals(id)) {
                return t;
            }
        }
        return null;
    }
    
    
    
    
    
}
