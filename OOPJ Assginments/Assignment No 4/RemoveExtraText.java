/*
Problem 12: Remove Extra Text
Scenario: An automated message system sometimes adds extra text that needs to be removed before
sending messages to students.
Task: Use StringBuilder to clean up message content.
Sample Input:
Original Text: Please read - Do not disturb
Exact substring to delete: - Do not disturb
Expected Output:
Please read
*/

import java.util.Scanner;

class RemoveExtraText {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Original Text:");
        StringBuilder originalText = new StringBuilder(in.nextLine());

        System.out.println("Exact substring to delete:");
        String substringToDelete = in.nextLine();

        int index = originalText.indexOf(substringToDelete);
        if (index != -1) {
            originalText.delete(index, index + substringToDelete.length());
        }

        System.out.println("Expected Output:");
        System.out.println(originalText.toString());
        
        in.close();
    }
}

/*
output:
Original Text:
please read - do not distrub
Exact substring to delete:
- do not distrub
Expected Output:
please read
*/