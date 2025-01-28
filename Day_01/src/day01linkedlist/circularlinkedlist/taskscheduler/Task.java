package day01linkedlist.circularlinkedlist.taskscheduler;

//Create the class name Task
public class Task {

    //Attributes
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    //Constructor
    public Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}
