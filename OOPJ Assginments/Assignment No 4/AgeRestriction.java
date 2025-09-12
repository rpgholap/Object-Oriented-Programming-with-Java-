/*
Problem 6: Age Restriction
Scenario: A professional workshop registration system only allows participants who are 18 years or
older. The system needs a custom exception for age validation.
Task: Create a custom exception class and use it to validate user age during registration.
Sample Input:
16
Expected Output:
AgeNotValidException: Age must be ≥ 18
*/

import java.util.*;
public class AgeRestriction{
	
	//Custom Exception 
	static class AgeNotValidException extends Exception{  // --> Checked Exception
		public AgeNotValidException(String message){
			super(message);
		}
	}

		public static void main(String args[]){
			Scanner in = new Scanner(System.in);
			
			System.out.println("Enter the age");
			int age = in.nextInt();
			
			try{
				if(age < 18){
					throw new AgeNotValidException("Age must be >= 18");
				}else {
                System.out.println("You are allowed.");
            }
			}catch(AgeNotValidException e){
				System.out.println(e.getMessage());
			}
		}
}


/*
Enter the age
12
Age must be >= 18
----------------------------------

Enter the age
19
You are allowed.
*/