package Datastructure;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", "Electronics"));
        products.add(new Product(2, "Smartphone", "Electronics"));
        products.add(new Product(3, "Tablet", "Electronics"));
        products.add(new Product(4, "Chair", "Furniture"));
        products.add(new Product(5, "Desk", "Furniture"));

        // Test Linear Search
        Product resultLinear = SearchAlgorithms.linearSearch(products, "Tablet");
        System.out.println("Linear Search Result: " + resultLinear);

        // Sort products for Binary Search
        List<Product> sortedProducts = BinarySearch.sortProductsByName(new ArrayList<>(products));

        // Test Binary Search
        Product resultBinary = BinarySearch.binarySearch(sortedProducts, "Desk");
        System.out.println("Binary Search Result: " + resultBinary);
    }
}

