package ec.edu.espe.HOManagement.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Code Warriors, DCCO-ESPE
 */


public class Distributor {
    private String name;
    private String product;
    private String contactInfo;
    private int id;
    private String phoneNumber;
    private String email;


    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        Distributor distributor = new Distributor();

        int option;
        do {
            System.out.println("----- Menú -----");
            System.out.println("1. Ver informacion de los distribuidores");
            System.out.println("2. Cambiar información de un Distribuidor");
            System.out.println("3. Agregar producto a la orden");
            System.out.println("4. Cambiar orden");
            System.out.println("5. Ingresar distribuidor");
            System.out.println("6. Salir");
            System.out.print("Ingrese la opción: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    printDistributors(distributor);
                    break;
                case 2:
                    updateContactInfo(distributor);
                    break;
                case 3:
                    updateRequest(distributor);
                    break;
                case 4:
                    changeRequest(distributor);
                    break;
                case 5:
                    addDistributor(distributor);
                    break;
                case 6:
                    System.out.println("Regresando al menú principal...");
                    return;
                default:
                    System.out.println("Opción inválida");
            }
        } while (option != 6);

        scanner.close();
    }

    public static void addDistributor(Distributor distributor) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del distribuidor: ");
        String name = scanner.nextLine();

        boolean validName = false;
        while (!validName) {
            if (containsDigits(name)) {
                System.out.println("El nombre ingresado es inválido. No puede contener números. Intente nuevamente.");
                name = scanner.nextLine();
            } else {
                validName = true;
            }
        }

        int id = 0;
        boolean validId = false;
        while (!validId) {
            try {
                System.out.println("Ingrese la ID del distribuidor: ");
                String idString = scanner.nextLine();
                if (!idString.matches("\\d+")) {
                    throw new IllegalArgumentException("La ID ingresada es inválida. Debe ser un número entero.");
                }
                id = Integer.parseInt(idString);
                validId = true;
            } catch (NumberFormatException e) {
                System.out.println("La ID ingresada es inválida. Intente nuevamente.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        String contactInfo = "";
        boolean validContactInfo = false;
        while (!validContactInfo) {
            try {
                System.out.println("Ingrese la información de contacto del distribuidor: ");
                contactInfo = scanner.nextLine();
                if (contactInfo.isEmpty()) {
                    throw new IllegalArgumentException("La información de contacto no puede estar vacía.");
                }
                validContactInfo = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        String phoneNumber = "";
        boolean validPhoneNumber = false;
        while (!validPhoneNumber) {
            try {
                System.out.println("Ingrese el número de contacto del distribuidor: ");
                phoneNumber = scanner.nextLine();
                if (phoneNumber.isEmpty()) {
                    throw new IllegalArgumentException("El número de contacto no puede estar vacío.");
                }
                validPhoneNumber = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        String email = "";
        boolean validEmail = false;
        while (!validEmail) {
            try {
                System.out.println("Ingrese el correo electrónico del distribuidor: ");
                email = scanner.nextLine();
                if (email.isEmpty()) {
                    throw new IllegalArgumentException("El correo electrónico no puede estar vacío.");
                }
                validEmail = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        distributor.setName(name);
        distributor.setID(id);
        distributor.setContactInfo(contactInfo);
        distributor.setPhoneNumber(phoneNumber);
        distributor.setEmail(email);

        distributor.saveToJson("distributor.json");

        System.out.println("Distribuidor agregado: " + distributor.getName());
    }

    private static boolean containsDigits(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static void printDistributors(Distributor distributor) {
    Gson gson = new Gson();

    try {
        FileReader fileReader = new FileReader("distributor.json");
        distributor = gson.fromJson(fileReader, Distributor.class);

        System.out.println("Información de los distribuidores:");
        System.out.println("Nombre: " + distributor.getName());
        System.out.println("ID: " + distributor.getID());
        System.out.println("Información de contacto: " + distributor.getContactInfo());
        System.out.println("Número de contacto: " + distributor.getPhoneNumber());
        System.out.println("Correo electrónico: " + distributor.getEmail());

        fileReader.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}


    public static void updateContactInfo(Distributor distributor) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whose contact information do you want to change?");
        String name = scanner.nextLine();

        distributor.setName(name);
        distributor.saveToJson("distributor.json");
    }

    public static void updateRequest(Distributor distributor) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What product do you want to add?");
        String product = scanner.nextLine();

        distributor.setProduct(product);
        distributor.saveToJson("Order.json");
    }

    public static void changeRequest(Distributor distributor) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What product do you want to change?");
        String product1 = scanner.nextLine();
        System.out.println("What item do you want instead?");
        String product2 = scanner.nextLine();
        System.out.println("The new item for request is: " + product2);

        distributor.setProduct(product2);
        distributor.saveToJson("order.tjson");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void saveToJson(String filename) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(this);

        try (FileWriter fileWriter = new FileWriter(filename)) {
            fileWriter.write(json);
            fileWriter.flush();
            System.out.println("Datos guardados en el archivo JSON: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

       
