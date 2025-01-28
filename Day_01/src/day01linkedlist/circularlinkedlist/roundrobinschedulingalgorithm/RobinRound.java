package day01linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

public class RobinRound {

    class Node {


        Process process;
        Node next;

        //Constructor
        public Node(Process process) {
            this.process = process;
            this.next = null;
        }
    }

    private Node head = null;
    private Node tail = null;

    // Add a new process to the circular linked list
    public void addProcess(Process process) {
        //Create the new Node
        Node newNode = new Node(process);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // Remove process by processId after execution
    public void removeProcess(int processId) {

        if (head == null) return;

        Node current = head;
        Node previous = null;

        do {
            if (current.process.processId == processId) {
                if (previous == null) {
                    head = current.next;
                    tail.next = head;
                } else {
                    previous.next = current.next;
                    if (current == tail) {
                        tail = previous;
                    }
                }
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);
    }

    // Execute processes in round-robin fashion
    public void roundRobinScheduling(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        Node current = head;
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;
        int numProcesses = 0;

        // Calculate the number of processes
        Node temp = head;
        do {
            numProcesses++;
            temp = temp.next;
        } while (temp != head);

        // Process execution simulation
        while (numProcesses > 0) {
            if (current.process.remainingTime > 0) {
                System.out.println("Executing Process " + current.process.processId);
                if (current.process.remainingTime > timeQuantum) {
                    current.process.remainingTime -= timeQuantum;
                    totalWaitingTime += current.process.remainingTime;
                    totalTurnaroundTime += timeQuantum;
                    current = current.next;
                } else {
                    totalTurnaroundTime += current.process.remainingTime;
                    totalWaitingTime += (totalTurnaroundTime - current.process.burstTime);
                    removeProcess(current.process.processId);
                    numProcesses--;
                }
            } else {
                current = current.next;
            }
        }

        // Calculate and display the average waiting time and turnaround time
        double averageWaitingTime = (double) totalWaitingTime / numProcesses;
        double averageTurnaroundTime = (double) totalTurnaroundTime / numProcesses;

        System.out.println("Average Waiting Time: " + averageWaitingTime);
        System.out.println("Average Turnaround Time: " + averageTurnaroundTime);
    }

    // Display the current state of the process list
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes to display.");
            return;
        }

        Node current = head;
        do {
            System.out.println("Process ID: " + current.process.processId +
                    ", Burst Time: " + current.process.burstTime +
                    ", Remaining Time: " + current.process.remainingTime);
            current = current.next;
        } while (current != head);
    }
}
