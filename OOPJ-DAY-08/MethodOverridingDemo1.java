class A{
	void show(){
		System.out.println("Class A method : A()");
	}
}

class B extends A{
	
}

class D extends B{
	
}

public class MethodOverridingDemo1{
	void show(){
		System.out.println("Class B method : B()");
	}
		
	public static void main(String args[]){
		
		A a1 = new A();
		a1.show();
		
		B b1 = new B();
		b1.show();
		
		A c1 = new B();
		c1.show();
		
		B d1 = new D();
		d1.show();
		
		
		
	}
}