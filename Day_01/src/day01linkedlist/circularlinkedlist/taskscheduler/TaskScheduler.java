package day01linkedlist.circularlinkedlist.taskscheduler;

//Create the class name TaskScheduler
public class TaskScheduler {

    private Task head;
    private Task tail;
    private Task current;

    //Constructor
    public TaskScheduler() {
        head = null;
        tail = null;
        current = null;
    }

    // Add a task at the beginning
    public void addTaskAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            tail = newTask;
            newTask.next = head;
        } else {
            newTask.next = head;
            head = newTask;
            tail.next = head;
        }
        System.out.println("Task added at the beginning: " + taskName);
    }

    // Add a task at the end
    public void addTaskAtEnd(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            tail = newTask;
            newTask.next = head;
        } else {
            tail.next = newTask;
            tail = newTask;
            tail.next = head;
        }
        System.out.println("Task added at the end: " + taskName);
    }

    // Add a task at a specific position
    public void addTaskAtPosition(int position, int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (position <= 1 || head == null) {
            addTaskAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }
        Task temp = head;
        int index = 1;
        while (index < position - 1 && temp.next != head) {
            temp = temp.next;
            index++;
        }
        newTask.next = temp.next;
        temp.next = newTask;

        // If added at the end, update tail
        if (temp == tail) {
            tail = newTask;
            tail.next = head;
        }
        System.out.println("Task added at position " + position + ": " + taskName);
    }

    // Remove a task by Task ID
    public void removeTaskById(int taskId) {
        if (head == null) {
            System.out.println("No tasks to remove.");
            return;
        }

        Task temp = head;
        Task prev = null;

        // Search for the task to remove
        do {
            if (temp.taskId == taskId) {
                if (temp == head) {
                    head = head.next;
                    tail.next = head;
                } else if (temp == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                }
                System.out.println("Task removed: " + temp.taskName);
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task with ID " + taskId + " not found.");
    }

    // View the current task and move to the next task
    public void viewAndMoveToNext() {
        if (current == null) {
            current = head;
        }
        if (current != null) {
            System.out.println("Current task: " + current.taskName + " (Priority: " + current.priority + ")");
            current = current.next; // Move to the next task
        } else {
            System.out.println("No tasks available.");
        }
    }

    // Display all tasks
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks in the list.");
            return;
        }
        System.out.println("All tasks:");
        Task temp = head;
        do {
            System.out.println("Task ID: " + temp.taskId + ", Name: " + temp.taskName +
                    ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search for a task by Priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks to search.");
            return;
        }
        boolean found = false;
        Task temp = head;
        do {
            if (temp.priority == priority) {
                System.out.println("Task found: " + temp.taskName + " (Priority: " + temp.priority + ")");
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) {
            System.out.println("No tasks with priority " + priority + " found.");
        }
    }
}
