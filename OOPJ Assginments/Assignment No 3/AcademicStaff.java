/*
10. Academic Staff
Scenario: University has teaching and non-teaching staff.
Problem Statement:
Superclass Staff with name, salary. Subclass TeachingStaff adds subject, Subclass NonTeachingStaff
adds department. Display staff info.
Classes/Fields:
● Staff → name, salary
● TeachingStaff → subject
● NonTeachingStaff → department
Sample Input:
Teaching → name=Anita, salary=50000, subject=Math
NonTeaching → name=Ramesh, salary=40000, department=Admin
Sample Output:
Anita → Math, 50000
Ramesh → Admin, 40000
*/

// Superclass Staff
class Staff {
    String name;
    double salary;

    // Constructor
    Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

// Subclass TeachingStaff
class TeachingStaff extends Staff {
    String subject;

    TeachingStaff(String name, double salary, String subject) {
        super(name, salary); // Call superclass constructor
        this.subject = subject;
    }

    // Display info
    void displayInfo() {
        System.out.println(name + " → " + subject + ", " + salary);
    }
}

// Subclass NonTeachingStaff
class NonTeachingStaff extends Staff {
    String department;

    NonTeachingStaff(String name, double salary, String department) {
        super(name, salary); // Call superclass constructor
        this.department = department;
    }

    // Display info
    void displayInfo() {
        System.out.println(name + " → " + department + ", " + salary);
    }
}

// Main class
public class AcademicStaff {
    public static void main(String[] args) {
        // Create objects
        TeachingStaff t1 = new TeachingStaff("Anita", 50000, "Math");
        NonTeachingStaff nt1 = new NonTeachingStaff("Ramesh", 40000, "Admin");

        // Display staff info
        t1.displayInfo();
        nt1.displayInfo();
    }
}
