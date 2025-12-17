/*
Problem 19: Message Update System
Scenario: A communication system needs to update message status from "Old Notice" to "Updated
Notice" when information is refreshed.
Task: Use StringBuffer to update message status.
Sample Input:
Original text: Old Notice
Text to find: Old
Replacement text: Updated
Expected Output:
Updated Notice
*/

import java.util.Scanner;

class MessageUpdateSystem {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Original text:");
        StringBuffer message = new StringBuffer(in.nextLine());

        System.out.println("Text to find:");
        String findText = in.nextLine();

        System.out.println("Replacement text:");
        String replaceText = in.nextLine();

        int index = message.indexOf(findText);
        if (index != -1) {
            message.replace(index, index + findText.length(), replaceText);
        }

        System.out.println("Expected Output:");
        System.out.println(message.toString());

        in.close();
    }
}
