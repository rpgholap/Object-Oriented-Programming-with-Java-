/*
Problem 9: Event Attendance Counter
Use Case: Count unique attendees at an event, handling duplicate check-ins.
Requirements:
● Record attendee names
● Count only unique attendees
● Handle duplicate entries
Sample Input:
Attendees: "Amit", "Rohan", "Amit", "Priya"
Expected Output:
Total unique attendees: 3
*/

import java.util.HashSet;
import java.util.Scanner;

public class EventAttendanceCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        HashSet<String> attendees = new HashSet<>();
        
        System.out.println("Enter number of attendees:");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        System.out.println("Enter attendee names one by one:");
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine().trim();
            attendees.add(name); // automatically ignores duplicates
        }
        
        // Display total unique attendees
        System.out.println("Total unique attendees: " + attendees.size());
    }
}

/*
import java.util.HashSet;

public class EventAttendance {
    public static void main(String[] args) {
        String[] attendees = {"Amit", "Rohan", "Amit", "Priya"};
        HashSet<String> unique = new HashSet<>();

        for(String a : attendees) unique.add(a);

        System.out.println("Total unique attendees: " + unique.size());
    }
}

*/