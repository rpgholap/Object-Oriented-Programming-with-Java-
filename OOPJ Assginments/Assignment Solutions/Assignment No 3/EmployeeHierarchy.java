/*
7. Employee Hierarchy
Scenario: A company has regular and contractual employees with different pay structures.
Problem Statement:
Create a superclass Employee with name and basicSalary. Subclass RegularEmployee adds HRA 10%,
Subclass ContractEmployee adds allowance 5%. Display net salary.
Classes/Fields:
● Employee → name, basicSalary
● RegularEmployee → HRA 10%
● ContractEmployee → allowance 5%
Sample Input:
Regular → name=Rahul, basicSalary=20000
Contract → name=Riya, basicSalary=15000
Sample Output:
Rahul Net Salary = 22000
Riya Net Salary = 15750
*/


class Employee {
    String name;
    double basicSalary;

    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }
}

class RegularEmployee extends Employee {

    public RegularEmployee(String name, double basicSalary) {
        super(name, basicSalary);
    }

    public void displayNetSalary() {
        double netSalary = basicSalary + (basicSalary * 0.10);  // HRA 10%
        System.out.println(name + " Net Salary = " + netSalary);
    }
}

class ContractEmployee extends Employee {

    public ContractEmployee(String name, double basicSalary) {
        super(name, basicSalary);
    }

    public void displayNetSalary() {
        double netSalary = basicSalary + (basicSalary * 0.05);  // Allowance 5%
        System.out.println(name + " Net Salary = " + netSalary);
    }
}

public class EmployeeHierarchy{
    public static void main(String[] args) {
        RegularEmployee regEmp = new RegularEmployee("Rahul", 20000);
        ContractEmployee conEmp = new ContractEmployee("Riya", 15000);

        regEmp.displayNetSalary();
        conEmp.displayNetSalary();
    }
}
