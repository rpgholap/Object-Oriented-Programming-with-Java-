package com.accessmod;

class Employee{
	private double sal;
	
	public Employee(double sal){
		this.sal = sal;
	}
	
	private void display() {
		System.out.println("Private method : executed");
		
	}
	
	 public void show(){
		System.out.println("Normal  method : executed");
		display();//Accessible within the class
		
	}

}

public class PrivateDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(50000);
		//System.out.println("Salary="+e1.sal);//Error: private variable
		
	//	e1.display();//Error: private method
		e1.show();
		

	}

}
