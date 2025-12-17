/*
Problem 11: Notification Update
Scenario: A university notification system needs to update announcements when exam schedules change.
The system should efficiently replace old information with new information.
Task: Use StringBuilder to update notification messages.
Sample Input:
Original text: Exam postponed
Text to find: postponed
Replacement Text: rescheduled
Expected Output:
Exam rescheduled
*/

import java.util.Scanner;

class NotificationUpdate{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder(in.nextLine()); //original text
		
		System.out.println("Text to Find: ");
		String textToFind = in.nextLine();
		
		System.out.println("Replacement Text: ");
		String replaceText = in.nextLine();
		
		String result = sb.toString().replace(textToFind, replaceText);
		sb = new StringBuilder(result);
		System.out.println(sb);
	
		}
}

// StringBuilder holds the text, toString() converts it to String, and replace()

/*
output:
Exam postponed
Text to Find: 
postponed
Replacement Text: 
rescheduled
*/