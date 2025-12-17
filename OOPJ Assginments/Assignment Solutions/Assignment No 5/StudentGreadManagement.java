/*
Problem 11: Student Grade Management
Use Case: A teacher needs to map student names to their exam marks.
Requirements:
● Store student name and marks pairs
● Retrieve marks by student name
● Display all student-marks mappings
Sample Input:
Students and marks: "Amit" → 85, "Priya" → 92, "Rohan" → 78
Expected Output:
Grade Report: Amit:85, Priya:92, Rohan:78
*/
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;

class StudentGreadManagement{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> studentMarks = new HashMap<>();
		
		System.out.println("Enter number of students: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the name and marks: ");
		for(int i = 0; i<n; i++){
			System.out.println("Name: ");
			String name = sc.nextLine().trim();
			System.out.println("Marks: ");
			int marks = sc.nextInt();
			sc.nextLine();
			studentMarks.put(name, marks);
		}
		
		System.out.println("Grade Report: ");
		int count = 0;
		for(Map.Entry<String, Integer> entry : studentMarks.entrySet()){
			System.out.print(entry.getKey() + " : " + entry.getValue());
			count++;
			
			if(count < studentMarks.size()){
				System.out.print(", ");
			}
		}
	}
	
}