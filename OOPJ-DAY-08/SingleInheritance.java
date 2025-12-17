// Parent Class
class Parent{
	int a = 10;
	int b = 20;
	
	void PrintData(){
		System.out.println("Parent Class: P");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
}


// Child class (Inherit Parent class)
class Child extends Parent{
	void PrintChildData(){
		
		int x = 30;
		System.out.println("Child Class: C1");
		System.out.println("x: " + x);
		
	}
}


// Driver Class 
public class SingleInheritance{
	public static void main(String args[]){
		
		// method to create reference 
		// obj of child class : 
		Child c = new Child();
		
		// gives output cz of child class inherited the properties and behavior from parent class
		// child class method
		c.PrintChildData();       // access through child class reference
		// o/p: Child class: c1
		
		// parent class 
		c.PrintData();        // access through child class reference
		// o/p: Parent Class: P
	}
}

/*
output: 
Child Class: C1
x: 30
Parent Class: P
a: 10
b: 20
*/