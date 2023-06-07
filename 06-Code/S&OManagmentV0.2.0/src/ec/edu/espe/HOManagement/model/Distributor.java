package ec.edu.espe.HOManagement.model;

import java.util.Scanner;
import ec.edu.espe.HOManagement.model.RevenueCalculator;
/**
 *
 * @author Code Warriors, DCCO-ESPE
 */
public class Distributor {
    private static String name;
    private static String product;
    private static String contactInfo;
    private static String request;
    static Scanner sc = new Scanner(System.in);
    
    public static void PlaceOrder (){
        
        System.out.println("Quiere hacer una nueva orden?");
        System.out.println("Inserte el nombre del distribuidor: ");
        name = sc.next(name);
        System.out.println("Este es el contacto:" + contactInfo);
    }
    
    public static void updateContactInfo (){
        System.out.println("De quien desea cambiar la informacion de contacto?");
        name = sc.next(name);
    }
    
    public static void updateRecuest (){
        System.out.println("Que producto desea añadir?");
        product = sc.next(product);
                                
    }
    
    public static void ChangeRequest(){
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
