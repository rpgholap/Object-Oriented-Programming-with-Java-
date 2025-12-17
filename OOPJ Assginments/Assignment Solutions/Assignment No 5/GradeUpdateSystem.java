/*
Problem 14: Grade Update System
Use Case: Update a student's marks in the grading system.
Requirements:
● Store student grades
● Update existing student's marks
● Display updated information
Sample Input:
Initial: "Rohan" → 78
Update: "Rohan" → 88
Expected Output:
Updated Grade: Rohan:88
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradeUpdateSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HashMap<String, Integer> studentGrades = new HashMap<>();
        
        // Initial data
        System.out.println("Enter initial student name:");
        String name = sc.nextLine().trim();
        
        System.out.println("Enter initial marks:");
        int marks = sc.nextInt();
        sc.nextLine(); // consume newline
        
        studentGrades.put(name, marks);
        
        // Update data
        System.out.println("Enter name to update:");
        String updateName = sc.nextLine().trim();
        
        System.out.println("Enter new marks:");
        int newMarks = sc.nextInt();
        sc.nextLine(); // consume newline
        
        // Update the marks
        studentGrades.put(updateName, newMarks);
        
        // Display updated information
        System.out.println("Updated Grade: ");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        
        sc.close();
    }
}
