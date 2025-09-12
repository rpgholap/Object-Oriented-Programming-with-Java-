// Factorial of a Number
// using recursive approch: 
import java.util.Scanner;

class j{

	public static int Fact(int num){
		if( num == 0){
			return 1;
		}
		else {
			return num * Fact(num-1);
		}
	}
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = in.nextInt();	
		int result  =  Fact(num);
		System.out.println("Factorial of " + num + " is: " + result);
		
	}
}

/*
Output: 
	Enter the Number:
	5
	The factorial of 5 is: 120
*/