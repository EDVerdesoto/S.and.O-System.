
package ec.edu.espe.HOManagment.model;

/**
 *
 * @author Code Warriors, DCCO-ESPE
 */
public class Product {

    private String name;
    private float price;
    private String income;
    private int stock;

    public Product(String name, float price, String expiration, int stock) {
        this.name = name;
        this.price = price;
        this.income = expiration;
        this.stock = stock;
    }

    public Product() {
    }
    

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", income=" + income + ", stock=" + stock + '}';
    }

    public String toStringData() {
        return name + "," + price + "," + income + "," + stock;
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
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the income
     */
    public String getIncome() {
        return income;
    }

    /**
     * @param income the income to set
     */
    public void setIncome(String income) {
        this.income = income;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
}