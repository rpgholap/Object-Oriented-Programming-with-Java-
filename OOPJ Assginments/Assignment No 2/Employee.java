/*
Problem 4: Employee Salary Manager
Scenario: A company in Bengaluru wants to maintain employee details and give a bonus to employees
who have worked more than 5 years.
Requirements:
1. Create a class Employee with instance variables: name (String), salary (double), yearsOfService
(int).
2. Create static variable totalEmployees to store the number of employees created.
3. Constructor should initialize all instance variables and increment totalEmployees.
4. Create getters and setters for all instance variables.
5. Create a method calculateBonus() that returns 5% of salary if yearsOfService > 5, otherwise 0.
6. Create a static method showTotalEmployees() to print total employees created.
7. Write a main class to create 3 employees, print their bonuses, and print total employees.
Input Example:
Employee1: Name: "Ravi", Salary: 150000, Years of Service: 6
Employee2: Name: "Anita", Salary: 120000, Years of Service: 3
Employee3: Name: "Suresh", Salary: 100000, Years of Service: 5
Expected Output:
Employee Ravi Bonus: 7500.0
Employee Anita Bonus: 0.0
Employee Suresh Bonus: 0.0
Total employees: 3
*/



/**
 * Represents an employee with a name, salary, and years of service.
 * It calculates a bonus and keeps a static count of all employees.
 */
public class Employee {

    // Instance variables to hold the details for each employee object.
    private String name;
    private double salary;
    private int yearsOfService;

    // A static variable to count the total number of employees created.
    private static int totalEmployees = 0;

    /**
     * Constructor for the Employee class.
     * Initializes the employee's details and increments the static totalEmployees counter.
     * @param name The name of the employee.
     * @param salary The employee's salary.
     * @param yearsOfService The number of years the employee has served.
     */
    public Employee(String name, double salary, int yearsOfService) {
        this.name = name;
        this.salary = salary;
        this.yearsOfService = yearsOfService;
        // Increment the static counter every time a new Employee object is created.
        totalEmployees++;
    }

    /**
     * Calculates the employee's bonus based on years of service.
     * A 5% bonus is given if yearsOfService is greater than 5.
     * @return The bonus amount.
     */
    public double calculateBonus() {
        if (yearsOfService > 5) {
            return salary * 0.05; // 5% of the salary
        } else {
            return 0.0; // No bonus
        }
    }

    /**
     * A static method to display the total number of employees created.
     * This method can be called directly from the class.
     */
    public static void showTotalEmployees() {
        System.out.println("Total employees: " + totalEmployees);
    }

    /**
     * The main method to demonstrate the functionality of the Employee class.
     */
    public static void main(String[] args) {
        // Create two Employee objects with different years of service.
        Employee employee1 = new Employee("John", 150000.0, 6);
        Employee employee2 = new Employee("Jane", 80000.0, 3);
        Employee employee3 = new Employee("Peter", 120000.0, 5);

        // Display the bonus for each employee.
        System.out.println("Bonus for " + employee1.name + ": $" + employee1.calculateBonus());
        System.out.println("Bonus for " + employee2.name + ": $" + employee2.calculateBonus());
        System.out.println("Bonus for " + employee3.name + ": $" + employee3.calculateBonus());

        // Call the static method to show the total count.
        Employee.showTotalEmployees();
    }
}
