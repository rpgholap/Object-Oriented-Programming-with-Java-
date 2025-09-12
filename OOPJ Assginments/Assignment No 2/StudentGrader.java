/*
Problem 11: Student Grade Calculator
Scenario:
Extend previous problem. Add method calculateGrade() which returns:
● "A" if marks ≥ 80
● "B" if marks ≥ 60
● "C" if marks ≥ 40
● "Fail" otherwise
● Create 2 students, print marks and grades
*/


/**
 * Represents a student and calculates their grade based on marks.
 * Demonstrates the use of an if-else if-else statement.
 */
public class StudentGrader {

    // Instance variables
    private int rollNo;
    private String name;
    private int marks;

    /**
     * Parameterized constructor to initialize a new StudentGrader object.
     * @param rollNo The student's roll number.
     * @param name The student's name.
     * @param marks The student's marks.
     */
    public StudentGrader(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    /**
     * Calculates and returns the letter grade based on the student's marks.
     * @return The student's grade (A, B, C, or Fail).
     */
    public String calculateGrade() {
        if (marks >= 80) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 40) {
            return "C";
        } else {
            return "Fail";
        }
    }
    
    /**
     * Prints the student's details, including their calculated grade.
     */
    public void printDetails() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks + ", Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        // Create two StudentGrader objects with different marks.
        StudentGrader student1 = new StudentGrader(101, "Amit", 85);
        StudentGrader student2 = new StudentGrader(102, "Pooja", 55);

        // Display the details and grades.
        student1.printDetails();
        student2.printDetails();
    }
}
