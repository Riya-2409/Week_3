package day01linkedlist.doublylinkedlist.moviemanagementsystem;

//Create the class name MovieManagement
public class MovieManagement {

    //Attributes
    private Movie head;
    private Movie tail;

    //constructor
    public MovieManagement(){
        this.head = null;
        this.tail = null;
    }

    // Add a movie at the beginning of the list
    public void addMovieAtBeginning(String title, String director, int yearOfRelease, double rating) {

        Movie newMovie = new Movie(title, director, yearOfRelease, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
        System.out.println("Movie added at the beginning: " + title);
    }

    // Add a movie at the end of the list
    public void addMovieAtEnd(String title, String director, int yearOfRelease, double rating) {

        Movie newMovie = new Movie(title, director, yearOfRelease, rating);
        if (tail == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
        System.out.println("Movie added at the end: " + title);
    }

    // Add a movie at a specific position
    public void addMovieAtPosition(String title, String director, int yearOfRelease, double rating, int position) {
        if (position <= 0) {
            addMovieAtBeginning(title, director, yearOfRelease, rating);
            return;
        }

        Movie newMovie = new Movie(title, director, yearOfRelease, rating);
        Movie temp = head;
        int count = 0;

        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            addMovieAtEnd(title, director, yearOfRelease, rating);
        } else {
            newMovie.next = temp.next;
            newMovie.prev = temp;
            if (temp.next != null) {
                temp.next.prev = newMovie;
            }
            temp.next = newMovie;
            if (newMovie.next == null) {
                tail = newMovie;
            }
            System.out.println("Movie added at position " + position + ": " + title);
        }
    }

    // Remove a movie by title
    public void removeMovieByTitle(String title) {
        if (head == null) {
            System.out.println("No movies to remove.");
            return;
        }

        Movie temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
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
                System.out.println("Movie removed: " + title);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Movie not found: " + title);
    }

    // Search for a movie by director or rating
    public void searchMovie(String director, Double rating) {
        if (head == null) {
            System.out.println("No movies available.");
            return;
        }

        Movie temp = head;
        boolean found = false;

        System.out.println("Search Results:");
        while (temp != null) {
            if ((director != null && temp.director.equalsIgnoreCase(director)) ||
                    (rating != null && temp.rating == rating)) {
                System.out.println("Title: " + temp.title + ", Director: " + temp.director +
                        ", Year: " + temp.yearOfRelease + ", Rating: " + temp.rating);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found matching the criteria.");
        }
    }

    // Update a movie's rating by title
    public void updateMovieRating(String title, double newRating) {
        if (head == null) {
            System.out.println("No movies available.");
            return;
        }

        Movie temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Updated rating for " + title + " to " + newRating);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Movie not found: " + title);
    }

    // Display all movies in forward order
    public void displayMoviesForward() {
        if (head == null) {
            System.out.println("No movies to display.");
            return;
        }

        Movie temp = head;
        System.out.println("Movies (Forward Order):");
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Director: " + temp.director +
                    ", Year: " + temp.yearOfRelease + ", Rating: " + temp.rating);
            temp = temp.next;
        }
    }

    // Display all movies in reverse order
    public void displayMoviesReverse() {
        if (tail == null) {
            System.out.println("No movies to display.");
            return;
        }

        Movie temp = tail;
        System.out.println("Movies (Reverse Order):");
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Director: " + temp.director +
                    ", Year: " + temp.yearOfRelease + ", Rating: " + temp.rating);
            temp = temp.prev;
        }
    }
}
