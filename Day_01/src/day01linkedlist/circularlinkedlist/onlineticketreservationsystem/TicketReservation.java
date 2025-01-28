package day01linkedlist.circularlinkedlist.onlineticketreservationsystem;

//Create the class name TicketReservation
public class TicketReservation {

    class Node {

        //Attributes
        Ticket ticket;
        Node next;

        //Constructor
        public Node(Ticket ticket) {
            this.ticket = ticket;
            this.next = null;
        }
    }

    private Node head = null;
    private Node tail = null;

    // Add a new ticket reservation at the end of the list
    public void addTicket(Ticket ticket) {
        Node newNode = new Node(ticket);
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

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        Node current = head;
        Node previous = null;

        do {
            if (current.ticket.ticketId == ticketId) {
                if (previous == null) {
                    head = head.next;
                    tail.next = head;
                } else {
                    previous.next = current.next;
                    if (current == tail) {
                        tail = previous;
                    }
                }
                System.out.println("Ticket with ID " + ticketId + " has been removed.");
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);

        System.out.println("Ticket with ID " + ticketId + " not found.");
    }

    // Display all tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Node current = head;
        System.out.println("Current Tickets:");
        do {
            System.out.println("Ticket ID: " + current.ticket.ticketId +
                    ", Customer Name: " + current.ticket.customerName +
                    ", Movie Name: " + current.ticket.movieName +
                    ", Seat Number: " + current.ticket.seatNumber +
                    ", Booking Time: " + current.ticket.bookingTime);
            current = current.next;
        } while (current != head);
    }

    // Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String query) {
        if (head == null) {
            System.out.println("No tickets to search.");
            return;
        }

        Node current = head;
        boolean found = false;

        do {
            if (current.ticket.customerName.equalsIgnoreCase(query) ||
                    current.ticket.movieName.equalsIgnoreCase(query)) {
                System.out.println("Found Ticket: ");
                System.out.println("Ticket ID: " + current.ticket.ticketId +
                        ", Customer Name: " + current.ticket.customerName +
                        ", Movie Name: " + current.ticket.movieName +
                        ", Seat Number: " + current.ticket.seatNumber +
                        ", Booking Time: " + current.ticket.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("No ticket found for query: " + query);
        }
    }

    // Calculate the total number of booked tickets
    public int totalTickets() {
        if (head == null) return 0;

        Node current = head;
        int count = 0;

        do {
            count++;
            current = current.next;
        } while (current != head);

        return count;
    }
}
