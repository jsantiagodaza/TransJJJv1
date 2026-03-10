
package view;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    
Scanner sc new Scanner(System.in); //<--usaremos scanner para leer, no usaremos bufered reader


    }
    static void menuPrincipal(){
        int opcion = 0;
    System.out.println("\n-----------------------------------------------");
    System.out.println("|           SISTEMAS DE BUSES              |");
    System.out.println("|------------------------------------------------|");
    System.out.println("| 1.  Gestión de pasajeros                      |");
    System.out.println("| 2. Gestión de Vehículos                       |");
    System.out.println("| 3. Gestión de ticket                               |");
    System.out.println("| 4. salir                                                    |");
    System.out.println("|------------------------------------------------|");
    System.out.println(" ");
    System.out.println("seleccione(1-4):");
    return (opcion);
}
  static void menuPersonas(){
  int opcionpasajero = 0;
  System.out.println("\n--------------------------------------------------");
    System.out.println("|     SISTEMAS DE PASAJEROS          |");
    System.out.println("|------------------------------------------------|");
    System.out.println("| 1.  Registrar de pasajeros                   |");
    System.out.println("| 2. Listar Pasajeros                               |");
    System.out.println("| 3. Buscar por cédula                            |");
    System.out.println("| 4. salir                                                    |");
    System.out.println("|------------------------------------------------|");
    System.out.println(" ");
    System.out.println("seleccione(1-4):");
    return (opcionpasajero);
  }  
  static void menuVehiculos(){
  int opcionvehiculos= 0;
  System.out.println("\n--------------------------------------------------");
    System.out.println("|                     VEHICULOS                     |");
    System.out.println("|------------------------------------------------|");
    System.out.println("| 1.  Registrar de vehículos                    |");
    System.out.println("| 2. Listar Vehículos                                |");
    System.out.println("| 3. Buscar por placa                              |");
    System.out.println("| 4. salir                                                    |");
    System.out.println("|------------------------------------------------|");
    System.out.println(" ");
    System.out.println("seleccione(1-4):");
    return (opcionvehiculos);
  }  
  static void menuTickets(){
  int opcionTicket= 0;
  System.out.println("\n--------------------------------------------------");
    System.out.println("|                         TICKETS                       |");
    System.out.println("|------------------------------------------------|");
    System.out.println("| 1. Crear Ticket                                      |");
    System.out.println("| 2. Listar Tickets                                    |");
    System.out.println("| 3. Buscar por código                            |");
    System.out.println("| 4. salir                                                    |");
    System.out.println("|------------------------------------------------|");
    System.out.println(" ");
    System.out.println("seleccione(1-4):");
    return (opcionTicket);
  }  
}
    


