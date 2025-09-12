
// Find the Sum of the Numbers in a Given Interval

import java.util.Scanner;

class SumofInterval{
  public static void main (String[]args)
  {
	  Scanner in = new Scanner(System.in);
	  System.out.println("Enter the Start of range: ");
	  int num1 = in.nextInt();
	  System.out.println("Enter the End of range: ");
	  int num2 = in.nextInt();
	
    int sum = 0;

    for (int i = num1; i <= num2; i++)
        sum = sum + i;
      System.out.println ("The sum is " + sum);
  }
}


/*
	Method 2: 
	int sum = num2*(num2+1)/2 - num1*(num1+1)/2 + num1;
	System.out.println("The Sum is "+ sum);
*/


/*
	Output:
	E:\CDAC PREP 2025\CDAC\OOPJ\PrepInsta Top 100 Questions>java SumofInterval.java
	Enter the Start of range:
	5
	Enter the End of range:
	10
	The sum is 45
*/

