// Write a program to print Prime numbers in a given range

import java.util.Scanner;
class PrimeorNotInRange{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the start of range: ");
		int start = in.nextInt();
		System.out.println("Enter the end of range: ");
		int end = in.nextInt();
	
		System.out.println("The prime numbers in given range are: ");
		for(int n = start ; n <= end; n++){
			if(isPrime(n)){
				System.out.println(n + " ");
			}
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
*/