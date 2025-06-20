public class Main {
    public static void main(String[] args) {
        // Model
        Student student = new Student("Alice", "S123", "A");

        // View
        StudentView view = new StudentView();

        // Controller
        StudentController controller = new StudentController(student, view);

        // Display initial details
        controller.updateView();

        // Update data
        controller.setStudentName("Bob");
        controller.setStudentGrade("B+");

        // Display updated details
        controller.updateView();
    }
}
