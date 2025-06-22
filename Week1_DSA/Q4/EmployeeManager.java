public class EmployeeManager {
    private Employee[] employees;
    private int count;

    public EmployeeManager(int size) {
        employees = new Employee[size];
        count = 0;
    }

    public void addEmployee(Employee emp) {
        if (count < employees.length) {
            employees[count++] = emp;
            System.out.println("Added: " + emp);
        } else {
            System.out.println("Cannot add more employees, array is full.");
        }
    }

    public Employee searchEmployee(String id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(id)) {
                return employees[i];
            }
        }
        return null;
    }

    public void deleteEmployee(String id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(id)) {
                // Shift elements left
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println("Deleted employee with ID: " + id);
                return;
            }
        }
        System.out.println("Employee not found: " + id);
    }

    public void listEmployees() {
        System.out.println("Employee Records:");
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }
}
