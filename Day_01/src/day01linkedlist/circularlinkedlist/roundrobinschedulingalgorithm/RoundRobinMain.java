package day01linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

//Create the class name RoundRobinMain
public class RoundRobinMain {

    public static void main(String[] args) {
        RobinRound processQueue = new RobinRound();

        // Add processes to the circular linked list
        processQueue.addProcess(new Process(1, 10, 3));
        processQueue.addProcess(new Process(2, 5, 1));
        processQueue.addProcess(new Process(3, 8, 2));

        // Display initial process list
        System.out.println("Initial Process List:");
        processQueue.displayProcesses();

        // Set the time quantum and start round robin scheduling
        int timeQuantum = 3;
        processQueue.roundRobinScheduling(timeQuantum);
    }
}
