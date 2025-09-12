// Find the Sum of the Digits of a Number
import java.util.Scanner;

class SumofDigits{
	public static void main(String args[]){
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = in.nextInt();
		int sum = 0 ;
		
		while(num != 0){
			sum += num % 10;			
			num  = num / 10;
		}
		System.out.println("sum of digits: "+sum);
	}
}

/*
	output: 
	Enter the number:
	12345
	sum of digits: 15
*/