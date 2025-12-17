/*
Problem 16: Grade-Based Student Filter
Use Case: Remove students with failing grades from the honor roll.
Requirements:
● Store student grades in a map
● Remove students with marks below 60
● Display remaining student
Sample Input:
Student grades: "Amit" → 85, "Priya" → 52, "Rohan" → 78
Filter threshold: 60
Expected Output:
Honor Roll: Amit:85, Rohan:78
*/


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class GradeBasedStudentFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HashMap<String, Integer> studentGrades = new HashMap<>();
        
        // Input student grades
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
        
        // Input threshold
        System.out.println("Enter filter threshold:");
        int threshold = sc.nextInt();
        
        // Remove students with marks below threshold
        Iterator<Map.Entry<String, Integer>> iterator = studentGrades.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() < threshold) {
                iterator.remove();
            }
        }
        
        // Display remaining students
        System.out.print("Honor Roll: ");
        int count = 0;
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.print(entry.getKey() + ":" + entry.getValue());
            count++;
            if (count < studentGrades.size()) {
                System.out.print(", ");
            }
        }
        
        sc.close();
    }
}
