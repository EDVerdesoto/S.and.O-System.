package ec.edu.espe.HOManagement.model;

import java.util.Scanner;

/**
 *
 * @author Code Warriors, DCCO-ESPE
 */
public class RevenueCalculator {

    static void calculateRevenue() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     float revenue = (float) 0.30; 
     float salePrice;
     float expenses;
     float vatRate = (float) 0.12;
    Scanner sc = new Scanner(System.in);
    
    public void AddExpense (){
        System.out.println("Add the Expense of the product: ");
        expenses = sc.nextFloat();        
    }
    public void AddSale (){
        System.out.println("Write the number of products selled: ");  
        int productSelled;
        productSelled = sc.nextInt();
    }
    public float CalculateRevenue (){
        float sellPercentage;
        sellPercentage = (float) (expenses*revenue);
        salePrice = expenses + sellPercentage;
        System.out.println("This is the sale price to get the revenue: " + salePrice);
         return salePrice;
    }
    public void CalculateRevenueWithVat (){
        float salePriceWithVat;
        salePriceWithVat = salePrice*vatRate;
        System.out.println("The sale price with vat is: " + salePriceWithVat);
    }
    
}
