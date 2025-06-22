public class Main {
    public static void main(String[] args) {
        Order[] orders1 = {
            new Order("O101", "Alice", 599.0),
            new Order("O102", "Bob", 299.0),
            new Order("O103", "Charlie", 999.0),
            new Order("O104", "Daisy", 449.0)
        };

        // Copy array for both sorts
        Order[] orders2 = new Order[orders1.length];
        System.arraycopy(orders1, 0, orders2, 0, orders1.length);

        System.out.println("Before Sorting:");
        SortAlgorithms.display(orders1);

        System.out.println("After Bubble Sort:");
        SortAlgorithms.bubbleSort(orders1);
        SortAlgorithms.display(orders1);

        System.out.println("After Quick Sort:");
        SortAlgorithms.quickSort(orders2, 0, orders2.length - 1);
        SortAlgorithms.display(orders2);
    }
}
