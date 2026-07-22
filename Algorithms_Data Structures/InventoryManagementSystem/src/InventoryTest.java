import java.util.HashMap;
import java.util.Map;

public class InventoryTest {
    private final Map<String, Product> inventory;

    public InventoryTest() {
        this.inventory = new HashMap<>();
    }

    // Add Product
    public void addProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            System.out.println("Product with ID " + product.getProductId() + " already exists.");
        } else {
            inventory.put(product.getProductId(), product);
            System.out.println("Added: " + product);
        }
    }

    // Update Product
    public void updateProduct(String productId, int newQuantity, double newPrice) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setQuantity(newQuantity);
            product.setPrice(newPrice);
            System.out.println("Updated: " + product);
        } else {
            System.out.println("Error: Product ID " + productId + " not found.");
        }
    }

    // Delete Product
    public void deleteProduct(String productId) {
        Product removed = inventory.remove(productId);
        if (removed != null) {
            System.out.println("Deleted: " + removed);
        } else {
            System.out.println("Error: Product ID " + productId + " not found.");
        }
    }

    // Traverse Inventory
    public void displayInventory() {
        System.out.println("--- Current Inventory List ---");
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        System.out.println("=== Inventory Management System ===");
        InventoryTest warehouse = new InventoryTest();

        // 1. Add Products
        Product p1 = new Product("P001", "Laptop", 50, 999.99);
        Product p2 = new Product("P002", "Smartphone", 120, 499.99);
        Product p3 = new Product("P003", "Headphones", 300, 79.99);

        warehouse.addProduct(p1);
        warehouse.addProduct(p2);
        warehouse.addProduct(p3);
        System.out.println();

        warehouse.displayInventory();
        System.out.println();

        // 2. Update Product
        System.out.println("Updating Smartphone quantity and price:");
        warehouse.updateProduct("P002", 110, 450.00);
        System.out.println();

        // 3. Delete Product
        System.out.println("Deleting Headphones:");
        warehouse.deleteProduct("P003");
        System.out.println();

        // Display Final State
        warehouse.displayInventory();
        System.out.println("SUCCESS: Inventory Management operations completed.");
    }
}
