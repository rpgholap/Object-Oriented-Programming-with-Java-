/*
	30. Menu-Based Simple Arithmetic Operations
	Scenario: Implement a menu-based program that asks user to select operation (Addition, Subtraction,
	Multiplication, Division) and prints result.
	Input:
	Select operation (1-Addition, 2-Subtraction): 1
	Enter first number: 20
	Enter second number: 30
	Output:
	Result: 50
*/

import java.util.Scanner;

class MenuDrivenArithmeticOp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Select operation (1-Addition, 2-Subtraction, 3-Multiplication, 4-Division): ");
        int choice = in.nextInt();

        System.out.print("Enter first number: ");
        double a = in.nextDouble();
        System.out.print("Enter second number: ");
        double b = in.nextDouble();

        switch (choice) {
            case 1 -> System.out.println("Result: " + (a + b));
            case 2 -> System.out.println("Result: " + (a - b));
            case 3 -> System.out.println("Result: " + (a * b));
            case 4 -> {
                if (b != 0) System.out.println("Result: " + (a / b));
                else System.out.println("Error: Division by zero");
            }
            default -> System.out.println("Invalid choice");
        }
        in.close();
    }
}
