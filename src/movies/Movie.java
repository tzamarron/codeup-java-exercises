package movies;

import util.Input;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Movie {
    Input input = new Input();
    private String name;
    private String category;
    public static String movieChart = "| %-40s | %-20s |\n";
    // Allows reference to Movie
    public Movie(){};

    // Constructor for new Movie
    public Movie(String newName, String newCategory){
        this.name = newName;
        this.category = newCategory;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for category
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Static method that accepts a Movie array and a Movie object
    // A copy of the provided array is made
    // Places Movie object into the array at the end
    // Returns the new array
    public Movie[] addMovie(Movie[] movies, Movie userMovie) {
        Movie[] updatedMovies = Arrays.copyOf(movies, movies.length + 1);
        updatedMovies[updatedMovies.length - 1] = userMovie;
        return updatedMovies;
    }

    public void listMovie(Movie[]movies,String filter){
        System.out.print("+-----------------------------------------------------------------+\n");
        for (Movie movie : movies){
            if (input.isNullOrEmpty(filter)){
                System.out.printf(movieChart,movie.name,movie.category);
                System.out.println("+-----------------------------------------------------------------+");
            }
            else {
                if (movie.category.equals(filter)){
                    System.out.printf(movieChart,movie.name,movie.category);
                    System.out.println("+-----------------------------------------------------------------+");
                }
            }
        }
        System.out.println("+-----------------------------------------------------------------+");
    }

    public Set<String> sortedMovieCategories (Movie[] movies){
        // Creates Set (collection of unique values) for Movie categories
        Set<String> setCategories = new HashSet<String>();
        // Use a enhanced for loop to cycle movies array
        // and add all categories to the Set
        for (Movie movie : movies){
            setCategories.add(movie.getCategory());
        }
        // Using TreeSet to sort above Set and return it
        Set<String> sortCate = new TreeSet<String>(setCategories);
        return sortCate;
    }

}
