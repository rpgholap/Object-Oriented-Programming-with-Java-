/*
Problem 25: Command History Tracker
Use Case: Store recent commands in a terminal with limited history.
Requirements:
● Maintain last 3 commands
● Remove oldest when limit exceeded
● Display recent commands
Sample Input:
Commands: "ls", "pwd", "cd ..", "mkdir"
History limit: 3
Expected Output:
Recent Commands: pwd, cd .., mkdir
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CommandHistoryTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> history = new LinkedList<>();

        System.out.println("Enter number of commands:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter commands:");
        int historyLimit = 3; // limit of history

        for (int i = 0; i < n; i++) {
            String command = sc.nextLine().trim();

            // If history is full, remove oldest command
            if (history.size() == historyLimit) {
                history.poll();
            }

            history.add(command);
        }

        // Display recent commands
        System.out.print("Recent Commands: ");
        int count = 0;
        for (String cmd : history) {
            System.out.print(cmd);
            count++;
            if (count < history.size()) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}
