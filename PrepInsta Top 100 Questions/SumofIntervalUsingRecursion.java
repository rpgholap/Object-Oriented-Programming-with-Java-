// Find the Sum of the Numbers in a Given Interval

import java.util.Scanner;

class SumofIntervalUsingRecursion{
  public static void main (String[]args){
	  Scanner in = new Scanner(System.in);
	  System.out.println("Enter the Start of range: ");
	  int num1 = in.nextInt();
	  System.out.println("Enter the End of range: ");
	  int num2 = in.nextInt();
	  int sum = getSum (0, num1, num2);
      System.out.println ("The sum is " + sum);
  }


	  static int getSum (int sum, int i, int num2)
	  {

		// stop when any recursion call tries to go over b (larger number)
		if (i > num2)
		  return sum;

		return i + getSum (sum, i + 1, num2);
	  }
}

/*
	Output:
	E:\CDAC PREP 2025\CDAC\OOPJ\PrepInsta Top 100 Questions>java SumofInterval.java
	Enter the Start of range:
	5
	Enter the End of range:
	10
	The sum is 45
*/