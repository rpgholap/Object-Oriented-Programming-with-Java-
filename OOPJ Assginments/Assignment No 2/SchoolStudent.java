/*
Problem 9: School Fee System
Scenario:
A school wants to initialize the tuition fee for all students once at program start. Each student has name
and class. Use static blocks to set the fee and setters/getters to update/access student information.
Tasks:
1. Create a Student class.
2. Use a static block to initialize tuitionFee to 30000.
3. Create instance variables: name (String) and className (String).
4. Create setters and getters for name and className.
5. Print student details including tuition fee.
Input Example:
Student1: Name="Anjali", Class="10th"
Student2: Name="Vikram", Class="12th"
Expected Output:
School Tuition Fee Initialized: 30000
Student1: Name=Anjali, Class=10th, Tuition Fee=30000
Student2: Name=Vikram, Class=12th, Tuition Fee=30000
*/


/**
 * Represents a student with a name and class.
 * Uses a static block to initialize the tuition fee for all students.
 */
public class SchoolStudent {

    // Instance variables
    private String name;
    private String className;

    // Static variable for the tuition fee
    private static double tuitionFee;

    // A static block to initialize the tuition fee when the class is loaded.
    static {
        System.out.println("School Tuition Fee Initialized: 30000");
        tuitionFee = 30000.00;
    }

    /**
     * Constructor for the SchoolStudent class.
     * @param name The name of the student.
     * @param className The student's class name.
     */
    public SchoolStudent(String name, String className) {
        this.name = name;
        this.className = className;
    }

    /**
     * Getter method to retrieve the student's name.
     * @return The student's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method to retrieve the student's class name.
     * @return The student's class name.
     */
    public String getClassName() {
        return className;
    }

    /**
     * Prints the details of the student.
     */
    public void printDetails() {
        System.out.println("Student: " + name + ", Class: " + className + ", Tuition Fee: $" + tuitionFee);
    }

    public static void main(String[] args) {
        // The static block will execute once here, before any objects are created.
        
        // Create two SchoolStudent objects.
        SchoolStudent student1 = new SchoolStudent("Anjali", "10th");
        SchoolStudent student2 = new SchoolStudent("Vikram", "12th");

        // Print the details, showing the same static tuition fee.
        student1.printDetails();
        student2.printDetails();
    }
}
