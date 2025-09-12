// Find the Sum of First N Natural Numbers

import java.util.Scanner;

class SumOfNaturalNumbers{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = in.nextInt();
		
		int sum = 0;
		sum = num * (num + 1) / 2;
		System.out.println("The sum of First " + num + " natural Numbers: " + sum);
		
	}
}


/*
	Using for Loop: 
	for (int i = 1; i <= num; i++)
			 sum += i;
		   System.out.println (sum);
	}
*/

/*
	E:\CDAC PREP 2025\CDAC\OOPJ\PrepInsta Top 100 Questions>java SumOfNaturalNumbers.java
	Enter the number:
	10
	The sum of First 10 natural Numbers: 55
*/