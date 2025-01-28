package day01linkedlist.doublylinkedlist.librarymanagementsystem;

//Create the class name LibraryManagementSystem
public class LibraryManagementSystem {

    public static void main(String[] args) {

        //Create library management object
        LibraryManagement library = new LibraryManagement();

        // Add books
        library.addBookAtBeginning("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", "B001", true);
        library.addBookAtEnd("1984", "George Orwell", "Dystopian", "B002", true);
        library.addBookAtEnd("To Kill a Mockingbird", "Harper Lee", "Fiction", "B003", true);
        library.addBookAtPosition("Moby Dick", "Herman Melville", "Adventure", "B004", false, 2);

        // Display books
        library.displayBooksForward();
        library.displayBooksReverse();

        // Search books
        library.searchBook("1984", null);
        library.searchBook(null, "Harper Lee");

        // Update availability
        library.updateAvailability("B003", false);

        // Remove a book
        library.removeBookByID("B004");

        // Display books and count after updates
        library.displayBooksForward();
        library.countBooks();
    }
}
