/*
Problem 15: Meeting Notification
Scenario: A corporate meeting scheduler needs to build complete meeting notifications by adding time
and location details to basic meeting announcements.
Task: Use StringBuffer to create detailed meeting notifications.
Sample Input:
Base text: Meeting:
Text to append: Friday at 5 PM
Expected Output:
Meeting: Friday at 5 PM
*/

import java.util.Scanner;

class MeetingNotification {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Base text:");
        StringBuffer baseText = new StringBuffer(in.nextLine());

        System.out.println("Text to append:");
        String appendText = in.nextLine();

        baseText.append(" " + appendText);

        System.out.println("Expected Output:");
        System.out.println(baseText.toString());

        in.close();
    }
}

/*
output:
Base text:
Meeting:
Text to append:
Friday at 5 PM
Expected Output:
Meeting: Friday at 5 PM
*/
