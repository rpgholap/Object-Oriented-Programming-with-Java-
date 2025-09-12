/*
14. Employee Bonus Calculation
Scenario: A company has different types of employees with specific bonus calculation rules.
Problem Statement:
Create an abstract class Employee with abstract method calculateBonus(). Subclass Manager →
bonus=20% of salary, Subclass Developer → bonus=10% of salary.
Classes/Fields:
● Employee → name, salary, calculateBonus() (abstract)
● Manager → bonus=20% of salary
● Developer → bonus=10% of salary
Sample Input:
Manager → name=Anita, salary=50000
Developer → name=Rohit, salary=40000
Sample Output:
Anita Bonus = 10000
Rohit Bonus = 4000
*/


// Abstract base class
abstract class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Abstract method to calculate bonus
    public abstract double calculateBonus();
}

// Subclass for Manager
class Manager extends Employee {

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20; // 20% of salary
    }
}

// Subclass for Developer
class Developer extends Employee {

    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.10; // 10% of salary
    }
}

// Main class to run the program
public class EmployeeBonusCalculation {
    public static void main(String[] args) {
        Manager manager = new Manager("Anita", 50000);
        Developer developer = new Developer("Rohit", 40000);

        System.out.println(manager.name + " Bonus = " + (int)manager.calculateBonus());
        System.out.println(developer.name + " Bonus = " + (int)developer.calculateBonus());
    }
}

