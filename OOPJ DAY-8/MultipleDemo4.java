
interface A{
	default void display1(){
		System.out.println("Parent () : A");
	}
	
}


interface B{
	
	default void display2(){
		System.out.println("Child () : B");
	}
	
}

class C implements A,B{
	public  void display3(){
		System.out.println("Public A & B ()");
	}
	
}
//Multiple inheritance solution in java
public class MultipleDemo4 {
	
	public static void main(String args[]){
		
		C c1 = new C();
		c1.display3();
		c1.display2();
		c1.display1();
		
		
		
		
	}
}