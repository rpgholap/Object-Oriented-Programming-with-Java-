class Parent{
	
	static void show(){
		System.out.println("Parent class");
	}
}

class Child extends Parent{
	
	static void show(){
		//super.show();//CTE
		System.out.println("Child class");
	}
	
}
//super :cannot be used in Static context
public class StaticDemo {
	
	public static void main(String args[]){
		Child c1 = new Child();
		Child.show();//Error: CTE
		
		Parent p = new Child();
		p.show();
		
		
		
		
		
		
		
	}
}