/*
Problem 9: Marks Validation
Scenario: An online examination system needs to validate that marks entered by teachers are within valid
range (0-100). Negative marks should not be allowed.
Task: Create a marks validation method that throws an exception for invalid marks.
Sample Input:
-5
Expected Output:
Invalid marks
*/

import java.util.*;

class MarksValidation{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the marks: ");
		int marks = in.nextInt();
		
		try{
			if(marks > 0 && marks <= 100){
				System.out.println("Valid Marks");
			}
			else{
				throw new Exception("Invalid marks.");
			}
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}

/*
output:

Enter the marks:
-2
Invalid marks.
--------------------------
Enter the marks:
12
Valid Marks

*/