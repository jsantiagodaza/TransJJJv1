/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SERVICES.DEV2;

import clases.persona;
import dao.PersonaDAO;
import java.util.ArrayList;
    

public class PersonaServices {
    
     private PersonaDAO personaDAO = new PersonaDAO();
     
         // Registrar con validaciones
        public String registrarPersona(String id, String nombre, String apellido, String telefono, int edad) {
        // Validar que no esté vacío
        if (id == null || id.trim().isEmpty()) {
            return "Error: La ID no puede estar vacía";
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            return "Error: El nombre no puede estar vacío";
        }
        
        // Validar que no exista
        if (personaDAO.existe(id)) {
            return "Error: Ya existe una persona con esa ID";
        }
        
        // Crear y guardar
        persona nueva = new persona(id, nombre, apellido, telefono);
        personaDAO.guardar(nueva);
        
        return "Persona registrada con éxito";
    }
    
    

    
    
    
    
    
    
    
}
