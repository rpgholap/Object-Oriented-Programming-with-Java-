/*
Problem 5: Student Marks Calculator
Scenario: A school in Mumbai wants to calculate marks of students and also maintain total students in
the class.
Requirements:
1. Create a class Student with instance variables: name (String), marks (int).
2. Create static variable totalStudents to count total number of students.
3. Constructor to initialize student details and increment totalStudents.
4. Getter and Setter for marks.
5. Method isPassed() returns true if marks >= 35, false otherwise.
6. Static method showTotalStudents() prints total students.
7. In main class, create 3 students, check if they passed, and show total students.
Input Example:
Student1: Name: "Rahul", Marks: 78
Student2: Name: "Pooja", Marks: 34
Student3: Name: "Amit", Marks: 65
Expected Output:
Student Rahul Passed? true
Student Pooja Passed? false
Student Amit Passed? true
Total students: 3
*/


/**
 * Represents a student with a name and marks.
 * It also keeps a static count of all students created and checks if a student has passed.
 */
public class Student {

    // Instance variables to hold the details for each student object.
    private String name;
    private int marks;

    // A static variable that belongs to the Student class, not to any object.
    // It is used to keep a count of all Student objects created.
    private static int totalStudents = 0;

    /**
     * Constructor for the Student class.
     * Initializes the student's name and marks and increments the static totalStudents counter.
     * @param name The name of the student.
     * @param marks The student's marks.
     */
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
        // Increment the static counter every time a new Student object is created.
        totalStudents++;
    }

    /**
     * Getter method to retrieve the student's name.
     * @return The student's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method to set the student's marks.
     * @param marks The new marks for the student.
     */
    public void setMarks(int marks) {
        this.marks = marks;
    }

    /**
     * Checks if the student has passed.
     * A student passes if their marks are 35 or more.
     * @return true if the student has passed, false otherwise.
     */
    public boolean isPassed() {
        return marks >= 35;
    }

    /**
     * A static method to display the total number of students created.
     * This method can be called directly from the class (e.g., Student.showTotalStudents())
     * without needing an object instance.
     */
    public static void showTotalStudents() {
        System.out.println("Total students: " + totalStudents);
    }

    /**
     * The main method to demonstrate the functionality of the Student class.
     */
    public static void main(String[] args) {
        // Create three Student objects with different marks.
        Student student1 = new Student("Rahul", 78);
        Student student2 = new Student("Pooja", 34);
        Student student3 = new Student("Amit", 65);

        // Check and print the pass/fail status for each student.
        System.out.println(student1.getName() + " passed: " + student1.isPassed());
        System.out.println(student2.getName() + " passed: " + student2.isPassed());
        System.out.println(student3.getName() + " passed: " + student3.isPassed());

        // Call the static method to show the total count of students.
        Student.showTotalStudents();
    }
}
