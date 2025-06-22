public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        Task t1 = new Task("T101", "Design UI", "Pending");
        Task t2 = new Task("T102", "Implement API", "In Progress");
        Task t3 = new Task("T103", "Write Test Cases", "Pending");

        manager.addTask(t1);
        manager.addTask(t2);
        manager.addTask(t3);

        manager.listTasks();

        System.out.println("\nSearching for T102:");
        Task found = manager.searchTask("T102");
        System.out.println(found != null ? found : "Task not found");

        System.out.println("\nDeleting T102:");
        manager.deleteTask("T102");

        manager.listTasks();
    }
}
