package ec.edu.espe.HOManagement.model;

import java.util.Scanner;
/**
 *
 * @author Code Warriors, DCCO-ESPE
 */
public class Distributor {
    private String name;
    private String product;
    private String contactInfo;
    private String request;
    Scanner sc = new Scanner(System.in);
    
    public static void menu() {
        try (Scanner scanner = new Scanner(System.in)) {
            int option;

            do {
                System.out.println("----- Menú -----");
                System.out.println("1. Realizar orden");
                System.out.println("2. Cambiar informacion de un Distribuidor");
                System.out.println("3. Agregar producto a la orden");
                System.out.println("4. Cambiar orden");
                System.out.println("5. Salir");
                System.out.print("Ingrese la opción: ");
                option = scanner.nextInt();

                switch (option) {
                    case 1 -> placeOrder();
                    case 2 -> updateContactInfo();
                    case 3 -> updateRequest();
                    case 4 -> changeRequest();
                    case 5 -> System.out.println("Saliendo del programa...");
                    default -> System.out.println("Opción inválida");
                }
            } while (option != 5);
        }
 
    }
    public static void placeOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to make a new order?");
        System.out.println("Insert the distributor name: ");
        String name = sc.nextLine();
        System.out.println("This is the contact: " + name);
    }
    
    public static void updateContactInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Whose contact information do you want to change?");
        String name = sc.nextLine();
    }

       public static void updateRequest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What product do you want to add?");
        String product = sc.nextLine();
    }
    
      public static void changeRequest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What product do you want to change?");
        String product1 = sc.nextLine();
        System.out.println("What item do you want instead?");
        String product2 = sc.nextLine();
        System.out.println("The new item for request is: " + product2);
    }
   
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @return the contactInfo
     */
    public String getContactInfo() {
        return contactInfo;
    }

    /**
     * @param contactInfo the contactInfo to set
     */
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
