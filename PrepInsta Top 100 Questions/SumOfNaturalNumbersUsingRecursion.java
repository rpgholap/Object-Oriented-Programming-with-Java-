// Find the Sum of First N Natural Numbers

import java.util.Scanner;

class SumOfNaturalNumbersUsingRecursion{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = in.nextInt();
		int sum = getSum(num);
		System.out.println("The sum of First " + num + " natural Numbers: " + sum);
	}
	
	static int getSum(int num){
		if(num == 0 ){
			return num;
		}
		else{
			return num + getSum(num-1);
		}
	}
}


