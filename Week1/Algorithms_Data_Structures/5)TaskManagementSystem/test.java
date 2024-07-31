public class test {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        Task task1 = new Task(1, "Task 1", "Incomplete");
        Task task2 = new Task(2, "Task 2", "Incomplete");
        Task task3 = new Task(3, "Task 3", "Complete");

        taskList.addTask(task1);
        taskList.addTask(task2);
        taskList.addTask(task3);

        System.out.println("Tasks after addition:");
        taskList.traverseTasks();

        System.out.println("\nSearching for Task with ID 2:");
        System.out.println(taskList.searchTask(2));

        System.out.println("\nDeleting Task with ID 2:");
        taskList.deleteTask(2);

        System.out.println("\nTasks after deletion:");
        taskList.traverseTasks();
    }
}
