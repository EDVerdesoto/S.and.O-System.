
package ec.edu.espe.HOManagment.controller;

import ec.edu.espe.HOManagment.model.Product;
import org.bson.Document;

/**
 *
 * @author Code Warriors, DCCO-ESPE
 */
public class ProductController extends BasicController<Product> {

    public ProductController(Product object, String collectionName) {
        super(object, collectionName);
    }
     public ProductController() {
        super(new Product(), "products");
    }
     
     
     
    public Document buildDocument(Product product) {
        Document document = new Document();

        document.append("name", product.getName()).
                append("price", product.getPrice()).
                append("income", product.getIncome()).
                append("stock", product.getStock());
        return document;
    }

}
