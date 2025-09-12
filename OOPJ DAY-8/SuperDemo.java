class Parent{
	int x=100;
	
	Parent(){
		System.out.println("Parent constructor");
	}
	void show(){
		System.out.println("Parent class");
	}
}

class Child extends Parent{
	int x=200;
	Child(){
		super();
		System.out.println("Child constructor");
	}
	void display(){
		System.out.println("Child="+x);
		System.out.println("Parent="+super.x);
	}
	void show(){
		super.show();//call Parent class method
		System.out.println("Child class");
	}
	
}
class Child1 extends Child{
	int x=400;
	Child1(){
		super();
		System.out.println("Child1 constructor");
	}
	void display(){
		System.out.println("Child="+x);
		System.out.println("Parent="+super.x);
	}
	void show(){
		super.show();//call Parent class method
		System.out.println("Child1 class");
	}
	
}
public class SuperDemo {
	
	public static void main(String args[]){
		Child c1 = new Child();
		//c1.show();
		//c1.display();
		
		Child1 c11 = new Child1();
		//c11.show();
		
		
		
		
		
		
		
	}
}