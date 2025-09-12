/*
	47. Even/Odd Status of Two Numbers
	Scenario: Take two numbers and print if both are even, both odd, or mixed.
	Input:
	Enter first number: 12
	Enter second number: 17
	Output:
	Numbers are mixed (one even, one odd)
*/

import java.util.Scanner;
class EvenOddTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("Both Even");
        } else if (a % 2 != 0 && b % 2 != 0) {
            System.out.println("Both Odd");
        } else {
            System.out.println("Numbers are mixed (one even, one odd)");
        }
    }
}
