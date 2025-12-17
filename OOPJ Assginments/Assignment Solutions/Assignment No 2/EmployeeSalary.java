/*
Problem 16: Employee Net Salary
Scenario:
Extend previous problem. Add method calculateNetSalary():
● Add 10% HRA, 5% DA, deduct 2% PF from basicSalary
● Print net salary for 2 employees
*/


/**
 * Represents an employee with an auto-generated ID.
 * Demonstrates the use of a static counter, constructor overloading,
 * and a method to calculate net salary.
 */
public class EmployeeSalary {

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
    public EmployeeSalary() {
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
    public EmployeeSalary(String name, double basicSalary) {
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

    /**
     * Calculates the net salary of the employee.
     * Net Salary = Basic Salary + HRA (10%) + DA (5%) - PF (2%).
     * @return The calculated net salary.
     */
    public double calculateNetSalary() {
        double hra = 0.10 * basicSalary;
        double da = 0.05 * basicSalary;
        double pf = 0.02 * basicSalary;
        return basicSalary + hra + da - pf;
    }

    public static void main(String[] args) {
        // Create the first employee using the default constructor.
        EmployeeSalary emp1 = new EmployeeSalary();

        // Create the second employee using the parameterized constructor.
        EmployeeSalary emp2 = new EmployeeSalary("Priya", 35000.0);

        // Display the details and net salary of the first employee.
        System.out.println("Employee 1 Details:");
        System.out.println("ID: " + emp1.getId());
        System.out.println("Name: " + emp1.getName());
        System.out.println("Basic Salary: " + emp1.getBasicSalary());
        System.out.println("Net Salary: " + emp1.calculateNetSalary());
        System.out.println();

        // Display the details and net salary of the second employee.
        System.out.println("Employee 2 Details:");
        System.out.println("ID: " + emp2.getId());
        System.out.println("Name: " + emp2.getName());
        System.out.println("Basic Salary: " + emp2.getBasicSalary());
        System.out.println("Net Salary: " + emp2.calculateNetSalary());
    }
}
