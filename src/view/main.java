package view;

import clases.persona;
import clases.ticket;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    static ArrayList<persona> personas = new ArrayList<>();//array para personas
    static ArrayList<ticket> tickets = new ArrayList<>();//array para personas

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in); //<--usaremos scanner para leer, no usaremos bufered reader

    }

    static int menuPrincipal() {
        Scanner Sc = new Scanner(System.in);
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
        opcion = Sc.nextInt();
        return (opcion);
    }

    static int menuPersonas() {
        Scanner Sc = new Scanner(System.in);
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
        opcionpasajero = Sc.nextInt();
        return (opcionpasajero);
    }

    static int menuVehiculos() {
        Scanner Sc = new Scanner(System.in);
        int opcionvehiculos = 0;
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
        opcionvehiculos = Sc.nextInt();
        return (opcionvehiculos);
    }

    static int menuTickets() {
        Scanner Sc = new Scanner(System.in);
        int opcionTicket = 0;
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
        opcionTicket = Sc.nextInt();
        return (opcionTicket);
    }
    public static void registrarPasajero() { //<--Para registrar a los pasajeros
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la ID:");
        String id = sc.nextLine();

        System.out.println("Digite el Nombre:");
        String nombre = sc.nextLine();

        System.out.println("Digite el Apellido:");
        String apellido = sc.nextLine();

        System.out.println("Digite la edad:");
        int edad = sc.nextInt();
        
        
        System.out.println("Digite el telefono:");
        String telefono = sc.nextLine();

        persona persona = new persona(id,  nombre, apellido,  telefono);
        personas.add(persona);

        System.out.println("Ha sido registrado con éxito.");

    }
        public static void listarPersonas() { //<--esto lo que hace es recorrer la lista de los pasajeros para mostrar sus datos
        if (personas.isEmpty()) { //<--en caso de que esté vació
            System.out.println("No hay pasajeros registrados aún.");
            return;
        }

        for (persona p : personas) {
            System.out.println(p);
        }
    }
          public static void buscarPersonas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el ID del pasajero a buscar:");
        String id = sc.nextLine();

        for (persona p : personas) {
            if (p.getId() == id) {
                System.out.println("pasajero encontrado:");
                System.out.println(p);
                return;
            }
        }
          System.out.println("No se encontró un pasajero con esa identificación.");
}
}
