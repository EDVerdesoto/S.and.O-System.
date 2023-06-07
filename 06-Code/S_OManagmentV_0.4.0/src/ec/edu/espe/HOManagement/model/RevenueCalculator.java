package ec.edu.espe.HOManagement.model;

import java.util.Scanner;

/**
 *
 * @author Code Warriors, DCCO-ESPE
 */


public class RevenueCalculator {
    float revenue = 0.30f;
    float salePrice;
    float expenses;
    float vatRate = 0.12f;
    Scanner sc = new Scanner(System.in);

    public void addExpense() {
        System.out.println("Add the expense of the product: ");
        expenses = sc.nextFloat();
    }

    public void addSale() {
        System.out.println("Write the number of products sold: ");
        int productsSold = sc.nextInt();
    }

    public float calculateRevenue() {
        System.out.println("Ingrese el precio del Item: ");
        expenses = sc.nextFloat();
        float sellPercentage = expenses * revenue;
        salePrice = expenses + sellPercentage;
        System.out.println("Este es el precio de venta, obteniendo su ganancia: " + salePrice);
        return salePrice;
    }

    public void calculateRevenueWithVat() {
        float salePriceWithVat = salePrice * vatRate;
        System.out.println("The sale price with VAT is: " + salePriceWithVat);
    }

    
}



