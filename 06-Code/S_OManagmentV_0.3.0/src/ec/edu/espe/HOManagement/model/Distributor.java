package ec.edu.espe.HOManagement.model;

import java.util.Scanner;
import ec.edu.espe.HOManagement.model.RevenueCalculator;
/**
 *
 * @author Code Warriors, DCCO-ESPE
 */
public class Distributor {
    private String name;
    private String product;
    private String contactInfo;
    private String request;
    Scanner sc = new Scanner(System.in);
    
    public void PlaceOrder (){
        
        System.out.println("Do you want to make a new order?");
        System.out.println("Insert the distributor name: ");
        name = sc.next(name);
        System.out.println("This is the contact:" + contactInfo);
    }
    
    public void updateContactInfo (){
        System.out.println("Whose contact information do you want to change?");
        name = sc.next(name);
    }
    
    public void updateRecuest (){
        System.out.println("What product do you want to add?");
        product = sc.next(product);
                                
    }
    
    public void ChangeRequest(){
        String product1 = null;
        String product2 = null;
        System.out.println("What product do you want to change?");
        product1 = sc.next(product1);
        System.out.println("What item do you want instead?");
        product2 = sc.next(product2);
        System.out.println("The new item for request is: " + product2);
    }
    
   
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @return the contactInfo
     */
    public String getContactInfo() {
        return contactInfo;
    }

    /**
     * @param contactInfo the contactInfo to set
     */
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
