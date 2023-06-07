
package ec.edu.espe.HOManagement.model;

import com.google.gson.Gson;
import java.util.Map;
/**
 * 
 * @author Code Warriors, DCCO-ESPE
 */

public class Report {
    public static void generateReport(Map<String, Object> item) {
        RevenueCalculator revenueCalculator = new RevenueCalculator();
        Costumer costumer = new Costumer();
        Distributor distributor = new Distributor();

        revenueCalculator.addExpense();
        revenueCalculator.addSale();
        revenueCalculator.calculateRevenue();
        revenueCalculator.calculateRevenueWithVat();

        costumer.setName("John Doe");
        costumer.setEmail("johndoe@example.com");

        Gson gson = new Gson();
        String json = gson.toJson(new Object[] { revenueCalculator, costumer, distributor, item });

        System.out.println(json);
    }
}
