class A{
	// int x = 100; 		//instance variable
	// final int x = 100;      // now it will become constant --> compile time constant
	final int x;
	
	//constructor
	A(int x){
		this.x = x;   //a final variable can be initialized in a contructor but only once.
	}
	
	void display(){
//		x = 100;      // error: cannot assign a value to final variable x
	}
	
}

public class FinalKeywords{
	final static int y = 200;
	final int z = 300;
	
	public static void main(String args[]){
		System.out.println(y);  //static variable --> no need to create obj
//		System.out.println(z);  // error: non-static variable z cannot be referenced from a static context
		
		int m = 400;     // local variable
		
		final int n = 500;    // local variable
		
		System.out.println(m);
		System.out.println(n);
		
		A a1 = new A(11);
		System.out.println(a1.x);
		
//		a1.x = 1000;               // cannot assign a value to final variable x
		
//		n = 700;        // Reassingment of value is not possible with final keyword
//		System.out.println(n);     // error :  cannot update final variable
		
		  
	}
	
}

/*
output:
200
400
500
11
*/