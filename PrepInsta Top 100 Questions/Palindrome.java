// Check Whether or Not the Number is a Palindrome

import java.util.Scanner;

class Palindrome{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = in.nextInt();
		int reverse_no = 0 , remainder;
		
		int number = n;      // original number
		
		while(n != 0){
			remainder = n % 10;
			reverse_no = reverse_no * 10 + remainder;
			n /= 10;
		}
		
		if(number == reverse_no ){
			System.out.println(number + " is Palindrome.");
		}
		else{
			System.out.println(number + " is not Palindrome.");
		}
	}
}

/*
output:

Enter the number:
2442
2442 is Palindrome.

java Palindrome
Enter the number:
1234
1234 is not Palindrome.
*/