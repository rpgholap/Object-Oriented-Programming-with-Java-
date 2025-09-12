// Find the Fibonacci Series up to Nth Term

import java.util.Scanner;

class NthTermFromFibonacci{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = in.nextInt();
		int a = 0;
		int b = 1;
		int nth = 0;
		
		if(n == 1 ){
			nth = a;
		}
		else if(n == 2){
			nth = b;
		}
		else{
			for(int i = 3; i<= n; i++){
				nth = a + b;
				a = b;
				b = nth;
			}
		}
		System.out.println("The " + n + " th Fibonacci Number is: " + nth);
	}
}

/*
output:
Enter n:
1
The 1 th Fibonacci Number is: 0

Enter n:
2
The 2 th Fibonacci Number is: 1

*/