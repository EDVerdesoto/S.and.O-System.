package ec.edu.espe.HOManagement.view;

import ec.edu.espe.HOManagement.model.Distributor;
import ec.edu.espe.HOManagement.model.ProductItem;
import java.util.Scanner;

/**
 *
 * @author Code Warriors, DCCO-ESPE
 */
public class ImputMenu {
    //TODO menu con opciones para 1.ingresar, 2.imprimir, 3. modificar, 4. salir
    //llamar a las funciones
    public static void menu (){
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
                    case 2 -> ProductItem.Item();
                    case 3 -> venderProductos();
                    case 4 -> verReporteVentas();
                    case 5 -> Distributor.PlaceOrder();
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
