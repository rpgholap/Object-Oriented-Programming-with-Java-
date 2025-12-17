/*
	23. Basic Calculator Using Switch-Case
	Scenario: Create a calculator that uses switch-case for operators (+, -, *, /) and prints result.
	Input:
	Enter first number: 15
	Enter second number: 3
	Enter operator: /
	Output:
	Result: 5
*/

import java.util.Scanner;

class CalculatorSwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = in.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = in.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = in.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero not allowed");
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }

        in.close();
    }
}
