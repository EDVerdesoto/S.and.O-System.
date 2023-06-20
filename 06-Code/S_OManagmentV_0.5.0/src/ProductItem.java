import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Code Warriors, DCCO-ESPE
 */



public class ProductItem {
    private int id;
    private String name;
    private int amount;
    private Date enterDate;

    public ProductItem() {
        enterDate = new Date();
    }

    public void enterProductItem() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el id del producto: ");
        id = scanner.nextInt();

        System.out.println("Ingrese el nombre del producto: ");
        name = scanner.next();

        System.out.println("Ingrese la cantidad: ");
        amount = scanner.nextInt();
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

