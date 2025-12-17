class X{
	void Show(){
		System.out.println("Class X:X()");
	}
}

final class A extends X{
		
	void display(){//Restriction : method overriding
		System.out.println("Class A:A()");
	}
	
}
/*class B extends A{//Error: Cannot extend final class : IS-A
	
}*/

public class FinalDemo3{
	
	public static void main(String args[]){
		
		A a1 = new A();//instance created
		//A a2;
		//new A();//dynamic allocation
		//Reference a1 = Object & memory allocate
		a1.display();
		
		
		
		
	}
}

	
