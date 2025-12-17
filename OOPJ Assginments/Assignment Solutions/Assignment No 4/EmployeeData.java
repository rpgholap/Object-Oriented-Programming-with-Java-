/*
Problem 4: Employee Data
Scenario: An HR system needs to calculate hourly wage by dividing an employee's salary by working
hours. The system must handle both invalid employee indices and division by zero.
Task: Create a method with nested try-catch blocks to handle multiple exception scenarios.
Sample Input:
2
5000 6000
0
5
Expected Output:
Division by zero
or
Invalid index
*/

import java.util.Scanner;

class EmployeeData{
	
	public static void main(String args[]){		
		Scanner in = new Scanner(System.in);
		System.out.println("Number of Employees: ");
		int n = in.nextInt();
		
		System.out.println("Index of employee for wage calculation");
		int employeeIndex = in.nextInt();
		
		System.out.println("Enter Salary:"); 
		int[] salary = new int[n];
		for(int i = 0; i<n; i++){
			salary[i] = in.nextInt();
		}
		
		System.out.println("Enter Hours:");
		int[] hours = new int[n];
		for(int i = 0; i < n; i++){
			hours[i] = in.nextInt();
		}
		
		try{
			int empSalary = salary[employeeIndex];
			int empHours = hours[employeeIndex];
			
			try{
				int wage = empSalary/empHours;
				System.out.println("Hourly wage: " + wage); 
			} catch(ArithmeticException e){
				System.out.println("Division by zero");
			}
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid Index.");
		}
		
		in.close();
	}	
}


/*
output:
Number of Employees:
2
Index of employee for wage calculation
1
Enter Salary:
231
121
Enter Hours:
2
0
Division by zero
---------------------------------------------------------
Number of Employees:
2
Index of employee for wage calculation
5
Enter Salary:
121
111
Enter Hours:
1
1
Invalid Index.
*/