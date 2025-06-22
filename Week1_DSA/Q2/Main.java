import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Mouse", "Electronics"),
            new Product("P002", "Keyboard", "Electronics"),
            new Product("P003", "Charger", "Accessories"),
            new Product("P004", "Laptop", "Computers"),
            new Product("P005", "Notebook", "Stationery")
        };

        // Linear Search
        System.out.println("Linear Search:");
        int index1 = SearchEngine.linearSearch(products, "Laptop");
        System.out.println(index1 >= 0 ? "Found: " + products[index1] : "Product not found");

        // Sort for binary search
        Arrays.sort(products);

        // Binary Search
        System.out.println("\nBinary Search:");
        int index2 = SearchEngine.binarySearch(products, "Laptop");
        System.out.println(index2 >= 0 ? "Found: " + products[index2] : "Product not found");
    }
}
