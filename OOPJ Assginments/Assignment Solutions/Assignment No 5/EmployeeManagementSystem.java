/*
Problem 26: Employee Management System
Use Case: Manage employee information including name and salary.
Requirements:
● Create Employee objects with name and salary
● Store employees in a collection
● Display employee information
Sample Input:
Employees: Employee("Amit", 50000), Employee("Priya", 60000)
Expected Output:
Employee List: Amit:50000, Priya:60000
*/

import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    String name;
    double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        System.out.println("Enter number of employees:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Input employee details
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine().trim();

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            sc.nextLine(); // consume newline

            employees.add(new Employee(name, salary));
        }

        // Display employee information
        System.out.print("Employee List: ");
        for (int i = 0; i < employees.size(); i++) {
            Employee emp = employees.get(i);
            System.out.print(emp.name + ":" + (int)emp.salary); // cast to int if needed
            if (i < employees.size() - 1) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}
