import java.util.HashMap;
import java.util.Map;
public class Inventory {
    private Map<String, Product> productMap;
    public Inventory() {
        productMap = new HashMap<>();
   }
    // Method to add a product
    public void addProduct(Product product) {
        productMap.put(product.getProductId(), product);
    }
    // Method to update a product
    public void updateProduct(Product product) {
        if (productMap.containsKey(product.getProductId())) {
            productMap.put(product.getProductId(), product);
        } else {
            System.out.println("Product with ID " + product.getProductId() + " does not exist.");
        }
    }
    // Method to delete a product
    public void deleteProduct(String productId) {
        if (productMap.containsKey(productId)) {
            productMap.remove(productId);
        } else {
            System.out.println("Product with ID " + productId + " does not exist.");
        }
    }
  // Method to get a product
    public Product getProduct(String productId) {
        return productMap.get(productId);
    }
    @Override
    public String toString() {
        return "Inventory{" +
                "productMap=" + productMap +
                '}';
    }
}

