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
    
       // READ - Buscar por código de ticket
    public ticket buscarPorCodigo(String codigo) {
        for (ticket t : tickets) {
            if (t.getCodigoTicket().equals(codigo)) {
                return t;
            }
        }
        return null;
    }
    
    
        // READ - Obtener todos
    public ArrayList<ticket> obtenerTodos() {
        return tickets;
    }
    
        // UPDATE
    public boolean actualizar(String id, ticket ticketActualizado) {
        for (int i = 0; i < tickets.size(); i++) {
            if (tickets.get(i).getId().equals(id)) {
                tickets.set(i, ticketActualizado);
                return true;
            }
        }
        return false;
    }
    
    
    
    
}
