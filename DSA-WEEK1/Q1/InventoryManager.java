import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<String, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Added: " + product);
    }

    public void updateProduct(String productId, int quantity, double price) {
        Product p = inventory.get(productId);
        if (p != null) {
            p.setQuantity(quantity);
            p.setPrice(price);
            System.out.println("Updated: " + p);
        } else {
            System.out.println("Product not found: " + productId);
        }
    }

    public void deleteProduct(String productId) {
        Product removed = inventory.remove(productId);
        if (removed != null) {
            System.out.println("Deleted: " + removed);
        } else {
            System.out.println("Product not found: " + productId);
        }
    }

    public void displayInventory() {
        System.out.println("Current Inventory:");
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }
}
