package Datastructure;
import java.util.List;

public class SearchAlgorithms {

    public static Product linearSearch(List<Product> products, String targetName) {
        for (Product product : products) {
            if (product.getProductName().equals(targetName)) {
                return product;
            }
        }
        return null;
    }
}
