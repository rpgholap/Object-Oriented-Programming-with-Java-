/*
Problem 10: Greeting Message
Scenario: A learning management system generates personalized greeting messages for students. The
system starts with a basic greeting and adds course-specific information.
Task: Use StringBuilder to create a personalized greeting message.
Sample Input:
Initial Text: Hello
Text to insert: CDAC
Insert Index: 6
Text to append: Java Student
Expected Output:
Hello CDAC Java Student
*/
import java.util.Scanner;

class GreetingMessage {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Initial Text: ");
        String initialText = in.nextLine();
        
        System.out.println("Text to insert: ");
        String textToInsert = in.nextLine();
        
        System.out.println("Insert Index: ");
        int index = in.nextInt();
        in.nextLine();  // Consume leftover newline
        
        System.out.println("Text to append: ");
        String appendText = in.nextLine();
        
        StringBuilder sb = new StringBuilder(initialText);
		
		if(index < 0){
			index = 0;
		} else if(index > sb.length()){
			index = sb.length();
		}
			sb.insert(index, " " + textToInsert);
			sb.append(" ").append(appendText);
        
			System.out.println("Output: ");
			System.out.println(sb.toString());
        
		
        in.close();
    }
}
