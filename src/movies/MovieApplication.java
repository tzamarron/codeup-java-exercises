package movies;

import util.Input;

import javax.swing.*;

public class MovieApplication {

    public static void main(String[] args) {
        // New instances to allow access
        Input input = new Input();
        Movie refMovie = new Movie();
        // Creates array of movies
        Movie[] movieList = MoviesArray.findAll();
        // Sets boolean for do-while
        boolean willContinue = true;

        // Ask what they would like to do
        System.out.println("What would you like to do?\n");

        // Do-while loop that shows user options
        // Based on user options displays movies, adds a movie or exits
        do {
            // Display options for user
            System.out.println("" +
                    "\t0 - exit\n" +
                    "\t1 - view all movies\n" +
                    "\t2 - view movies in a certain category\n" +
                    "\t3 - add a movie\n");

            // Ask user for their choice and capture it
            int userChoice = input.getInt(0,6,"Enter your choice: ");
            System.out.println(); // Buffer between lines
            // Determines what to do based on userChoice
            switch (userChoice) {
                // User wants to exit
                case 0:
                    willContinue = false;
                case 1:
                    // Display all Movies
                    refMovie.listMovie(movieList,"");
                    break;
                case 2:
                    // User wants to filter movies
                    // Ask user to pick from categories
                    System.out.println("Which category do you want to see movies from: ");
                    System.out.println();
                    break;
                default:
                    Movie usermovie = new Movie(
                            input.getString("Enter movie title : "),
                            input.getString("Enter movie category : "));
                    movieList = refMovie.addMovie(movieList, usermovie);
                    break;
            }
        } while (willContinue);

    }
}
