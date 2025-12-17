/*
Problem 13: Student Registration Order Tracker
Use Case: Maintain the order in which students registered for a course.
Requirements:
● Record registration order
● Map student names to roll numbers
● Preserve insertion order
Sample Input:
Registrations: "Amit" → 101, "Rohan" → 102, "Priya" → 103
Expected Output:
Registration Order: Amit:101, Rohan:102, Priya:103
*/

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentRegistrationOrderTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        LinkedHashMap<String, Integer> registrations = new LinkedHashMap<>();
        
        System.out.println("Enter number of students to register:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        
        System.out.println("Enter student name and roll number:");
        for (int i = 0; i < n; i++) {
            System.out.print("Name: ");
            String name = sc.nextLine().trim();
            
            System.out.print("Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine(); // consume newline
            
            registrations.put(name, roll);
        }
        
        System.out.print("Registration Order: ");
        int count = 0;
        for (Map.Entry<String, Integer> entry : registrations.entrySet()) {
            System.out.print(entry.getKey() + ":" + entry.getValue());
            count++;
            if (count < registrations.size()) {
                System.out.print(", ");
            }
        }
        
        sc.close();
    }
}
