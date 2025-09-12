/*
	1. Greatest of Two Test Scores
	Scenario: Your friend took two mock tests. Write a program to take the two test scores as input and print
	which test the friend scored higher in.
	Input:
	Enter score for Test 1: 78
	Enter score for Test 2: 85
	Output:
	Test 2 has higher score.
*/
import java.util.Scanner;

class GreatestofTwoTestScores{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter score for Test 1: ");
        int test1 = in.nextInt();

        System.out.print("Enter score for Test 2: ");
        int test2 = in.nextInt();

        if (test1 > test2) {
            System.out.println("Test 1 has higher score.");
        } else if (test2 > test1) {
            System.out.println("Test 2 has higher score.");
        } else {
            System.out.println("Both tests have equal scores.");
        }

        in.close();
    }
}
