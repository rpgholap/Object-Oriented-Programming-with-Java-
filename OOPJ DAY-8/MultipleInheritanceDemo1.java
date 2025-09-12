class A{
	int a=10;
	void showA(){
		System.out.println("Class A method: showA()");
	}
}

class B extends A{
	int b=20;
	void showB(){
		System.out.println("Class B method: showB()");
	}
}

class C extends B{
	int c=30;
	void showC(){
		System.out.println("Class C method: showC()");
	}
	
}
public class MultipleInheritanceDemo1{
		
	public static void main(String args[]){
		int d=100;
		A a1 = new A();
		a1.showA();
		System.out.println(a1.a);
		System.out.println();
		
		B b1 = new B();
		b1.showB();// method of B class
		b1.showA();//inherited method from class A
		System.out.println(b1.b);
		System.out.println(b1.a);
		//System.out.println(b1.c);//Error
		System.out.println();
		
		C c1 = new C();
		c1.showC();//method of C class
		c1.showB();//inherited method from  B class
		c1.showA();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.c);
		System.out.println(d);
		System.out.println();
		
		
		
	}
}