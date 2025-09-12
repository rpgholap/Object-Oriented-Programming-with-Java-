/*
Problem 15: Employee Auto-ID Generator
Scenario:
Create Employee class with id, name, basicSalary.
● Add static counter starting from 1001 for IDs.
● Default constructor → name = "Unknown", salary = 20000
● Parameterized constructor → accept name and salary
● Getter for all variables
● Create 2 employees and display their IDs, names, salary.
*/

/**
 * Represents an employee with an auto-generated ID.
 * Demonstrates the use of a static counter and constructor overloading.
 */
public class EmployeeDetails {

    // Static counter to generate unique IDs, starts from 1001.
    private static int counter = 1001;

    // Instance variables
    private int id;
    private String name;
    private double basicSalary;

    /**
     * Default constructor for an employee with unknown details.
     * Assigns a default name and salary and the next available ID.
     */
    public EmployeeDetails() {
        this.id = counter++;
        this.name = "Unknown";
        this.basicSalary = 20000.0;
    }

    /**
     * Parameterized constructor to initialize an Employee with specific details.
     * Assigns the next available ID.
     * @param name The name of the employee.
     * @param basicSalary The basic salary of the employee.
     */
    public EmployeeDetails(String name, double basicSalary) {
        this.id = counter++;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Getter methods for all instance variables
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public static void main(String[] args) {
        // Create the first employee using the default constructor.
        EmployeeDetails emp1 = new EmployeeDetails();

        // Create the second employee using the parameterized constructor.
        EmployeeDetails emp2 = new EmployeeDetails("Priya", 35000.0);

        // Display the details of the first employee.
        System.out.println("Employee 1 Details:");
        System.out.println("ID: " + emp1.getId());
        System.out.println("Name: " + emp1.getName());
        System.out.println("Basic Salary: " + emp1.getBasicSalary());
        System.out.println();

        // Display the details of the second employee.
        System.out.println("Employee 2 Details:");
        System.out.println("ID: " + emp2.getId());
        System.out.println("Name: " + emp2.getName());
        System.out.println("Basic Salary: " + emp2.getBasicSalary());
    }
}
