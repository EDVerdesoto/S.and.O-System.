
package ec.edu.espe.ecomarket.controller;

import ec.edu.espe.HOManagment.controller.CustomerController;
import ec.edu.espe.HOManagment.model.Customer;
import org.bson.Document;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Code Warriors, DCCO-ESPE
 */
public class CustomerControllerTest {
    
    public CustomerControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of buildDocument method, of class CustomerController.
     */
    @Test
    public void testBuildDocument() {
        System.out.println("buildDocument");
        Customer customer = null;
        CustomerController instance = new CustomerController();
        Document expResult = null;
        Document result = instance.buildDocument(customer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
