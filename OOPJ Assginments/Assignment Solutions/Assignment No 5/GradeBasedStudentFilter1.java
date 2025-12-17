/*
Problem 30: Grade-Based Student Filter
Use Case: Filter students based on minimum grade requirements.
Requirements:
● Store student objects with grades
● Remove students below grade B
● Display filtered results
Sample Input:
Students: ("Amit", "A"), ("Priya", "C"), ("Rohan", "B")
Filter: Grade >= B
Expected Output:
Qualified Students: Amit:A, Rohan:B
*/

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    String grade;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class GradeBasedStudentFilter1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine().trim();

            System.out.print("Enter student grade: ");
            String grade = sc.nextLine().trim().toUpperCase();

            students.add(new Student(name, grade));
        }

        // Filter students with grade < B
        students.removeIf(s -> s.grade.compareTo("B") > 0); // grades higher than B (like C, D) removed

        // Display qualified students
        System.out.print("Qualified Students: ");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.print(s.name + ":" + s.grade);
            if (i < students.size() - 1) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}
