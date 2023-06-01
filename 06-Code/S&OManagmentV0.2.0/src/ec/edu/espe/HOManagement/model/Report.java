
package ec.edu.espe.HOManagement.model;

import com.google.gson.Gson;
/**
 * 
 * @author Code Warriors, DCCO-ESPE
 */
public class Report {
    public static void generateReport() {
        RevenueCalculator revenueCalculator = new RevenueCalculator();
        Costumer costumer = new Costumer();
        Distributor distributor = new Distributor();
        ProductItem productItem = new ProductItem(1);

        
        revenueCalculator.AddExpense();
        revenueCalculator.AddSale();
        revenueCalculator.CalculateRevenue();
        revenueCalculator.CalculateRevenueWithVat();

        costumer.setName("John Doe");
        costumer.setEmail("johndoe@example.com");

        Gson gson = new Gson();
        String json = gson.toJson(new Object[] { revenueCalculator, costumer, distributor, productItem });

        
        System.out.println(json);
    }
}
