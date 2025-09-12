/*
Problem 2: Exam Scores
Scenario: A teacher is using a digital gradebook system to access student scores. Sometimes they might
accidentally try to access the score of a student number that doesn't exist in the class roster.
Task: Create a program that stores exam scores in an array and safely accesses student scores by index.
Sample Input:
3
78 90 85
5
Expected Output:
Invalid index accessed
*/

import java.util.Scanner;

public class ExamScores{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number of Students: ");
		int n = in.nextInt();
		
		System.out.println("Enter the marks: ");
		int[] marks = new int[n];
		
		for(int i = 0; i < marks.length; i++){
			marks[i] = in.nextInt();
		}
		
		int index = in.nextInt();
		try{
			System.out.println(marks[index]);
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid index accessed.");
		}
		
		in.close();
	}
}


/*
output:

Enter the Number of Students:
3
Enter the marks:
67 86 54
5
Invalid index accessed.
*/