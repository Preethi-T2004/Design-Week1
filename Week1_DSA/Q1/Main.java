public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product("P101", "Monitor", 10, 6999.99);
        Product p2 = new Product("P102", "Keyboard", 25, 1299.49);

        manager.addProduct(p1);
        manager.addProduct(p2);

        manager.displayInventory();

        manager.updateProduct("P101", 15, 7499.99);
        manager.deleteProduct("P102");

        manager.displayInventory();
    }
}
