// Find the Reverse of a Number

import java.util.Scanner;
class ReverseNumber1{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		int reverse = 0, rem;
		
		while(num !=0){
			rem = num % 10;        // Get the last digit of the number
			reverse = reverse * 10 + rem; // Append it to the reverse number
			num = num / 10;        // Remove the last digit from the number
		}
	}
}