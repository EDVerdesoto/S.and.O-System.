package ec.edu.espe.HOManagement.model;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Code Warriors, DCCO-ESPE
 */
public class ProductItem {
    
    public static void Item (){
        int id;
        String name;
        int amount;
        Date enterDate;
        Date saleDate;
        RevenueCalculator.calculateRevenue();
        enterDate = new Date ();
        Scanner sc = new Scanner (System.in);
        System.out.println("Insert the item id: ");
        id = sc.nextInt();
        System.out.println("Insert the item name: ");
        name = sc.next();
        System.out.println("Insert the item amount: ");
        amount = sc.nextInt();
        System.out.println("This is the enter date of the item" + enterDate);           
            
    }
    
    public ProductItem(int id) {
    }
    
    
}