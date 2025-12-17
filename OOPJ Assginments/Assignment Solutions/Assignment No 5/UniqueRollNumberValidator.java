
/*
Problem 6: Unique Roll Number Validator
Use Case: A registration system must ensure no duplicate roll numbers are assigned.
Requirements:
● Accept roll numbers for registration
● Automatically remove duplicates
● Display unique roll numbers
Sample Input:
Roll numbers: 101, 102, 101, 103
Expected Output:
Unique Roll Numbers: 101, 102, 103
*/

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueRollNumberValidator {
    public static void main(String[] args) {
        // Use LinkedHashSet to store unique roll numbers while maintaining order
        Set<Integer> rollNumbers = new LinkedHashSet<>();

        // Sample input
        int[] inputRollNumbers = {101, 102, 101, 103};

        // Add roll numbers to the set
        for (int roll : inputRollNumbers) {
            rollNumbers.add(roll); // duplicates are automatically ignored
        }

        // Display unique roll numbers
        System.out.print("Unique Roll Numbers: ");
        int count = 0;
        for (int roll : rollNumbers) {
            System.out.print(roll);
            count++;
            if (count < rollNumbers.size()) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

/*
or 
import java.util.ArrayList;
import java.util.List;

public class UniqueRollNumberValidatorSimple {
    public static void main(String[] args) {
        int[] inputRollNumbers = {101, 102, 101, 103};

        List<Integer> uniqueRollNumbers = new ArrayList<>();

        for (int roll : inputRollNumbers) {
            if (!uniqueRollNumbers.contains(roll)) {
                uniqueRollNumbers.add(roll); // add only if not already in list
            }
        }

        // Display unique roll numbers
        System.out.print("Unique Roll Numbers: ");
        for (int i = 0; i < uniqueRollNumbers.size(); i++) {
            System.out.print(uniqueRollNumbers.get(i));
            if (i < uniqueRollNumbers.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}*/
