/*
16. Employee Salary Display
Scenario: Company wants to display employee salary with different bonus calculations based on
employee type.
Problem Statement:
Create class Employee with method displaySalary(). Subclass Manager and Developer override
displaySalary() to include bonus.
Classes/Fields:
● Employee → name, salary, displaySalary() prints salary
● Manager → overrides displaySalary() → adds 20% bonus
● Developer → overrides displaySalary() → adds 10% bonus
Sample Input:
Manager → name=Anita, salary=50000
Developer → name=Rohit, salary=40000
Sample Output:
Anita Total Salary = 60000
Rohit Total Salary = 44000
*/

// Base class Employee
class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displaySalary() {
        System.out.println(name + " Total Salary = " + (int)salary);
    }
}

// Subclass Manager
class Manager extends Employee {

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void displaySalary() {
        double totalSalary = salary + (salary * 0.20); // 20% bonus
        System.out.println(name + " Total Salary = " + (int)totalSalary);
    }
}

// Subclass Developer
class Developer extends Employee {

    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void displaySalary() {
        double totalSalary = salary + (salary * 0.10); // 10% bonus
        System.out.println(name + " Total Salary = " + (int)totalSalary);
    }
}

// Main class
public class EmployeeSalaryDisplay {
    public static void main(String[] args) {
        Manager manager = new Manager("Anita", 50000);
        Developer developer = new Developer("Rohit", 40000);

        manager.displaySalary();
        developer.displaySalary();
    }
}

