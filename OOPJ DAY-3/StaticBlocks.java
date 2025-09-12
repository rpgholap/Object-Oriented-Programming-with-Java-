// static block: executed once when class is first loaded.
// it initialize static variables before main method is executed.

class StaticBlocks{
	
	//static variables:
	static int a = 20;
	static int b;
	
	// static block:
	static{
		System.out.println("Static block intialized.");
		b = a + 4;
	}
	
	public static void main(String[] args){
		System.out.println("main method");
		System.out.println("Value of a: " + a);
		System.out.println("Value of b: " + b);
	}	
}