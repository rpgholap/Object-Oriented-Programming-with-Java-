/*
Problem 26: Salary Storage
Scenario: A financial system needs to convert primitive double salary values to Double objects for
storage in collections and database operations.
Task: Use valueOf method to convert primitives to wrapper objects.
Sample Input:
45000.5
Expected Output:
Double object: 45000.5
*/

import java.util.Scanner;

class SalaryStorage {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter salary:");
        double salary = in.nextDouble();

        Double salaryObj = Double.valueOf(salary);

        System.out.println("Expected Output:");
        System.out.println("Double object: " + salaryObj);

        in.close();
    }
}
