package movies;

import util.Input;

public class MoviesApplication {

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
            int userChoice = input.getInt(0, 6, "Enter your choice: ");
            System.out.println(); // Buffer between lines
            // Determines what to do based on userChoice
            switch (userChoice) {
                // User wants to exit
                case 0:
                    willContinue = false;
                    break;
                case 1:
                    // Display all Movies
                    refMovie.listMovie(movieList, "");
                    break;
                case 2:
                    // User wants to filter movies
                    // Ask user to pick from categories
                    input.getString("Current Movie Categories: " + refMovie.sortedMovieCategories(movieList) + "\nWhich category do you want to see movies from: \n");
                    String userCategory = input.getString();
                    refMovie.listMovie(movieList, userCategory);
                    break;
                default:
                    input.getString("Enter movie title : ");
                    String newTitle = input.getString();
                    String newCategory = input.getString("Enter movie category : ");
//                    String newCategory = input.getString();
                    Movie usermovie = new Movie(newTitle, newCategory);
                    movieList = refMovie.addMovie(movieList, usermovie);
                    System.out.println("Your movie has been added!");
                    break;
            }
        } while (willContinue);

    }
}
