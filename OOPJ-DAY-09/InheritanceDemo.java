
class A{
	
	A(){
		
		System.out.println("Const a: A()");
	}
	@Override
	void display(){
		System.out.println("A(): A");
	}
	
}
class B extends A{
	
	B(){
		super();
		System.out.println("Const b: B()");
	}
	@Override
	void display(){
		System.out.println("B(): B");
	}
}
class C extends B{
	C(){
		super();
		System.out.println("Const c: C()");
	}
	@Override
	void display(){
		System.out.println("C(): C");
	}
}

public class InheritanceDemo {
	
	public static void main(String args[]){
		
		C a1 = new C();
		a1.display();
		
		//C a1 = new C();
		//a1.display();
		
		
		
		
	}
}