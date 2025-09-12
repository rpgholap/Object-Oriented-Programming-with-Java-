/*
	11. Grade Based on Percentage
	Scenario: Your friend got exam marks. Take percentage marks as input and print the grade:
	● 90+ → A+
	● 76–89 → A
	● 66–75 → B+
	● 51–65 → B
	● 36–50 → C
	● Below 35 → Fail
	Input:
	Enter percentage marks: 82
	Output:
	Grade: A
*/

import java.util.Scanner;

class GradeCheckPercentage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter percentage marks: ");
        int marks = in.nextInt();

        String grade;
        if (marks >= 90) {
            grade = "A+";
        } else if (marks >= 76) {
            grade = "A";
        } else if (marks >= 66) {
            grade = "B+";
        } else if (marks >= 51) {
            grade = "B";
        } else if (marks >= 36) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        System.out.println("Grade: " + grade);

        in.close();
    }
}
