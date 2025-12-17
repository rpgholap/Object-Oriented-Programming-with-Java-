/*
Problem 3: Daily Task Tracker
Use Case: A student wants to track their daily tasks and mark completed ones.
Requirements:
● Add tasks to the list
● Mark tasks as completed (remove them)
● Display remaining tasks
Sample Input:
Add tasks: "Study Java", "Complete Assignment", "Exercise"
Complete task: "Exercise"
Expected Output:
Remaining tasks: Study Java, Complete Assignment
*/

import java.util.ArrayList;
import java.util.List;

public class DailyTaskTracker {
    public static void main(String[] args) {
        // Create a list to store tasks
        List<String> tasks = new ArrayList<>();

        // Add tasks
        tasks.add("Study Java");
        tasks.add("Complete Assignment");
        tasks.add("Exercise");

        // Complete a task (remove from the list)
        String completedTask = "Exercise";
        if (tasks.contains(completedTask)) {
            tasks.remove(completedTask);
            System.out.println(completedTask + " has been completed and removed from the list.");
        } else {
            System.out.println(completedTask + " is not in the list.");
        }

        // Display remaining tasks
        System.out.print("Remaining tasks: ");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.print(tasks.get(i));
            if (i < tasks.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}



/*
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DailyTaskTracker {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("Welcome to Daily Task Tracker!");

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Task");
            System.out.println("2. Complete Task");
            System.out.println("3. Display Remaining Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task to add: ");
                    String taskToAdd = scanner.nextLine();
                    tasks.add(taskToAdd);
                    System.out.println("Task added: " + taskToAdd);
                    break;

                case 2:
                    System.out.print("Enter task to complete: ");
                    String taskToComplete = scanner.nextLine();
                    if (tasks.contains(taskToComplete)) {
                        tasks.remove(taskToComplete);
                        System.out.println("Task completed: " + taskToComplete);
                    } else {
                        System.out.println("Task not found: " + taskToComplete);
                    }
                    break;

                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No remaining tasks.");
                    } else {
                        System.out.print("Remaining tasks: ");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.print(tasks.get(i));
                            if (i < tasks.size() - 1) System.out.print(", ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    exit = true;
                    System.out.println("Exiting Daily Task Tracker. Have a productive day!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}

*/