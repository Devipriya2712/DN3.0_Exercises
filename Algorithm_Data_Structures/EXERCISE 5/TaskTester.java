package Datastructure;
public class TaskTester {

    public static void main(String[] args) {
        // Create an instance of TaskLinkedList
        TaskLinkedList taskList = new TaskLinkedList();

        // Add some tasks
        taskList.addTask(new Task(1, "Complete Report", "In Progress"));
        taskList.addTask(new Task(2, "Attend Meeting", "Completed"));
        taskList.addTask(new Task(3, "Update Website", "Pending"));
        

        // Traverse and print all tasks
        System.out.println("All Tasks:");
        taskList.traverseTasks();

        // Search for a task by ID
        int searchId = 3;
        Task searchedTask = taskList.searchTaskById(searchId);
        if (searchedTask != null) {
            System.out.println("\nFound Task with ID " + searchId + ":");
            System.out.println(searchedTask);
        } else {
            System.out.println("\nTask with ID " + searchId + " not found.");
        }

        // Delete a task by ID
        int deleteId = 2;
        boolean isDeleted = taskList.deleteTaskById(deleteId);
        if (isDeleted) {
            System.out.println("\nTask with ID " + deleteId + " has been deleted.");
        } else {
            System.out.println("\nTask with ID " + deleteId + " could not be deleted.");
        }

        // Traverse and print all tasks after deletion
        System.out.println("\nTasks After Deletion:");
        taskList.traverseTasks();
    }
}

