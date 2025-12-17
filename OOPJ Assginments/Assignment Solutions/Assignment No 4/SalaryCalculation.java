/*
Problem 24: Salary Calculation
Scenario: A payroll system retrieves employee ages from a database as Integer objects but needs
primitive int values for mathematical calculations.
Task: Demonstrate unboxing by extracting primitive values from wrapper objects.
Sample Input:
25
Expected Output:
int value: 25
*/

import java.util.Scanner;

class SalaryCalculation {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Age as Integer:");
        Integer ageObj = in.nextInt();

        int age = ageObj; // Unboxing

        System.out.println("Expected Output:");
        System.out.println("int value: " + age);

        in.close();
    }
}
