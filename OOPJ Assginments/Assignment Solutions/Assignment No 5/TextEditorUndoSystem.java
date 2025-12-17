/*
Problem 21: Text Editor Undo System
Use Case: Implement undo functionality for a text editor.
Requirements:
● Track user actions in order
● Implement undo operation (LIFO)
● Display current action history
Sample Input:
Actions: "Type A", "Type B", "Delete"
Operation: Undo last action
Expected Output:
Current actions: Type A, Type B
*/

import java.util.Scanner;
import java.util.Stack;

public class TextEditorUndoSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> actions = new Stack<>();

        System.out.println("Enter number of actions:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter actions (e.g., Type A, Delete):");
        for (int i = 0; i < n; i++) {
            String action = sc.nextLine().trim();
            actions.push(action);
        }

        // Perform undo operation
        System.out.println("Undo last action? (yes/no):");
        String undo = sc.nextLine().trim();
        if (undo.equalsIgnoreCase("yes") && !actions.isEmpty()) {
            actions.pop(); // remove the last action
        }

        // Display current actions
        System.out.print("Current actions: ");
        for (int i = 0; i < actions.size(); i++) {
            System.out.print(actions.get(i));
            if (i < actions.size() - 1) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}
