class A{
		
	final void display(){
		System.out.println("Class A:A()");
	}
	
}
class B extends A{
	/*void display(){//Error: Cannot override final method
		System.out.println("Class B:B()");
	}*/
}
class C extends B{
	void display(){
		System.out.println("Class B:B()");
	}
	
}
	
public class FinalDemo2{
	
	public static void main(String args[]){
		
		A a1 = new A();
		a1.display();
		
		/*B b1 = new B();
		b1.display();*/
		
		
	}
}

	
