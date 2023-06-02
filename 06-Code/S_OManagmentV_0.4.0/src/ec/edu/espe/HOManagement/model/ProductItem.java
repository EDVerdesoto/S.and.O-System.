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

        RevenueCalculator revenueCalculator = new RevenueCalculator();
        revenueCalculator.calculateRevenue();

        enterDate = new Date();
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert the item id: ");
        id = sc.nextInt();

        System.out.println("Insert the item name: ");
        name = sc.next();

        System.out.println("Insert the item amount: ");
        amount = sc.nextInt();

        System.out.println("This is the enter date of the item: " + enterDate);

        Map<String, Object> itemMap = new HashMap<>();
        itemMap.put("id", id);
        itemMap.put("name", name);
        itemMap.put("amount", amount);
        itemMap.put("enterDate", enterDate);

        return itemMap;
    }
}

