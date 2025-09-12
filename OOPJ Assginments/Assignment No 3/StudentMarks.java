/* 
	2. Student Marks
	Scenario: A teacher wants to update student marks but must ensure marks are valid.
	Problem Statement:
	Create a class Student with private marks. Create getter and setter with validation (0–100).
	Fields:
	● private int marks
	Methods:
	● setMarks(int marks) → validate and set
	● getMarks() → return marks
	Sample Input:
	marks = 85
	Sample Output:
	Marks = 85
	
	
*/
import java.util.Scanner;

class Student{
	private int marks;
	
	boolean setMarks(int marks){
		
		if(marks > 0 && marks <= 100){
			this.marks = marks;
			return true;
		}
		else{
			System.out.println("Not Valid!! ");
			return false;
		}
	}
	
	int getMarks(){
		return marks;    //returns the current value of marks
	} 
}

public class StudentMarks{
	public static void main(String args[]){
		Student stud = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks: ");
		int inputmarks = sc.nextInt();
		
		if(stud.setMarks(inputmarks)){
			System.out.println("Marks of Student: " + stud.getMarks());
		}
	}
}


/*
Output:

Enter Marks:
85
Marks of Student: 85

Enter Marks:
120
Not Valid!!
Marks of Student: 0      <--- overcome from boolean

------------------------------------------

Enter Marks:
75
Marks of Student: 75

Enter Marks:
120
Not Valid!!

*/