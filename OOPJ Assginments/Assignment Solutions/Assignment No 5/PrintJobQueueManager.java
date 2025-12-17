/*
Problem 24: Print Job Queue Manager
Use Case: Manage print jobs in a shared printer system.
Requirements:
● Queue print jobs
● Process jobs in order
● Display job status
Sample Input:
Jobs: "Doc1", "Doc2", "Doc3"
Process: 1 job
Expected Output:
Printing Doc1, Queue: Doc2, Doc3
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrintJobQueueManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> printQueue = new LinkedList<>();

        // Input print jobs
        System.out.println("Enter number of print jobs:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter job names:");
        for (int i = 0; i < n; i++) {
            String job = sc.nextLine().trim();
            printQueue.add(job); // enqueue job
        }

        // Process jobs
        System.out.println("Enter number of jobs to process:");
        int processCount = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < processCount && !printQueue.isEmpty(); i++) {
            String job = printQueue.poll(); // dequeue and process
            System.out.print("Printing " + job);
        }

        // Display remaining queue
        if (!printQueue.isEmpty()) {
            System.out.print(", Queue: ");
            int count = 0;
            for (String job : printQueue) {
                System.out.print(job);
                count++;
                if (count < printQueue.size()) {
                    System.out.print(", ");
                }
            }
        }

        sc.close();
    }
}
