package day01linkedlist.circularlinkedlist.onlineticketreservationsystem;

//Create the class name TicketReservationSystemMain
public class TicketReservationSystemMain {

    public static void main(String[] args) {

        //Create the TicketReservation object
        TicketReservation ticketSystem = new TicketReservation();

        // Add some ticket reservations
        ticketSystem.addTicket(new Ticket(101, "Riya", "Pushpa 2", "A1", "10:00 AM"));
        ticketSystem.addTicket(new Ticket(102, "Ram", "Hero", "B2", "1:00 PM"));
        ticketSystem.addTicket(new Ticket(103, "Sita", "Tarzan", "C3", "4:00 PM"));

        // Display all tickets
        ticketSystem.displayTickets();

        // Search for tickets by customer name or movie name
        System.out.println("\nSearching for tickets:");
        ticketSystem.searchTicket("Alice");
        ticketSystem.searchTicket("Inception");
        ticketSystem.searchTicket("Titanic");  // Not in the system

        // Remove a ticket
        System.out.println("\nRemoving ticket with ID 102:");
        ticketSystem.removeTicket(102);
        ticketSystem.displayTickets();

        // Calculate total tickets
        System.out.println("\nTotal tickets booked: " + ticketSystem.totalTickets());
    }
}
