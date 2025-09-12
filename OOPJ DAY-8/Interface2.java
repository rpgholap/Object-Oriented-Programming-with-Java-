interface Printable1{
	void print();      // abstract method
	
	// we can define static methods in interface
	static int cube(int x){
		return x*x*x;
	}
	
	// we cannot create object of interface directly but we can specify "default"
	default int square(int x){
		return x*x;
	}
	

	private void display(){
		System.out.println("Hello Private..!!");
	}
}

// we cannot create object of interface directly hence we use "implements" keyword
class Printer implements Printable1{
	public void print(){     // abstract method body
			System.out.println("Printing...!!!");
	}
	
	public void show(){
		System.out.println("Display Contents...!!!");
	}
}

public class Interface2{
	public static void main(String args[]){
		Printer p1 = new Printer();   // instance created 
		p1.print();
		p1.show();
		System.out.println("Cube:" + Printable1.cube(2));
		System.out.println("Cube:" + p1.square(2));
		System.out.println("Program implemented successfully implemented!!");
		// Printable1.display();        --->  display() has private access in Printable1
	}
}

/*
output:

Printing...!!!
Display Contents...!!!
Cube:8
Program implemented successfully implemented!!

*/