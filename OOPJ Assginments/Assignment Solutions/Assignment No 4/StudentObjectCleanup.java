/*
Problem 22: Student Object Cleanup
Scenario: A student management system creates student objects during registration. When these objects
are no longer needed, the system should clean up resources before garbage collection.
Task: Override finalize method to demonstrate cleanup during garbage collection.
Sample Input:
Student Name: Amit
Expected Output:
Student object for Amit is being garbage collected
*/

import java.util.Scanner;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    @Override
    public void finalize() {
        System.out.println("Student object for " + name + " is being garbage collected");
    }
}

class StudentObjectCleanup {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Student Name:");
        String name = in.nextLine();

        Student student = new Student(name);
        student = null; // Dereference to allow GC

        System.gc(); // Suggest garbage collection

        // Give some time for GC to run
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // Do nothing
        }

        in.close();
    }
}
