package day01linkedlist.doublylinkedlist.librarymanagementsystem;

//Create the class name LibraryManagement
public class LibraryManagement {

    private Book head;
    private Book tail;

    // Add a new book at the beginning
    public void addBookAtBeginning(String title, String author, String genre, String bookID, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookID, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
        System.out.println("Book added at the beginning: " + title);
    }

    // Add a new book at the end
    public void addBookAtEnd(String title, String author, String genre, String bookID, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookID, isAvailable);
        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        System.out.println("Book added at the end: " + title);
    }

    // Add a new book at a specific position
    public void addBookAtPosition(String title, String author, String genre, String bookID, boolean isAvailable, int position) {
        if (position <= 0) {
            addBookAtBeginning(title, author, genre, bookID, isAvailable);
            return;
        }

        Book newBook = new Book(title, author, genre, bookID, isAvailable);
        Book temp = head;
        int count = 0;

        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            addBookAtEnd(title, author, genre, bookID, isAvailable);
        } else {
            newBook.next = temp.next;
            newBook.prev = temp;
            if (temp.next != null) {
                temp.next.prev = newBook;
            }
            temp.next = newBook;
            if (newBook.next == null) {
                tail = newBook;
            }
            System.out.println("Book added at position " + position + ": " + title);
        }
    }

    // Remove a book by Book ID
    public void removeBookByID(String bookID) {
        if (head == null) {
            System.out.println("No books to remove.");
            return;
        }

        Book temp = head;

        while (temp != null) {
            if (temp.bookID.equals(bookID)) {
                if (temp == head) {
                    head = head.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else if (temp == tail) {
                    tail = tail.prev;
                    if (tail != null) {
                        tail.next = null;
                    }
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                System.out.println("Book removed: " + temp.title);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found with ID: " + bookID);
    }

    // Search for a book by title or author
    public void searchBook(String title, String author) {
        if (head == null) {
            System.out.println("No books available.");
            return;
        }

        Book temp = head;
        boolean found = false;

        System.out.println("Search Results:");
        while (temp != null) {
            if ((title != null && temp.title.equalsIgnoreCase(title)) ||
                    (author != null && temp.author.equalsIgnoreCase(author))) {
                System.out.println("Title: " + temp.title + ", Author: " + temp.author +
                        ", Genre: " + temp.genre + ", Book ID: " + temp.bookID +
                        ", Available: " + (temp.isAvailable ? "Yes" : "No"));
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No books found matching the criteria.");
        }
    }

    // Update a book's availability status by Book ID
    public void updateAvailability(String bookID, boolean isAvailable) {
        if (head == null) {
            System.out.println("No books available.");
            return;
        }

        Book temp = head;

        while (temp != null) {
            if (temp.bookID.equals(bookID)) {
                temp.isAvailable = isAvailable;
                System.out.println("Availability updated for Book ID: " + bookID +
                        " to " + (isAvailable ? "Available" : "Unavailable"));
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found with ID: " + bookID);
    }

    // Display all books in forward order
    public void displayBooksForward() {
        if (head == null) {
            System.out.println("No books to display.");
            return;
        }

        Book temp = head;
        System.out.println("Books in Forward Order:");
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Author: " + temp.author +
                    ", Genre: " + temp.genre + ", Book ID: " + temp.bookID +
                    ", Available: " + (temp.isAvailable ? "Yes" : "No"));
            temp = temp.next;
        }
    }

    // Display all books in reverse order
    public void displayBooksReverse() {
        if (tail == null) {
            System.out.println("No books to display.");
            return;
        }

        Book temp = tail;
        System.out.println("Books in Reverse Order:");
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Author: " + temp.author +
                    ", Genre: " + temp.genre + ", Book ID: " + temp.bookID +
                    ", Available: " + (temp.isAvailable ? "Yes" : "No"));
            temp = temp.prev;
        }
    }

    // Count the total number of books
    public void countBooks() {
        int count = 0;
        Book temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total number of books in the library: " + count);
    }
}
