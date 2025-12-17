/*
Problem 1: Salary Split
Scenario: You are developing a payroll system for a company. The HR department wants to distribute a
bonus equally among employees in a department. However, sometimes a department might have zero
employees due to restructuring.
Task: Create a method that divides a bonus amount among employees and handles the case when the
number of employees is zero.
Sample Input:
10000
0
Expected Output:
Error: Division by zero not allowed
*/
import java.util.Scanner;

public class SalarySplit{
	public static void Bonous(int bonus, int employees){
		try{
			int amountPerEmployee = bonus / employees;
			System.out.println("Amount per Employee: " + amountPerEmployee);
		} catch(ArithmeticException e){
			System.out.println("Error: Divide by zero not allowed");
		}
	}
	
	public static void main(String args[]){		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Bonous: ");
		int bonus = in.nextInt();
		System.out.println("Enter the number of employees: ");
		int employees = in.nextInt();
		
		Bonous(bonus, employees);
		
		in.close();
	}	
}

/*
output:
Enter the Bonous:
1000
Enter the number of employees:
0
Error: Divide by zero not allowed

*/

	
