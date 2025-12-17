/*
3. Employee Age Validation
Scenario: HR wants to ensure employees entered in the system are adults.
Problem Statement:
Create a class Employee with private age. Provide getter/setter. Setter should reject age < 18.
Fields:
● private int age
Methods:
● setAge(int age) → if age >=18, set; else show error
● getAge() → returns age
Sample Input:
age = 17
Sample Output:
“Invalid age”

*/
import java.util.Scanner;

class Employee{
	private int age;
	
	boolean  setAge(int age){
		if(age >= 18){
			this.age = age;
			System.out.println("Your are adult!");
			return true;
		}
		else{
			System.out.println("Invalid age");
			return false;
		}
	}
	
	int getAge(){
		return age;
	}
} 


public class EmployeeAgeValidation{
	public static void main(String age[]){
		
		Employee emp = new Employee();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Age: ");
		
		int inputAge = sc.nextInt();
		
		
		if(emp.setAge(inputAge)){
			System.out.println(emp.getAge());
		}
		
	}
}

/*
output: 
	Age:
	17
	Invalid age
	
	Age:
	55
	Your are adult!
	55

*/