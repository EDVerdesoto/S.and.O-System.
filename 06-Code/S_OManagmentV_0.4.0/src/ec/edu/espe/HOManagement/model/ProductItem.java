package ec.edu.espe.HOManagement.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author Code Warriors, DCCO-ESPE
 */

public class ProductItem {

    public ProductItem(int par) {
    }

    public static Map<String, Object> item() {
        int id;
        String name;
        int amount;
        Date enterDate;
        enterDate = new Date();
        Scanner sc = new Scanner(System.in);
        RevenueCalculator revenueCalculator = new RevenueCalculator();
 
        System.out.println("Ingrese el id del producto: ");
        id = sc.nextInt();

        System.out.println("Ingrese el nombre del item: ");
        name = sc.next();

        System.out.println("Ingrese la cantidad de items: ");
        amount = sc.nextInt();
       
        revenueCalculator.calculateRevenue();

        System.out.println("Esta es la fecha de registro: " + enterDate);
        

        Map<String, Object> itemMap = new HashMap<>();
        itemMap.put("id", id);
        itemMap.put("name", name);
        itemMap.put("amount", amount);
        itemMap.put("enterDate", enterDate);

        return itemMap;
    }
}

