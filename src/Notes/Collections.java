package Notes;

import java.util.ArrayList;
import java.util.HashMap;

public class Collections {
    public static void main(String[] args) {

        // *************************************************** //
        // ********* ArrayList and its Methods *************** //
        // *************************************************** //

        // 1. Initialize an ArrayList of Strings, called roasts
        ArrayList<String> roasts = new ArrayList<>();

        //   add light, medium, medium, dark to the array list, one at a time
        roasts.add("light");
        roasts.add("medium");
        roasts.add("medium");
        roasts.add("dark");

        System.out.println(roasts);

        // 2. Check to see if the list contains "dark" , and then "espresso"
        boolean result;
        result= roasts.contains("dark");
        System.out.println(result);
        result = roasts.contains("espresso");
        System.out.println(result);

        // 3. Find the last index of "medium" in the array
        int index = roasts.lastIndexOf("medium");
        System.out.println(index);
        // 4. Check if the array list is empty
        result = roasts.isEmpty();
        System.out.println(result);
        // 5. Assign the array list an empty ArrayList object, and then check if empty
//        roasts = new ArrayList<>();
//        result = roasts.isEmpty();
//        System.out.println(result);
        // 6. Remove the espresso roast
//        roasts.remove(4);
        roasts.add("espresso");
        System.out.println(roasts);
        roasts.remove("espresso");

        // 7. Remove the element at index 2
        roasts.remove(2);
        System.out.println(roasts);


        // *************************************************** //
        // ********* Hash Maps and their Methods ************* //
        // *************************************************** //

        // 1. Create a HashMap called usernames that contains:
        //   a. first name
        //   b. Github username
        // 2. re-initialize the HashMap using the .clear() method
        // 3. use the .put() method to add "Casey" -> "fridaynext" back to the map
        // 4. use the .putIfAbsent() method to add
        //   a. "Vivian" -> "viviancan"
        //   b. "Casey" -> "XpenguinX"
        // 5. What happend with the .putIfAbsent()? Did both items get added? Why/why not?
        // 6. Use the .remove() method to remove "Casey"
        // 7. Use the .replace() method to change Vivian's username to "viviancandev"
        // 8. Use the .clear() method to clear the map
        // 9. Use the .isEmpty() method to verify that it was cleared

    }
}