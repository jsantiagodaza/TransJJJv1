
package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class persona {
     private String id;
    private String nombre;
    private String apellido;
    private String telefono;
    private int edad;
    
Scanner Sc = new Scanner(System.in);
    public persona(String  id, String nombre, String apellido,  String telefono) {
        this.id = id;
        this.nombre = nombre;
 
        this.telefono = telefono;
    }

    public persona() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
  @Override
   public String toString(){
     
       return "Pasajero{"+
               "ID:" + id +
               ", Nombre:" + nombre + "\n " +
               ", Apellido: " + apellido + "\n " + 
               ", Edad: " + edad+"\n-------------";
}

 
}
