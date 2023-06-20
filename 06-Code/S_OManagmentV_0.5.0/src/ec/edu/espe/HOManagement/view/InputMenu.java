package ec.edu.espe.HOManagement.view;

import ec.edu.espe.HOManagement.model.Distributor;
import ec.edu.espe.HOManagement.model.ProductItem;


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

            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                scanner.nextLine();

                switch (option) {
                    case 1:
                        createUsers();
                        break;
                    case 2:
                        enterProducts();
                        break;
                    case 3:
                        sellProducts();
                        break;
                    case 4:
                        viewSalesReport();
                        break;
                    case 5:
                        supplierContacts();
                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida");
                }
            } else {
                System.out.println("Opción inválida");
                scanner.nextLine(); 
                option = 0;
            }
        } while (option != 6);
    }
}


    public static void createUsers() {
        System.out.println("working");
    }

     public static void enterProducts() {
        ProductItem productItem = new ProductItem();
        productItem.enterProductItem();
        productItem.saveToJson();
    }

    public static void sellProducts() {
      
        System.out.println("working");
    }
    public static void viewSalesReport() {
        
        System.out.println("working");
}

    public static void supplierContacts() {
        Distributor.menu();
    }
}

