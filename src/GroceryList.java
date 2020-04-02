//import org.w3c.dom.ls.LSOutput;
//import util.Input;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashMap;
//
//public class GroceryList {
//
//    public static void main(String[] args) {
//        // Create instance to use
//        Input input = new Input();
//
//
//        // Prompt if user wants to creat a grocery list
//        if (input.yesNo("Do you want to create a grocery list?\n\t [y/n] > ")){
//
//            GroceryList myGroceryList = new GroceryList();
//
//            //If they pick yes, they will be prompted if they would like to enter a new item.
//            if (input.yesNo("Would you like to enter a new item?\n\t [y/n] > ")){
//
//                //Creates Hashmaps for categories and items
//                HashMap<String,HashMap<String,Integer>> listCategories = new HashMap<>();
//                HashMap<String,Integer> items = new HashMap<>();
//
//                // Boolean variable for below do-while loop
//                boolean isMakingList;
//                do {
//                  //If the users picks yes, they should be given the following three prompts:
//
//                    System.out.println("");//Buffer space
//
//                  // (1) Given an ordered list of grocery categories to choose from, select the category.
//
//                    // Boolean variable for below do-while loop
//                    boolean isInCategory;
//                    do {
//                        // Loop to display numbers with given ArrayList (grocery categories)
//                        int counter = 1;
//                        for (String cate : listCategories()) {
//                            System.out.printf("\t%d - %s\n", counter, cate);
//                            counter++;
//                        }
//
//                        // User chooses category and stored to variable
//                        String userCategory = input.getString("\n\tPlease select one of the above categories:\n\t > ");
//
//                        // Verify user choice is a choice
//                        if (listCategories().contains(userCategory)){
//                            isInCategory = false;
//                        } else {
//                            System.out.println("\tCategory entered is not found.\n");
//                            isInCategory = true;
//                        }
//                    } while (isInCategory);
//
//                    //Enter name of the item.
//                    //                System.out.println(input.getString(""));
//
//                    //Enter how many of the item.
//                    //                System.out.println();
//
//                    //The user will then be given the choice to finalize the list or add an additional item.
//                    //                System.out.println();
//                } while (isMakingList);
//
//                //Once the user finalizes the list, they will be presented with a complete list organized alphabetically and grouped by category, and including quantity.
//
//                //For an extra bonus, allow users to filter the results by only one category of items at a time.
//
//                //For a super gold star bonus, allow users to edit the list items.
//
//
//            } else {
//                // If they choose not to enter a item
//                System.out.println("No problem you can create a list anytime!");
//            }
//
//        } else {
//            // If user did not want to create a grocery list
//            System.out.println("Ok have a great day!");
//        }
//    }
//
//    // Method for creating ArrayList of grocery categories
//    public static ArrayList<String> listCategories(){
//        ArrayList<String> groceryCategories = new ArrayList<>();
//        groceryCategories.add("Meat");
//        groceryCategories.add("Produce");
//        groceryCategories.add("Bakery");
//        groceryCategories.add("Beverages");
//        groceryCategories.add("Dairy");
//        groceryCategories.add("Frozen Foods");
//        groceryCategories.add("Frozen");
//        groceryCategories.add("Canned Goods");
//        groceryCategories.add("Dry Foods");
//        groceryCategories.add("Snacks");
//        Collections.sort(groceryCategories);// sorts it alphabetically
//        return groceryCategories;
//    };
//
//    // Method for checking if key is in a HashMap
//    // if not adding it to HashMap
//    public static void isCategory
//
//
//
//}
