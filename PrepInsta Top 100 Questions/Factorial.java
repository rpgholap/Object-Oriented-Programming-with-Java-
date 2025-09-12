// Factorial of a Number

import java.util.Scanner;

class Factorial{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = in.nextInt();
		
		int fact = 1;
		
		for(int i = 1; i <= num; i++){
			fact *= i;
		}
		System.out.println("The factorial of " + num + " is: " + fact);
	}
}

/*
Output: 
	Enter the Number:
	5
	The factorial of 5 is: 120
*/