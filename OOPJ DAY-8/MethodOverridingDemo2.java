interface A{
	void show();//Abstract method
}

class B implements A{
	@Override//annotation
	public void show(){
		System.out.println("Class B method : B()");
	}
}

class D implements A{
	@Override
	public void show(){
		System.out.println("Class D method : D()");
	}
}

public class MethodOverridingDemo2{
	
	public static void main(String args[]){
		
		A a1; 
		
		a1 = new D();
		a1.show();
		
		a1 = new B();
		a1.show();
		
		
		
	
		
		
		
	}
}