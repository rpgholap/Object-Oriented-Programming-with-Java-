/*
Problem 10: Student Marks Checker
Scenario:
Create a Student class with rollNo, name, and marks.
● Use a parameterized constructor to initialize all fields.
● Create a getter and setter for marks.
● In main, create one student, update marks using setter, and print student details
*/

/**
 * Represents a student with roll number, name, and marks.
 * Demonstrates the use of a parameterized constructor and a setter method.
 */
public class StudentChecker {

    // Instance variables
    private int rollNo;
    private String name;
    private int marks;

    /**
     * Parameterized constructor to initialize all instance variables.
     * @param rollNo The student's roll number.
     * @param name The student's name.
     * @param marks The student's initial marks.
     */
    public StudentChecker(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    /**
     * Getter method to retrieve the student's marks.
     * @return The student's marks.
     */
    public int getMarks() {
        return marks;
    }

    /**
     * Setter method to update the student's marks.
     * @param newMarks The new marks to be set.
     */
    public void setMarks(int newMarks) {
        this.marks = newMarks;
    }
    
    /**
     * Prints the student's details.
     */
    public void printDetails() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }

    public static void main(String[] args) {
        // Create a StudentChecker object.
        StudentChecker student = new StudentChecker(1, "Rahul", 75);
        student.printDetails();

        // Update the marks using the setter.
        student.setMarks(88);
        
        // Print the updated details.
        System.out.println("\nMarks updated.");
        student.printDetails();
    }
}
