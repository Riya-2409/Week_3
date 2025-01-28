package day01linkedlist.doublylinkedlist.moviemanagementsystem;

//Create the class name Movie
public class Movie {

    //Attributes
    String title;
    String director;
    int yearOfRelease;
    double rating;
    Movie next;
    Movie prev;

    //Constructor
    public Movie(String title, String director, int yearOfRelease, double rating) {
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}
