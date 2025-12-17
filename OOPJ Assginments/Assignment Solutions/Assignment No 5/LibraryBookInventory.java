/*
Problem 15: Library Book Inventory
Use Case: Track available copies of books in a library system.
Requirements:
● Map book titles to available copies
● Update copies when books are borrowed
● Display current inventory
Sample Input:
Initial inventory: "Java" → 3, "Python" → 5
Borrow: "Java" (1 copy)
Expected Output:
Current inventory: Java:2, Python:5
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibraryBookInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HashMap<String, Integer> inventory = new HashMap<>();
        
        // Initial inventory
        System.out.println("Enter number of books in inventory:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        
        System.out.println("Enter book titles and available copies:");
        for (int i = 0; i < n; i++) {
            System.out.print("Book title: ");
            String title = sc.nextLine().trim();
            
            System.out.print("Available copies: ");
            int copies = sc.nextInt();
            sc.nextLine(); // consume newline
            
            inventory.put(title, copies);
        }
        
        // Borrow books
        System.out.println("Enter book title to borrow:");
        String borrowTitle = sc.nextLine().trim();
        
        System.out.println("Enter number of copies to borrow:");
        int borrowCount = sc.nextInt();
        sc.nextLine(); // consume newline
        
        // Update inventory
        if (inventory.containsKey(borrowTitle)) {
            int currentCopies = inventory.get(borrowTitle);
            if (currentCopies >= borrowCount) {
                inventory.put(borrowTitle, currentCopies - borrowCount);
            } else {
                System.out.println("Not enough copies available!");
            }
        } else {
            System.out.println("Book not found in inventory!");
        }
        
        // Display current inventory
        System.out.print("Current inventory: ");
        int count = 0;
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.print(entry.getKey() + ":" + entry.getValue());
            count++;
            if (count < inventory.size()) {
                System.out.print(", ");
            }
        }
        
        sc.close();
    }
}
