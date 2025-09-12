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
	void m2(){
		System.out.println("Method of child class: C ");		
	}
}


// Driver Class : Main()
public class SingleInheritance1{
	public static void main(String args[]){
		
		Child c = new Child();
		c.PrintChildData();    
		c.PrintData();

		c.m2();
		
		Parent p = new Parent();
		System.out.println("a: "+ p.a);
		p.PrintData();
		// p.PrintChildData();   -->Error (cannot access child class)
		
		
		
	}
}


/*
output:

Child Class: C1
x: 30
Parent Class: P
a: 10
b: 20
Method of child class: C
a: 10
Parent Class: P
a: 10
b: 20

*/
