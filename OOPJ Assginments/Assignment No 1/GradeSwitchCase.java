/*
	24. Grade Using Switch (Ranges)
	Scenario: Take marks (0–100) and print grade using switch-case grouping:
	● 0–24 → F
	● 25–44 → E
	● 45–54 → D
	● 55–69 → C
	● 70–84 → B
	● 85–100 → A
	Input:
	Enter marks: 78
	Output:
	Grade: B
*/

import java.util.Scanner;

class GradeSwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        int marks = in.nextInt();

        String grade;

        if (marks < 0 || marks > 100) {
            grade = "Invalid marks";
        } else {
            switch (marks / 10) {
                case 10: case 9:
                    grade = "A"; break;
                case 8: case 7:
                    grade = "B"; break;
                case 6: case 5:
                    if (marks >= 55) {
                        grade = "C"; // 55–69
                    } else if (marks >= 45) {
                        grade = "D"; // 45–54
                    } else if (marks >= 25) {
                        grade = "E"; // 25–44
                    } else {
                        grade = "F"; // 0–24
                    }
                    break;
                case 4:
                    grade = "D"; break; // 45–49
                case 3:
                    grade = (marks >= 25) ? "E" : "F"; break;
                case 2: case 1: case 0:
                    grade = "F"; break;
                default:
                    grade = "Invalid marks";
            }
        }

        System.out.println("Grade: " + grade);

        in.close();
    }
}
