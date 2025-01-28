package day01linkedlist.circularlinkedlist.taskscheduler;

public class TaskSchedulerMain {

    public static void main(String[] args) {

        //Create the TaskScheduler object
        TaskScheduler scheduler = new TaskScheduler();

        // Add tasks
        scheduler.addTaskAtEnd(1, "Task 1", 3, "2025-02-01");
        scheduler.addTaskAtEnd(2, "Task 2", 1, "2025-02-02");
        scheduler.addTaskAtBeginning(3, "Task 3", 2, "2025-02-03");
        scheduler.addTaskAtPosition(2, 4, "Task 4", 5, "2025-02-04");

        // Display all tasks
        scheduler.displayAllTasks();

        // View current task and move to the next
        scheduler.viewAndMoveToNext();
        scheduler.viewAndMoveToNext();

        // Remove a task
        scheduler.removeTaskById(2);
        scheduler.displayAllTasks();

        // Search by priority
        scheduler.searchByPriority(5);

        // View current task again
        scheduler.viewAndMoveToNext();
    }
}
