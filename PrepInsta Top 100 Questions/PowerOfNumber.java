// Find the Power of a Number

import java.util.Scanner;

class PowerOfNumber{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Number " );
		int Num = in.nextInt();
		
		System.out.println("Enter the power: ");
		int power = in.nextInt();
		
		int result = 1;
		for(int i = 1; i<= power; i++){
			result *= Num;
		}
		
		System.out.println(Num + "^" + power + " = " + result); 
	}
}

/*
Output: 
	Enter the Number
	2
	Enter the power:
	5
	2^5 = 32
*/