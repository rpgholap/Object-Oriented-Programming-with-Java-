/*
29. Employee Management System
Scenario: Manage employee details, calculate salaries, and differentiate employee types.
Problem Statement:
● Abstract Class Employee → instance variables: name, id
○ Abstract method calculateSalary() → different calculation for each type
● Class PermanentEmployee extends Employee → include basicSalary and hra → implement
calculateSalary()
● Class ContractEmployee extends Employee → include hourlyRate and hoursWorked →
implement calculateSalary()
● Interface BonusEligible → method calculateBonus() → applies only to permanent employees
● In main(), create 2 permanent and 2 contract employees, display salary + bonus if eligible
Sample Input:
PermanentEmployee → name="Amit", basicSalary=50000, hra=5000
ContractEmployee → name="Neha", hourlyRate=300, hoursWorked=100
Sample Output:
Amit Salary = 55000, Bonus = 5500
Neha Salary = 30000
*/

// Abstract class Employee
abstract class Employee {
    String name;
    int id;
    static int counter = 1;

    Employee(String name) {
        this.name = name;
        this.id = counter++;
    }

    // Abstract method to calculate salary
    abstract double calculateSalary();
}

// Interface BonusEligible
interface BonusEligible {
    double calculateBonus();
}

// PermanentEmployee class
class PermanentEmployee extends Employee implements BonusEligible {
    double basicSalary;
    double hra;

    PermanentEmployee(String name, double basicSalary, double hra) {
        super(name);
        this.basicSalary = basicSalary;
        this.hra = hra;
    }

    @Override
    double calculateSalary() {
        return basicSalary + hra;
    }

    @Override
    public double calculateBonus() {
        // Bonus is 10% of total salary
        return calculateSalary() * 0.10;
    }
}

// ContractEmployee class
class ContractEmployee extends Employee {
    double hourlyRate;
    double hoursWorked;

    ContractEmployee(String name, double hourlyRate, double hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating 2 permanent employees
        PermanentEmployee emp1 = new PermanentEmployee("Amruta", 50000, 5000);
        PermanentEmployee emp2 = new PermanentEmployee("Dev", 60000, 6000);

        // Creating 2 contract employees
        ContractEmployee emp3 = new ContractEmployee("Neha", 300, 100);
        ContractEmployee emp4 = new ContractEmployee("Mahi", 250, 120);

        // Displaying salary and bonus if eligible
        System.out.println(emp1.name + " Salary = " + emp1.calculateSalary() + ", Bonus = " + emp1.calculateBonus());
        System.out.println(emp2.name + " Salary = " + emp2.calculateSalary() + ", Bonus = " + emp2.calculateBonus());
        
        System.out.println(emp3.name + " Salary = " + emp3.calculateSalary());
        System.out.println(emp4.name + " Salary = " + emp4.calculateSalary());
    }
}
