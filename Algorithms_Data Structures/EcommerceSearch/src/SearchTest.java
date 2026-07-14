import java.util.Arrays;
import java.util.Comparator;

public class SearchTest {

    // Linear Search Implementation
    public static Product linearSearch(Product[] products, String targetId) {
        for (Product product : products) {
            if (product.getProductId().equals(targetId)) {
                return product;
            }
        }
        return null; // Not found
    }

    // Binary Search Implementation (Assumes products are sorted by productId)
    public static Product binarySearch(Product[] products, String targetId) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = products[mid].getProductId().compareTo(targetId);

            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null; // Not found
    }

    public static void main(String[] args) {
        System.out.println("=== E-commerce Product Search ===");

        // Setup sample dataset
        Product[] products = {
            new Product("P105", "Camera", "Electronics"),
            new Product("P101", "Laptop", "Electronics"),
            new Product("P103", "Microphone", "Audio"),
            new Product("P102", "Keyboard", "Accessories"),
            new Product("P104", "Monitor", "Electronics")
        };

        System.out.println("Dataset:");
        for (Product p : products) {
            System.out.println("  " + p);
        }
        System.out.println();

        // 1. Test Linear Search
        System.out.println("--- Running Linear Search for P103 ---");
        Product result1 = linearSearch(products, "P103");
        System.out.println("Result: " + (result1 != null ? result1 : "Not Found"));
        System.out.println();

        // Sort dataset by productId for Binary Search
        System.out.println("Sorting dataset by Product ID...");
        Arrays.sort(products, Comparator.comparing(Product::getProductId));
        System.out.println("Sorted Dataset:");
        for (Product p : products) {
            System.out.println("  " + p);
        }
        System.out.println();

        // 2. Test Binary Search
        System.out.println("--- Running Binary Search for P103 ---");
        Product result2 = binarySearch(products, "P103");
        System.out.println("Result: " + (result2 != null ? result2 : "Not Found"));
        System.out.println();

        System.out.println("--- Running Binary Search for P999 (Non-existent) ---");
        Product result3 = binarySearch(products, "P999");
        System.out.println("Result: " + (result3 != null ? result3 : "Not Found"));
        System.out.println();

        System.out.println("SUCCESS: Search operations completed.");
    }
}
