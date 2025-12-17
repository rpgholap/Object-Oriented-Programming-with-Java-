/*
Problem 22: Ticket Booking Queue
Use Case: Manage customer service in a ticket booking system.
Requirements:
● Queue customers for service
● Serve customers in FIFO order
● Display current queue status
Sample Input:
Queue: "Amit", "Priya", "Rohan"
Serve: 1 customer
Expected Output:
Serving: Amit, Queue: Priya, Rohan
*/


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TicketBookingQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();

        // Input queue
        System.out.println("Enter number of customers in queue:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter customer names:");
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine().trim();
            queue.add(name); // enqueue customer
        }

        // Serve customers
        System.out.println("Enter number of customers to serve:");
        int serveCount = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Serving: ");
        for (int i = 0; i < serveCount && !queue.isEmpty(); i++) {
            System.out.print(queue.poll()); // dequeue customer
            if (i < serveCount - 1 && !queue.isEmpty()) {
                System.out.print(", ");
            }
        }

        // Display remaining queue
        System.out.print(", Queue: ");
        int count = 0;
        for (String customer : queue) {
            System.out.print(customer);
            count++;
            if (count < queue.size()) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}
