class A{
	final int x = 100;//constant:Compile time constant
}
	
public class FinalDemo{
	final static int y = 200;
	final int z =300;
	
	public static void main(String args[]){
		int m=400;//local variable
		final int n=500;//compile-time constant
		
		System.out.println(y);//static variable
		//System.out.println(z);//instance variable
		System.out.println(m);//local variable
		System.out.println(n);//local variable
		
		m=500;
		//n=700;//Re-assignment of value is not possible with final keyword
		System.out.println(m);//local variable
		System.out.println(n);//local variable
		
		A a1 =new A();//instance
		System.out.println(a1.x);
		a1.x=1000;
		System.out.println(a1.x);
		
	}
}

	
