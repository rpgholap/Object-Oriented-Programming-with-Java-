
class Parent{
	void display(){
		System.out.println("Parent () : P");
	}
	
}


class Child extends Parent{
	@Override
	void display(){
		System.out.println("Child () : C");
	}
	
}
public class MethodOverridingDemo3{
	
	public static void main(String args[]){
		Child c1 = new Child();
		c1.display();
		
		Parent p = new Child();
		p.display();
		
		
		
		
	}
}