// Check Whether a Number is Even or Odd

import java.util.Scanner;
class EvenOddNumber{
	public static void main(String args[]){
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = in.nextInt();
		
		String result = num % 2 == 0 ? "The number is Even" : "The number is Odd";
		System.out.println(result);
	}
}


/*
	E:\CDAC PREP 2025\CDAC\OOPJ\PrepInsta Top 100 Questions>java EvenOddNumber.java
	Enter the Number:
	4
	The number is Even

	E:\CDAC PREP 2025\CDAC\OOPJ\PrepInsta Top 100 Questions>java EvenOddNumber.java
	Enter the Number:
	1
	The number is Odd
*/


