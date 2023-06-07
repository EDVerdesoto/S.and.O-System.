package ec.edu.espe.HOManagement.view;

import ec.edu.espe.HOManagement.model.Distributor;
import ec.edu.espe.HOManagement.model.ProductItem;
import ec.edu.espe.HOManagement.model.Report;
import java.util.Scanner;

/**
 *
 * @author Code Warriors, DCCO-ESPE
 */



public class InputMenu {
    public static void menu() {
        try (Scanner scanner = new Scanner(System.in)) {
            int option;

            do {
                System.out.println("----- Menú -----");
                System.out.println("1. Crear usuarios");
                System.out.println("2. Ingresar productos");
                System.out.println("3. Vender productos");
                System.out.println("4. Ver reporte de ventas");
                System.out.println("5. Contactos de proveedores");
                System.out.println("6. Salir");
                System.out.print("Ingrese la opción: ");
                option = scanner.nextInt();

                switch (option) {
                    case 1 -> createUsers();
                    case 2 -> enterProducts();
                    case 3 -> sellProducts();
                    case 4 -> viewSalesReport();
                    case 5 -> supplierContacts();
                    case 6 -> System.out.println("Saliendo del programa...");
                    default -> System.out.println("Opción inválida");
                }
            } while (option != 6);
        }
    }

    public static void createUsers() {
        System.out.println("Se han creado los usuarios");
    }

    public static void enterProducts() {
        ProductItem.item();
        System.out.println("Se han ingresado los productos");
    }

    public static void sellProducts() {
      
        System.out.println("Se han vendido los productos");
    }
    public static void viewSalesReport() {
        
        System.out.println("Se muestra el reporte de ventas");
}

    public static void supplierContacts() {
        Distributor.menu();
    }
}

