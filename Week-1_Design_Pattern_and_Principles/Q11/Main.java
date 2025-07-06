public class Main {
    public static void main(String[] args) {
        // Create repository
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject into service
        CustomerService service = new CustomerService(repository);

        // Use service
        service.displayCustomer("C101");
        service.displayCustomer("C999"); // Not found case
    }
}
