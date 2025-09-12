class A{
	void show(){
		System.out.println("Class A method : A()");
	}
}

class B extends A{
	void show(){
		System.out.println("Class B method : B()");
	}
}

class D extends B{
	void show(){
		System.out.println("Class D method : D()");
	}
}

public class MethodOverridingDemo{
		
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