package ec.edu.espe.HOManagement.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Code Warriors, DCCO-ESPE
 */
public class ProductItem {
    private int id;
    private String name;
    private int amount;
    private Date enterDate;
    private float revenue; 

    private RevenueCalculator revenueCalculator; 

    public ProductItem() {
        enterDate = new Date();
        revenueCalculator = new RevenueCalculator(); 
    }

    public void enterProductItem() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el id del producto: ");
        while (true) {
            try {
                id = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("El ID debe ser un número entero. Ingrese nuevamente: ");
            }
        }

        System.out.println("Ingrese el nombre del producto: ");
        name = scanner.nextLine();

        System.out.println("Ingrese la cantidad: ");
        while (true) {
            try {
                amount = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("La cantidad debe ser un número entero. Ingrese nuevamente: ");
            }
        }

        revenue = revenueCalculator.calculateRevenue();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public Date getEnterDate() {
        return enterDate;
    }

    public float getRevenue() {
        return revenue;
    }

    public void saveToJson() {
        List<ProductItem> productList = loadProductsFromJSON();
        productList.add(this);
        saveProductsToJSON(productList);
        System.out.println("Producto guardado exitosamente.");
    }

    private void saveProductsToJSON(List<ProductItem> productList) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(productList);

        try (FileWriter writer = new FileWriter("productos.json")) {
            writer.write(json);
        } catch (IOException e) {
            System.out.println("No se pudo guardar el producto en el archivo JSON.");
        }
    }

    private List<ProductItem> loadProductsFromJSON() {
        Gson gson = new Gson();
        List<ProductItem> productList;

        try (Reader reader = new FileReader("productos.json")) {
            productList = gson.fromJson(reader, List.class);
        } catch (IOException e) {
            System.out.println("No se pudo cargar el archivo JSON. Se creará uno nuevo.");
            return new ArrayList<>();
        }

        return productList != null ? productList : new ArrayList<>();
    }
}
