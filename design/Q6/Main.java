public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Only loads when display is called
        image1.display();  // Loads from server, then displays
        image1.display();  // Just displays (cached)

        image2.display();  // Loads from server, then displays
    }
}
