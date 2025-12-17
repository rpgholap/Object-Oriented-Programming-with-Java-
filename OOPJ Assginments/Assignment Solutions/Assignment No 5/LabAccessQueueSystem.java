/*
Problem 2: Lab Access Queue System
Use Case: A computer lab needs to manage students waiting for access using a first-come-first-served
system.
Requirements:
● Students join the queue for lab access
● Process students in FIFO order
● Display remaining queue
Sample Input:
Enqueue: "Amit", "Priya", "Rohan"
Dequeue: 1 student
Expected Output:
Queue: Priya, Rohan
*/


import java.util.LinkedList;
import java.util.Queue;

public class LabAccessQueueSystem {
    public static void main(String[] args) {
        // Create a queue to manage students
        Queue<String> queue = new LinkedList<>();

        // Enqueue students
        queue.add("Amit");
        queue.add("Priya");
        queue.add("Rohan");

        // Dequeue 1 student (process the student at the front)
        if (!queue.isEmpty()) {
            String removedStudent = queue.poll(); // Removes and returns the head of the queue
            System.out.println(removedStudent + " has been processed.");
        } else {
            System.out.println("The queue is empty.");
        }

        // Display remaining students in the queue
        System.out.print("Queue: ");
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            System.out.print(queue.poll());
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}


/*
output:
Amit has been processed.
Queue: Priya, Rohan
*/