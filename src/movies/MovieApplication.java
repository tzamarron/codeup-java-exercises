package movies;

import util.Input;

public class MovieApplication {

    public static void main(String[] args) {
        // New instances to allow access
        Input input = new Input();
        //Creates array of movies
        Movie[] movieList = MoviesArray.findAll();
        // Sets boolean for do-while
        boolean willContinue = true;

        // Ask what they would like to do
        System.out.println("What would you like to do?\n");

        // Display options for user
        System.out.println("" +
                "\t0 - exit\n" +
                "\t1 - view all movies\n" +
                "\t2 - view movies in the animated category\n" +
                "\t3 - view movies in the drama category\n" +
                "\t4 - view movies in the horror category\n" +
                "\t5 - view movies in the scifi category\n" +
                "\t6 - add a movie\n");

        // Ask user for their choice and capture it
        int userChoice = input.getInt(0,6,"Enter your choice: ");
        System.out.println();
        // Determines what to do
        do {
            switch (userChoice) {
                case 0:
                    willContinue = false;
                case 1:
                    // Display all
                    break;
                case 2:
                    // Display animated
                    break;
                case 3:
                    // Display drama
                    break;
                case 4:
                    // Display horror
                    break;
                case 5:
                    // Display scifi
                    break;
                default:
                    Movie usermovie = new Movie(
                            input.getString("Enter movie title : "),
                            input.getString("Enter movie category : "));
                    usermovie.addMovie(movieList, usermovie);
                    break;
            }
        } while (willContinue);

    }
}
