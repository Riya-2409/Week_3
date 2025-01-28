package day01linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

//Create the class name Process
public class Process {

    int processId;
    int burstTime;
    int priority;
    int remainingTime;

    // Constructor to initialize the process
    public Process(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.remainingTime = burstTime;
    }
}
