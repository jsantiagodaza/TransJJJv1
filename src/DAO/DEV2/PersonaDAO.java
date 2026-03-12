/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.DEV2;

import clases.persona;
import java.util.ArrayList;



public class PersonaDAO {
   
    private ArrayList<persona> personas = new ArrayList<>(); 
    
     
    // CREATE - Guardar una persona
    public void guardar(persona p) {
        personas.add(p);
        System.out.println("Persona guardada: " + p.getNombre());
    }
    
    
        // READ - Buscar por ID
    public persona buscarPorId(String id) {
        for (persona p : personas) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null; // No encontrado
    }
    
        // READ - Obtener todas
    public ArrayList<persona> obtenerTodas() {
        return personas;
    }
    
    
    
    
}
