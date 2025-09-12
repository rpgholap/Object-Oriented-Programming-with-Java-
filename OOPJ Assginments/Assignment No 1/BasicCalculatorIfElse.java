/*
	20. Basic Calculator Using If-Else
	Scenario: Create a calculator that takes two numbers and an operator (+, -, *, /) and prints result using
	nested if-else.
	Input:
	Enter first number: 10
	Enter second number: 5
	Enter operator: *
	Output:
	Result: 50
*/

import java.util.Scanner;

class BasicCalculatorIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        if (op == '+') {
            System.out.println("Result: " + (num1 + num2));
        } else if (op == '-') {
            System.out.println("Result: " + (num1 - num2));
        } else if (op == '*') {
            System.out.println("Result: " + (num1 * num2));
        } else if (op == '/') {
            if (num2 != 0) {
                System.out.println("Result: " + (num1 / num2));
            } else {
                System.out.println("Error: Division by zero not allowed");
            }
        } else {
            System.out.println("Invalid operator!");
        }

        sc.close();
    }
}
