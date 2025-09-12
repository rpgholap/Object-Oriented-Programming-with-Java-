class A{
	final void display(){
		System.out.println("class A: A()");
	}
}


//CTE: cannot override final method 
class B extends A{
	// final void display()  
	void display(){
		System.out.println("class A: A()");
	}
}
public class FinalMethod{
	
	public static void main(String args[]){
		
		A a1 = new A();
		a1.display();
		
		  
	}
	
}


//  