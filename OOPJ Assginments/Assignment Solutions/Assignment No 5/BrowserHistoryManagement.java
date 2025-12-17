/*
Problem 23: Browser History Management
Use Case: Maintain browser history with back functionality.
Requirements:
● Store visited pages
● Implement back navigation (LIFO)
● Display current history
Sample Input:
Pages visited: "Google", "YouTube", "GFG"
Action: Back (1 page)
Expected Output:
Current history: Google, YouTube
*/

import java.util.Scanner;
import java.util.Stack;

public class BrowserHistoryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> history = new Stack<>();

        // Input visited pages
        System.out.println("Enter number of pages visited:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter page names:");
        for (int i = 0; i < n; i++) {
            String page = sc.nextLine().trim();
            history.push(page); // add page to history
        }

        // Back operation
        System.out.println("Enter number of pages to go back:");
        int backCount = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < backCount && !history.isEmpty(); i++) {
            history.pop(); // remove last visited page
        }

        // Display current history
        System.out.print("Current history: ");
        for (int i = 0; i < history.size(); i++) {
            System.out.print(history.get(i));
            if (i < history.size() - 1) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}
