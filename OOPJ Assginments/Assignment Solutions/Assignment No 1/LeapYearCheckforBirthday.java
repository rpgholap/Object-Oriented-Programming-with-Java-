/*
	6. Leap Year Check for a Birthday
	Scenario: You want to celebrate your friend’s birthday on Feb 29 if it’s a leap year. Take the year as input
	and check if it’s a leap year.
	Input:
	Enter year: 2024
	Output:
	2024 is a leap year.
*/
import java.util.Scanner;

class LeapYearCheckforBirthday{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = in.nextInt();

        // Leap year logic: divisible by 4, but not by 100 unless divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        in.close();
    }
}