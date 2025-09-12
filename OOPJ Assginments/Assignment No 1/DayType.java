/*
	29. Day Type Selection
	Scenario: Take user input for day type (1–Workday, 2–Weekend) and print working status.
	Input:
	Enter day type (1–Workday, 2–Weekend): 2
	Output:
	It’s weekend. No work today.
*/


import java.util.Scanner;

class DayType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day type (1–Workday, 2–Weekend): ");
        int type = sc.nextInt();

        switch (type) {
            case 1 -> System.out.println("It’s workday. Time to work.");
            case 2 -> System.out.println("It’s weekend. No work today.");
            default -> System.out.println("Invalid input!");
        }
        sc.close();
    }
}
