/*
Problem 18: Batch Merger System
Use Case: Merge student lists from morning and evening batches, removing duplicates.
Requirements:
● Combine two student lists
● Remove duplicate students
● Maintain unique student list
Sample Input:
Morning batch: "Amit", "Priya"
Evening batch: "Rohan", "Priya"
Expected Output:
Combined batches: Amit, Priya, Rohan
*/

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class BatchMergerSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Set<String> combinedStudents = new LinkedHashSet<>();
        
        // Input for morning batch
        System.out.println("Enter number of students in morning batch:");
        int morningCount = sc.nextInt();
        sc.nextLine(); // consume newline
        
        System.out.println("Enter names for morning batch:");
        for (int i = 0; i < morningCount; i++) {
            String name = sc.nextLine().trim();
            combinedStudents.add(name);
        }
        
        // Input for evening batch
        System.out.println("Enter number of students in evening batch:");
        int eveningCount = sc.nextInt();
        sc.nextLine(); // consume newline
        
        System.out.println("Enter names for evening batch:");
        for (int i = 0; i < eveningCount; i++) {
            String name = sc.nextLine().trim();
            combinedStudents.add(name);
        }
        
        // Display the combined list
        System.out.print("Combined batches: ");
        int count = 0;
        for (String name : combinedStudents) {
            System.out.print(name);
            count++;
            if (count < combinedStudents.size()) {
                System.out.print(", ");
            }
        }
        
        sc.close();
    }
}
