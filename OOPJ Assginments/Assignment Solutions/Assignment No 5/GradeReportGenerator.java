/*
Problem 19: Grade Report Generator
Use Case: Display all student grades using proper iteration techniques.
Requirements:
● Iterate through student-grade mappings
● Display formatted grade report
● Use Iterator pattern
Sample Input:
Student grades: "Amit" → 85, "Priya" → 92
Expected Output:
Grade Report: Amit:85, Priya:92
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class GradeReportGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Store student grades
        HashMap<String, Integer> studentGrades = new HashMap<>();

        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter student name and marks:");
        for (int i = 0; i < n; i++) {
            System.out.print("Name: ");
            String name = sc.nextLine().trim();

            System.out.print("Marks: ");
            int marks = sc.nextInt();
            sc.nextLine(); // consume newline

            studentGrades.put(name, marks);
        }

        // Using Iterator to traverse the map
        Iterator<Map.Entry<String, Integer>> iterator = studentGrades.entrySet().iterator();

        System.out.print("Grade Report: ");
        int count = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.print(entry.getKey() + ":" + entry.getValue());
            count++;
            if (count < studentGrades.size()) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}
