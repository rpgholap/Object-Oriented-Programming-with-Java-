/*
	37. Leap Year Check (Ternary)
	Scenario: Take a year as input and check if it is a leap year using ternary operator.
	Input:
	Enter year: 2024
	Output:
	Leap Year
*/

import java.util.Scanner;
class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        String result = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) 
                        ? "Leap Year" : "Not a Leap Year";
        System.out.println(result);
    }
}
