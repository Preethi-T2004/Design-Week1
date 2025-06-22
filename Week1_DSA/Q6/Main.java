import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book("B101", "Algorithms", "Thomas Cormen"),
                new Book("B102", "Clean Code", "Robert C. Martin"),
                new Book("B103", "Java Programming", "Herbert Schildt"),
                new Book("B104", "Data Structures", "Mark Allen Weiss")
        };

        System.out.println("Books in Library:");
        Library.displayBooks(books);

        // Linear Search
        System.out.println("\nLinear Search for 'Java Programming':");
        Book result1 = Library.linearSearch(books, "Java Programming");
        System.out.println(result1 != null ? result1 : "Book not found");

        // Sort for Binary Search
        Arrays.sort(books);

        // Binary Search
        System.out.println("\nBinary Search for 'Java Programming':");
        Book result2 = Library.binarySearch(books, "Java Programming");
        System.out.println(result2 != null ? result2 : "Book not found");
    }
}
