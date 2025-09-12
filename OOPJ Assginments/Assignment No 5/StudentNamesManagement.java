/*
Problem 1: Student Names Management System
Use Case: A school administrator needs to maintain a list of student names for a class roster.
Requirements:
● Add student names to the roster
● Display all students
● Remove a student from the roster
Sample Input:
Add students: "Amit", "Priya", "Rohan"
Remove student: "Priya"
Expected Output:
Students: Amit, Roha
*/

import java.util.*;

class StudentNamesManagement{
	List<String> StudentList = new ArrayList<>();
	
	//Add Student
	public void addStudent(String name){
		StudentList.add(name);
	}
	
	//Remove Student
	public void removeStudent(String name){
		if(StudentList.contains(name)){
			StudentList.remove(name);
			System.out.println(name + " has been removed.");
		}
		else{
			System.out.println(name + " is not in the list.");
		}
	}
	
	//Display Students
	public void displayStudent(){
		System.out.print("Students: ");
		for(int i = 0; i < StudentList.size(); i++){
			System.out.print(StudentList.get(i));
			if(i < StudentList.size() - 1){
				System.out.print(", ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		StudentNamesManagement student = new StudentNamesManagement();
		
		//Adding Students
		student.addStudent("Amit");
		student.addStudent("Priya");
		student.addStudent("Rohan");
		
		//Removing a student
		student.removeStudent("Amit");
		
		//Displaying students
		student.displayStudent();
		
	}
}