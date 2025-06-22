public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        Employee e1 = new Employee("E101", "Alice", "Manager", 80000);
        Employee e2 = new Employee("E102", "Bob", "Developer", 60000);
        Employee e3 = new Employee("E103", "Charlie", "HR", 50000);

        manager.addEmployee(e1);
        manager.addEmployee(e2);
        manager.addEmployee(e3);

        manager.listEmployees();

        System.out.println("\nSearching for E102:");
        Employee found = manager.searchEmployee("E102");
        System.out.println(found != null ? found : "Not found");

        System.out.println("\nDeleting E102:");
        manager.deleteEmployee("E102");

        manager.listEmployees();
    }
}
