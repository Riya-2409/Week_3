package day01linkedlist.circularlinkedlist.onlineticketreservationsystem;

//Create the class name Ticket
public class Ticket {

    //Attributes
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;

    //Constructor
    public Ticket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
    }
}
