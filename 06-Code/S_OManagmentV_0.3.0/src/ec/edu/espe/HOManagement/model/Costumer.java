package ec.edu.espe.HOManagement.model;

import java.util.Scanner;

/**
 *
 * @author Code Warriors, DCCO-ESPE
 */
public class Costumer {
    
    private String name;
    private String email;
    Scanner sc = new Scanner(System.in);
    
    public void purchaseItem () {
        System.out.println("What item the client purchase?");
        
    }
    public void returnItem (){
        
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
