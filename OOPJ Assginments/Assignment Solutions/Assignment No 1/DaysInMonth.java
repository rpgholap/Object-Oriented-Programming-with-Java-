/*
	19. Days in a Month
	Scenario: Take month number (1–12) and print number of days in that month.
	Input:
	Enter month number: 2
	Output:
	28 or 29 days
*/

import java.util.Scanner;

class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 days"); break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 days"); break;
            case 2:
                System.out.println("28 or 29 days"); break;
            default:
                System.out.println("Invalid month number");
        }

        sc.close();
    }
}
