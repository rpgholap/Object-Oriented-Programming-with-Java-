/*
	43. Sum of Digits of a Number
	Scenario: Take a number as input and print the sum of its digits.
	Input:
	Enter number: 482
	Output:
	Sum of digits: 14
*/

import java.util.Scanner;
class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int sum = 0;

        while (num > 0) {
            int d = num % 10;
            sum = sum + d;
            num = num / 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}

