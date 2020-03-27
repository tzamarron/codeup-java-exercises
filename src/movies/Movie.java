package movies;

import java.util.Arrays;

public class Movie {
    private String name;
    private String category;

    public Movie(){}

    public Movie(String newName, String newCategory){
        this.name = newName;
        this.name = newCategory;
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

}
