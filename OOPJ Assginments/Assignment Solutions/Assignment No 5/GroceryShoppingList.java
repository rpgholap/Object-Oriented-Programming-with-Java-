/*
Problem 4: Grocery Shopping List
Use Case: A person maintains a grocery list and removes items as they purchase them.
Requirements:
● Add items to grocery list
● Remove purchased items
● Display remaining items
Sample Input:
Add items: "Milk", "Eggs", "Bread"
Purchase: "Milk"
Expected Output:
Items to buy: Eggs, Bread
*/


import java.util.ArrayList;
import java.util.List;

public class GroceryShoppingList {
    public static void main(String[] args) {
        // Create a list to store grocery items
        List<String> groceryList = new ArrayList<>();

        // Add items
        groceryList.add("Milk");
        groceryList.add("Eggs");
        groceryList.add("Bread");

        // Purchase an item (remove from the list)
        String purchasedItem = "Milk";
        if (groceryList.contains(purchasedItem)) {
            groceryList.remove(purchasedItem);
            System.out.println(purchasedItem + " has been purchased and removed.");
        } else {
            System.out.println(purchasedItem + " is not in the list.");
        }

        // Display remaining items
        System.out.print("Items to buy: ");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.print(groceryList.get(i));
            if (i < groceryList.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

