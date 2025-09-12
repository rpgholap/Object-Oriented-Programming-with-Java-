// Write a program to check if a given number is prime or not

import java.util.Scanner;
class PrimeorNot{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = in.nextInt();
		
		if(isPrime(n)){
			System.out.println(n + " is prime number.");
		}
		else{
			System.out.println(n+ " is not prime number.");
		}
	}
	
	static boolean isPrime(int n){
		if(n <=1 ) {
			return false;
		}
		
		if( n == 2 || n ==3 ){
			return true;
		}
		
		if( n%2 == 0 || n%3 == 0){
			return false;
		}
		
		for(int i = 5; i <= Math.sqrt(n); i = i + 6){
			if(n%i == 0  || (n%(i+1) == 0)){
				return false;
			}
		}
		return true;
	}
	
}

/*
output:
	Enter the number:
	0
	0 is not prime number.

	E:\CDAC PREP 2025\CDAC\OOPJ\OOPJ Assginment 1>java PrimeorNot.java
	Enter the number:
	5
	5 is prime number.
*/