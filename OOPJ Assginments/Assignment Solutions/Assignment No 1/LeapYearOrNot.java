// Check Whether or Not the Year is a Leap Year

import java.util.Scanner;

class LeapYearOrNot{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Year: ");
		int year = in.nextInt();
		
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
			System.out.println("The " + year + " is a leap year. ");
		}
		else {
			System.out.println("The "+year+ " is not a leap year.");
		}
	}
}

/*
Output: 
	E:\CDAC PREP 2025\CDAC\OOPJ\OOPJ Assginment 1>java LeapYearOrNot
	Enter the Year:
	2000
	The 2000 is a leap year.

	E:\CDAC PREP 2025\CDAC\OOPJ\OOPJ Assginment 1>java LeapYearOrNot
	Enter the Year:
	2019
	The 2019 is not a leap year.

*/