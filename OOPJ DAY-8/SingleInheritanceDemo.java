
class Parent{
	int a=10;
	int b=20;
	
	void PrintData(){
		System.out.println("Parent class : P");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	
}

class Child extends Parent{
	int x =30;
	void PrintChildData(){
		System.out.println("Childclass : C1");
		System.out.println("x="+x);
	}
}

public class SingleInheritanceDemo{
	
	public static void main(String args[]){
		
		Child c = new Child();
		c.PrintChildData();
		c.PrintData();
		
	}
}