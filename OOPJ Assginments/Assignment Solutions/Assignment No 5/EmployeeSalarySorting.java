/*
Problem 27: Employee Salary Sorting
Use Case: Sort employees by salary for payroll processing.
Requirements:
● Store employee objects
● Sort by salary in ascending order
● Display sorted employee list
Sample Input:
Employees: ("Amit", 50000), ("Priya", 60000), ("Rohan", 45000)
Expected Output:
Sorted by salary: Rohan:45000, Amit:50000, Priya:60000
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeSalarySorting {
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

        // Sort employees by salary (ascending)
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e1.salary, e2.salary);
            }
        });

        // Display sorted employee list
        System.out.print("Sorted by salary: ");
        for (int i = 0; i < employees.size(); i++) {
            Employee emp = employees.get(i);
            System.out.print(emp.name + ":" + (int)emp.salary);
            if (i < employees.size() - 1) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}
