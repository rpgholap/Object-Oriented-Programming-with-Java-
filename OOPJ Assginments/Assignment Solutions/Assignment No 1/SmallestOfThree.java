/*
	36. Smallest of Three Numbers (Nested Ternary)
	Scenario: Take three numbers as input and print the smallest using nested ternary operator.
	Input:
	Enter numbers: 12, 8, 19
	Output:
	Smallest number: 8
*/

import java.util.Scanner;
class SmallestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int smallest = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
        System.out.println("Smallest number: " + smallest);
    }
}
