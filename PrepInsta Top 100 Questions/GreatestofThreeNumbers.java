// Find the Greatest of the Three Numbers

import java.util.Scanner;

class GreatestofThreeNumbers{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int n1 = in.nextInt();
		System.out.println("Enter Second Number: ");
		int n2 = in.nextInt();
		System.out.println("Enter third Number: ");
		int n3 = in.nextInt();
		
		// M1: ternary Operator 
		
		int temp = n1 > n2 ? n1 : n2;
		int result = temp > n3 ? temp : n3;
		System.out.println("The Greatest Number is: " + result);
		
		//M2: 
		
			// int max = n1;
			// if(n2 > max){
				// max = n2;
			// }
			// if(n3>max){
				// max = n3;
			// }
			
			// System.out.println("Greatest of Three Numbers is: " + max);
	}
}


/*
output:
	E:\CDAC PREP 2025\CDAC\OOPJ\PrepInsta Top 100 Questions>javac GreatestofThreeNumbers.java

	E:\CDAC PREP 2025\CDAC\OOPJ\PrepInsta Top 100 Questions>java GreatestofThreeNumbers
	Enter First Number:
	12
	Enter Second Number:
	1
	Enter third Number:
	70
	Greatest of Three Numbers is: 70


*/