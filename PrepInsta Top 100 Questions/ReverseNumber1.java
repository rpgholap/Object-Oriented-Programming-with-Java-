// Find the Reverse of a Number

import java.util.Scanner;
class ReverseNumber1{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = in.nextInt();
		
		int reverse = 0, rem;
		
		while(num !=0){
			rem = num % 10;
			reverse = reverse * 10 + rem;
			num /= 10;
		}
		
		System.out.println("The reverse of " + num + " is: " + reverse);
	}
}


/*
Output: 
	E:\CDAC PREP 2025\CDAC\OOPJ\PrepInsta Top 100 Questions>java ReverseNumber1
	Enter the number:
	1234
	The reverse of 0 is: 4321

	E:\CDAC PREP 2025\CDAC\OOPJ\PrepInsta Top 100 Questions>java ReverseNumber1
	Enter the number:
	4321
	The reverse of 0 is: 1234
*/