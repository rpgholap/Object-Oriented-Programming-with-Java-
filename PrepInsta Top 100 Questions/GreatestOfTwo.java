// Find the Greatest of the Two Numbers


import java.util.Scanner;

class GreatestOfTwo{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int n1 = in.nextInt();
		System.out.println("Enter the Second Number: ");
		int n2 = in.nextInt();
		
		
		// M1: Ternary Operator
		int result = n1>n2 ? n1 : n2;
		System.out.println("The Greatest number is: " + result);
		
		
		// M2 : 
		// if(n1 == n2){
			// System.out.println("Equal!");
		// }
		// else{
			// int result = n1 > n2 ? n1: n2 ;
			// System.out.println(result + " is largest");
		// }
	}
}

/*
m1: 
if(n1 == n2)  --> eq
else if(n1>n2) --> n1 greater
else --> n2 greater

m2: 
Math.max(n1,n2);

*/


/*
Output: 
	E:\CDAC PREP 2025\CDAC\OOPJ\PrepInsta Top 100 Questions>javac GreatestOfTwo.java

	E:\CDAC PREP 2025\CDAC\OOPJ\PrepInsta Top 100 Questions>java GreatestOfTwo
	Enter First Number:
	23
	Enter the Second Number:
	51
	51 is largest
*/