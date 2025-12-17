class A{
	void testdata(){
		System.out.println("A:: testdata()");
	}
}

class B extends A{
	void testdata1(){
		System.out.println("B:: testdata1()");
	}

}

public class DownCastingDemo {
	
	public static void main(String args[]){
		
		A a1 = new A();//Parent class object 
		B b1 = new B();//Child class object
		
		
		//Ref: Parent = Object: Child
		A x = new B();// Upcasting
		x.testdata();//Overridden method
		
		//B y = new A();//Error:CTE //Not allowed
		B y = (B) x;//Downcasting
		y.testdata1(); //subclass ( child class) method call karne ke liye
	
		A x = new A();// Exception : ClassCastException
		//Soln: instanceof : prevent classCastException
	}
}

	
