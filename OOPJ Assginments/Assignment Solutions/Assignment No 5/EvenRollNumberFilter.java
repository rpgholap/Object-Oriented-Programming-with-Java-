/*
Problem 20: Even Roll Number Filter
Use Case: Filter and display only students with even roll numbers.
Requirements:
● Process list of roll numbers
● Remove odd roll numbers
● Display filtered results
Sample Input:
Roll numbers: 101, 102, 103, 104
Expected Output:
Even Roll Numbers: 102, 104
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EvenRollNumberFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> rollNumbers = new ArrayList<>();
        
        System.out.println("Enter number of roll numbers:");
        int n = sc.nextInt();
        
        System.out.println("Enter roll numbers:");
        for (int i = 0; i < n; i++) {
            int roll = sc.nextInt();
            rollNumbers.add(roll);
        }
        
        // Using Iterator to remove odd roll numbers
        Iterator<Integer> iterator = rollNumbers.iterator();
        while (iterator.hasNext()) {
            int roll = iterator.next();
            if (roll % 2 != 0) {
                iterator.remove();
            }
        }
        
        // Display filtered even roll numbers
        System.out.print("Even Roll Numbers: ");
        for (int i = 0; i < rollNumbers.size(); i++) {
            System.out.print(rollNumbers.get(i));
            if (i < rollNumbers.size() - 1) {
                System.out.print(", ");
            }
        }
        
        sc.close();
    }
}
