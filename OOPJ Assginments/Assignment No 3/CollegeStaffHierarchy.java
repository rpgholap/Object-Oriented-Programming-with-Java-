/*
20. College Staff Hierarchy
Scenario: A college has employees who can be Teaching or Non-Teaching. Teaching staff can be
Professors or Lecturers.
Problem Statement:
Create classes:
● Employee → name, salary, displaySalary()
● TeachingStaff → subject, overrides displaySalary()
● Professor → specialization, overrides displaySalary()
● Lecturer → department, overrides displaySalary()
Sample Input:
Professor → name=Dr. Sharma, salary=80000, subject=Math, specialization=Algebra
Lecturer → name=Ms. Mehta, salary=50000, subject=Physics, department=Science
Sample Output:
Dr. Sharma → Subject=Math, Specialization=Algebra, Salary=80000
Ms. Mehta → Subject=Physics, Department=Science, Salary=50000
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
        System.out.println(name + " → Salary=" + (int)salary);
    }
}

// TeachingStaff class inheriting from Employee
class TeachingStaff extends Employee {
    protected String subject;

    public TeachingStaff(String name, double salary, String subject) {
        super(name, salary);
        this.subject = subject;
    }

    @Override
    public void displaySalary() {
        System.out.print(name + " → Subject=" + subject + ", ");
        super.displaySalary();
    }
}

// Professor class inheriting from TeachingStaff
class Professor extends TeachingStaff {
    private String specialization;

    public Professor(String name, double salary, String subject, String specialization) {
        super(name, salary, subject);
        this.specialization = specialization;
    }

    @Override
    public void displaySalary() {
        System.out.println(name + " → Subject=" + subject + ", Specialization=" + specialization + ", Salary=" + (int)salary);
    }
}

// Lecturer class inheriting from TeachingStaff
class Lecturer extends TeachingStaff {
    private String department;

    public Lecturer(String name, double salary, String subject, String department) {
        super(name, salary, subject);
        this.department = department;
    }

    @Override
    public void displaySalary() {
        System.out.println(name + " → Subject=" + subject + ", Department=" + department + ", Salary=" + (int)salary);
    }
}

// Main class
public class CollegeStaffHierarchy {
    public static void main(String[] args) {
        Professor professor = new Professor("Dr. Sharma", 80000, "Math", "Algebra");
        Lecturer lecturer = new Lecturer("Ms. Mehta", 50000, "Physics", "Science");

        professor.displaySalary();
        lecturer.displaySalary();
    }
}
