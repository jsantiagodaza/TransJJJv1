package view;

import clases.persona;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    static ArrayList<persona> personas = new ArrayList<>();//array para personas

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
}
