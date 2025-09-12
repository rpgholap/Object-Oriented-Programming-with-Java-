// Find the Fibonacci Series up to Nth Term

import java.util.Scanner;
class Fibonacci{
	public static void main(String args[]){
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter the Number of terms : ");
		int n = in.nextInt();
		int a = 0;
		int b = 1;
		System.out.println("Fibonacci series up to " + n + " terms.");
		
		for(int i =1 ; i <= n ; i++){
			System.out.print(a + " " );
			int c  = a + b;
			a = b;
			b = c;
		}
	}
}


/*
output: 

Enter the Number of terms :
15
Fibonacci series up to 15 terms.
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377

*/