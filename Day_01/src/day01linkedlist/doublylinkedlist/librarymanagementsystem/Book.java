package day01linkedlist.doublylinkedlist.librarymanagementsystem;

//Create the class name book
public class Book {

    //Attributes
    String title;
    String author;
    String genre;
    String bookID;
    boolean isAvailable;
    Book next;
    Book prev;

    //Constructor
    public Book(String title, String author, String genre, String bookID, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookID = bookID;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}
