// Main.java
public class Driver {
    public static void main(String[] args) {
        // Create Inventory object
        Inventory inventory = new Inventory();
        // Create some Product objects
        Product product1 = new Product("001", "Laptop", 10, 999.99);
        Product product2 = new Product("002", "Smartphone", 25, 499.99);
           // Add products to inventory
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        // Display the inventory
        System.out.println("Initial Inventory: " + inventory);
        // Update a product
        Product updatedProduct2 = new Product("002", "Smartphone", 20, 479.99);
        inventory.updateProduct(updatedProduct2);
        // Display the inventory after update
        System.out.println("Inventory after update: " + inventory);
        // Delete a product
        inventory.deleteProduct("001");
        // Display the inventory after deletion
        System.out.println("Inventory after deletion: " + inventory);
        // Retrieve and display a product
        Product retrievedProduct = inventory.getProduct("002");
        System.out.println("Retrieved Product: " + retrievedProduct);
    }
}

