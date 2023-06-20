package ec.edu.espe.HOManagement.model;

import java.util.Scanner;

/**
 *
 * @author Code Warriors, DCCO-ESPE
 */
public class RevenueCalculator {

     static float revenue = (float) 0.30; 
     static float salePrice;
     static float expenses;
     static float vatRate = (float) 0.12;
    Scanner sc = new Scanner(System.in);
    
    public static void AddExpense (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el precio de compra del producto: ");
        expenses = sc.nextFloat();        
    }
    public static void AddSale (){
        Scanner sc = new Scanner(System.in);
        String yesNo;
        System.out.println("Escriba la cantidad de producto vendido: ");  
        int productSelled;
        productSelled = sc.nextInt();
    }
    public static float CalculateRevenue (){
        float sellPercentage;
        sellPercentage = (float) (expenses*revenue);
        salePrice = expenses + sellPercentage;
        System.out.println("Este es el precio del producto con ganancia: " + salePrice);
         return salePrice;
    }
    public static void CalculateRevenueWithVat (){
        float salePriceWithVat;
        salePriceWithVat = salePrice*vatRate;
        System.out.println("El IVA del producto es: " + salePriceWithVat);
    }
    
}
