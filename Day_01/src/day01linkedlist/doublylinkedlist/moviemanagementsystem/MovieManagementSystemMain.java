package day01linkedlist.doublylinkedlist.moviemanagementsystem;

//Create the class name MovieManagementSystemMain
public class MovieManagementSystemMain {

    public static void main(String[] args) {

        MovieManagement system = new MovieManagement();

        // Adding movies
        system.addMovieAtBeginning("Pulp Fiction", "Quentin Tarantino", 2010, 8.8);
        system.addMovieAtEnd("Taxidermia", "György Pálfi", 2008, 9.0);
        system.addMovieAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
        system.addMovieAtPosition("Trainspotting", "Danny Boyle", 2017, 8.0, 2);

        // Display movies
        system.displayMoviesForward();
        system.displayMoviesReverse();

        // Search movies
        System.out.println("\nSearch by Director:");
        system.searchMovie("Christopher Nolan", null);

        System.out.println("\nSearch by Rating:");
        system.searchMovie(null, 8.8);

        // Update movie rating
        system.updateMovieRating("Pulp Fiction", 9.1);

        // Remove a movie
        system.removeMovieByTitle("Interstellar");

        // Display movies after updates
        System.out.println("\nMovies after updates:");
        system.displayMoviesForward();
    }

}
