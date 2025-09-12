/*
	15. Lucky Number Check
	Scenario: A 4-digit number ABCD is lucky if A+B = C+D. Check if a number is lucky.
	Input:
	Enter 4-digit number: 3521
	Output:
	Not a lucky number
*/

import java.util.Scanner;

class LuckyNumberCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 4-digit number: ");
        int num = in.nextInt();

        if (num < 1000 || num > 9999) {
            System.out.println("Please enter a valid 4-digit number.");
        } else {
            int d1 = num / 1000;          // first digit
            int d2 = (num / 100) % 10;    // second digit
            int d3 = (num / 10) % 10;     // third digit
            int d4 = num % 10;            // fourth digit

            if ((d1 + d2) == (d3 + d4)) {
                System.out.println("Lucky number");
            } else {
                System.out.println("Not a lucky number");
            }
        }

        in.close();
    }
}
