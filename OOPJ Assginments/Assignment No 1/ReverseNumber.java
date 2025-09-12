/*
	14. Reverse a 4-Digit Number
	Scenario: Take a 4-digit number and print its reverse.
	Input:
	Enter 4-digit number: 1234
	Output:
	Reversed number: 4321
*/

import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 4-digit number: ");
        int num = in.nextInt();

        int reversed = 0, temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        System.out.println("Reversed number: " + reversed);

        in.close();
    }
}
