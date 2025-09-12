class A{
	void testdata(){
		System.out.println("A:: testdata()");
	}
}

class B extends A{
	/*void testdata(){
		System.out.println("B:: testdata()");
	}*/

}

public class UpCastingDemo {
	
	public static void main(String args[]){
		
		A a1 = new A();//Parent class object 
		B b1 = new B();//Child class object
		
		A x = new B();// Upcasting
		x.testdata();
		
	
	}
}