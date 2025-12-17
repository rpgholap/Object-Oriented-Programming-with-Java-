/*
Problem 23: Employee Age Management
Scenario: An HR system stores employee ages in a database. The system needs to convert primitive int
values to Integer objects for database storage and collection operations.
Task: Demonstrate autoboxing by converting primitive int to Integer object.
Sample Input:
30
Expected Output:
Integer object: 30
*/


import java.util.Scanner;

class EmployeeAgeManagement {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Age:");
        int age = in.nextInt();

        Integer ageObj = age; // Autoboxing

        System.out.println("Expected Output:");
        System.out.println("Integer object: " + ageObj);
        

        in.close();
    }
}
