/*
28. Traffic Signal Instruction
Scenario: Take traffic signal color as input (Red, Green, Yellow) and print appropriate instruction.
Input:
Enter traffic light color: Green
Output:
Go
*/

import java.util.Scanner;

class TrafficSignal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter traffic light color (Red/Yellow/Green): ");
        String color = sc.next().toLowerCase();  // convert to lowercase

        switch(color) {
            case "red": System.out.println("Stop"); break;
            case "yellow": System.out.println("Wait"); break;
            case "green": System.out.println("Go"); break;
            default: System.out.println("Invalid color.");
        }
    }
}

