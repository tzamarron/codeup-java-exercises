import java.util.ArrayList;
import java.util.HashMap;

public class Groceries {
    private ArrayList<HashMap<String,HashMap<String,Integer>>> groceryList;


    public Groceries() {
        this.groceryList = new ArrayList<>();
    }

    public ArrayList<HashMap<String, HashMap<String, Integer>>> getGroceryList() {
        return groceryList;
    }
}

class CateItems {
    private HashMap<String,HashMap<String,Integer>> cateItems;

    public CateItems() {
        cateItems = new HashMap<>();
    }

    public HashMap<String, HashMap<String, Integer>> getCateItems() {
        return cateItems;
    }

    public void setCateItems(HashMap<String, HashMap<String, Integer>> cateItems) {
        this.cateItems = cateItems;
    }
}