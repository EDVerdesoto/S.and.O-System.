package ec.edu.espe.HOManagement.model;
import java.util.Scanner;

/**
 *
 * @author Mateo Quishpe, CodeWars, DCCO-ESPE
 */

public class Menu {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            
            do {
                System.out.println("----- Menú -----");
                System.out.println("1. Crear usuarios");
                System.out.println("2. Ingresar productos");
                System.out.println("3. Vender productos");
                System.out.println("4. Ver reporte de ventas");
                System.out.println("5. Contactos de proveedores");
                System.out.println("6. Salir");
                System.out.print("Ingrese la opción: ");
                opcion = scanner.nextInt();
                
                switch (opcion) {
                    case 1 -> crearUsuarios();
                    case 2 -> ingresarProductos();
                    case 3 -> venderProductos();
                    case 4 -> verReporteVentas();
                    case 5 -> contactosProveedores();
                    case 6 -> System.out.println("Saliendo del programa...");
                    default -> System.out.println("Opción inválida");
                }
            } while (opcion != 6);
        }
    }

    public static void crearUsuarios() {
        // Lógica para crear usuarios
        System.out.println("Se han creado los usuarios");
    }

    public static void ingresarProductos() {
        // Lógica para ingresar productos
        System.out.println("Se han ingresado los productos");
    }

    public static void venderProductos() {
        // Lógica para vender productos
        System.out.println("Se han vendido los productos");
    }

    public static void verReporteVentas() {
        // Lógica para ver el reporte de ventas
        System.out.println("Se muestra el reporte de ventas");
    }

    public static void contactosProveedores() {
        // Lógica para mostrar los contactos de proveedores
        System.out.println("Se muestran los contactos de proveedores");
    }
}
