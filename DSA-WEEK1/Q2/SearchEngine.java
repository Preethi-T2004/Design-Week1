public class SearchEngine {

    // Linear Search
    public static int linearSearch(Product[] products, String key) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName().equalsIgnoreCase(key)) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search
    public static int binarySearch(Product[] products, String key) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].getProductName().compareToIgnoreCase(key);

            if (cmp == 0) return mid;
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
