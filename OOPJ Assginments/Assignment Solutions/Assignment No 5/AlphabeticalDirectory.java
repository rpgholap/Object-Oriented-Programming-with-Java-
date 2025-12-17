/*
Problem 7: Alphabetical Student Directory
Use Case: A school wants to maintain student names in alphabetical order.
Requirements:
● Add student names
● Automatically maintain alphabetical sorting
● Display sorted name
Sample Input:
Students: "Rohan", "Amit", "Priya"
Expected Output:
Students: Amit, Priya, Rohan
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AlphabeticalDirectory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> students = new ArrayList<>();
        
        System.out.println("Enter number of students:");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        System.out.println("Enter student names:");
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            students.add(name);
        }
        
        // Sort alphabetically
        Collections.sort(students);
        
        // Display sorted names
        System.out.print("Students: ");
        for (int i = 0; i < students.size(); i++) {
            System.out.print(students.get(i));
            if (i < students.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}


/*
import java.util.ArrayList;
import java.util.Collections;

public class AlphabeticalDirectory {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Collections.addAll(students, "Rohan", "Amit", "Priya");

        Collections.sort(students);

        System.out.println("Students: " + String.join(", ", students));
    }
}


*/