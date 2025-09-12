interface Printable{
	void print();      // abstract method -->  declaration 
	void show();
}

class Printer implements Printable{
	public void print(){     // abstract method body
			System.out.println("Printing...!!!");
	}
	
	public void show(){
		System.out.println("Display Contents...!!!");
	}
}

public class Interface{
	public static void main(String args[]){
		Printer p1 = new Printer();   // instance created 
		p1.print();
		p1.show();
		
		System.out.println("Program implemented successfully implemented!!");
	}
}

/*
output:

Printing...!!!
Display Contents...!!!
Program implemented successfully implemented!!

*/