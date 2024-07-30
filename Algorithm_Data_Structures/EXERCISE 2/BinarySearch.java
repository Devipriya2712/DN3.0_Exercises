package Datastructure;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BinarySearch {

    public static Product binarySearch(List<Product> products, String targetName) {
        int low = 0;
        int high = products.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            Product midProduct = products.get(mid);
            int comparison = midProduct.getProductName().compareTo(targetName);

            if (comparison == 0) {
                return midProduct;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static List<Product> sortProductsByName(List<Product> products) {
        products.sort(Comparator.comparing(Product::getProductName));
        return products;
    }
}

