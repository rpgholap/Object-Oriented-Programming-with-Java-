/*
Problem 29: Student Record System
Use Case: Maintain student records with name and grade information.
Requirements:
● Create Student objects with name and grade
● Store in a collection
● Display student records
Sample Input:
Students: Student("Amit", "A"), Student("Priya", "B")
Expected Output:
Student Records: Amit:A, Priya:B
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

public class StudentRecordSystem {
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
            String grade = sc.nextLine().trim();

            students.add(new Student(name, grade));
        }

        // Display student records
        System.out.print("Student Records: ");
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
