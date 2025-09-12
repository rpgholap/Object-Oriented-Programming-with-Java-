/*
Problem 7: Student List
Scenario: A school management system tries to load a student list from a file at the beginning of each
semester. Sometimes the file might not exist or be corrupted.
Task: Simulate file reading operation and handle FileNotFoundException.
Sample Input:
student_list.txt
Expected Output:
File not found
*/

import java.util.*;
import java.io.*;

class StudentList{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the filename: ");
		String file = in.nextLine();
		try{
			FileReader fr = new FileReader(file);
			System.out.println("File Found");
		} catch(FileNotFoundException e){
			System.out.println("File Not Found");
		}
	}
}


/*
output:
Enter the filename:
abc.txt
File Not Found
------------------------------
Enter the filename:
AgeRestriction.java
File Found
*/