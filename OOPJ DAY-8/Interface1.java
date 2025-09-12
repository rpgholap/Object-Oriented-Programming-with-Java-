interface Printable1{
	void print();      // abstract method  
}
interface Printable2 extends Printable1{ 
	void show();
}

class Printer implements Printable2{
	public void print(){     // abstract method body
			System.out.println("Printing...!!!");
	}
	
	public void show(){
		System.out.println("Display Contents...!!!");
	}
}

public class Interface1{
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