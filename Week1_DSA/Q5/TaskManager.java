public class TaskManager {
    private TaskNode head;

    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Added: " + task);
    }

    public void deleteTask(String taskId) {
        if (head == null) return;

        if (head.task.getTaskId().equals(taskId)) {
            head = head.next;
            System.out.println("Deleted task with ID: " + taskId);
            return;
        }

        TaskNode prev = head;
        TaskNode curr = head.next;

        while (curr != null && !curr.task.getTaskId().equals(taskId)) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null) {
            prev.next = curr.next;
            System.out.println("Deleted task with ID: " + taskId);
        } else {
            System.out.println("Task not found: " + taskId);
        }
    }

    public Task searchTask(String taskId) {
        TaskNode current = head;
        while (current != null) {
            if (current.task.getTaskId().equals(taskId)) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    public void listTasks() {
        System.out.println("Current Tasks:");
        TaskNode current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }
}
