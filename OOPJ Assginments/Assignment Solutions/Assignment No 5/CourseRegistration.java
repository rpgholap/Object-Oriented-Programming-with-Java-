/*
Problem 8: Course Registration System
Use Case: A student registers for courses, ensuring no duplicate course codes.
Requirements:
● Register for courses using course codes
● Prevent duplicate registrations
● Display registered courses
Sample Input:
Course codes: "CS101", "MA101", "CS101"
Expected Output:
Registered Courses: CS101, MA101
*/

import java.util.HashSet;
import java.util.Scanner;

public class CourseRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        HashSet<String> courses = new HashSet<>();
        
        System.out.println("Enter number of course entries:");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        System.out.println("Enter course codes:");
        for (int i = 0; i < n; i++) {
            String course = scanner.nextLine();
            courses.add(course); // automatically prevents duplicates
        }
        
        // Display registered courses
        System.out.print("Registered Courses: ");
        int count = 0;
        for (String course : courses) {
            System.out.print(course);
            count++;
            if (count < courses.size()) {
                System.out.print(", ");
            }
        }
    }
}


/*
import java.util.LinkedHashSet;

public class CourseRegistration {
    public static void main(String[] args) {
        LinkedHashSet<String> courses = new LinkedHashSet<>();
        String[] input = {"CS101", "MA101", "CS101"};

        for(String course : input){
            courses.add(course);
        }

        System.out.println("Registered Courses: " + String.join(", ", courses));
    }
}

*/