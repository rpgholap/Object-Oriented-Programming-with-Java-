/*
Problem 12: Attendance Tracking System
Use Case: Track student attendance percentages in alphabetical order.
Requirements:
● Map student names to attendance percentages
● Maintain alphabetical order of students
● Display sorted attendance report
Sample Input:
Attendance: "Amit" → 90, "Rohan" → 85, "Priya" → 95
Expected Output:
Attendance Report: Amit:90, Priya:95, Rohan:85
*/


import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class AttendanceTrackingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        TreeMap<String, Integer> attendance = new TreeMap<>();
        
        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        
        System.out.println("Enter student name and attendance percentage:");
        for (int i = 0; i < n; i++) {
            System.out.print("Name: ");
            String name = sc.nextLine().trim();
            
            System.out.print("Attendance (%): ");
            int percentage = sc.nextInt();
            sc.nextLine(); // consume newline
            
            attendance.put(name, percentage);
        }
        
        System.out.print("Attendance Report: ");
        int count = 0;
        for (Map.Entry<String, Integer> entry : attendance.entrySet()) {
            System.out.print(entry.getKey() + ":" + entry.getValue());
            count++;
            if (count < attendance.size()) {
                System.out.print(", ");
            }
        }
        
        sc.close();
    }
}
