class UseOfThis{
	int x;
	int y;
	double z;
	
	UseOfThis(){
		System.out.println("This is default constructor!");
	}
	
	
	UseOfThis(int a, int b){ 
		this(11, 13.2);      // goes to --> UseOfThis(int a1, double b1)
		
		System.out.println("This is parameterized constructor");
		this.x = a ;    // using with instance variable  --> Assigns the parameter 'a' to the instance variable 'this.x'
		
		// The primary significance of this.x = a; is to explicitly differentiate between an instance variable x 
		// and a local variable or method parameter a
	}
	
	UseOfThis(int a1, double b1){
		System.out.println("This is parameterized constructor with int and double!");
		this.x = a1;
		this.z = b1;
		
	}
	
	public static void main(String args[]){
		
		UseOfThis e1 = new UseOfThis();
		// UseOfThis e1 = new UseOfThis(10, 20);    // error
			// variable e1 is already defined in method main(String[])
		UseOfThis e2 = new UseOfThis(10, 20);
		UseOfThis e3 = new UseOfThis(11, 20.45);
		
		// UseOfThis e4 = new UseOfThis(20.34);        --> error  : no suitable constructor found for UseOfThis(double)
		
		System.out.println("Be happy!!");
	}
	
}
 
/*
// Output:
	This is default constructor!
	This is parameterized constructor with int and double!
	This is parameterized constructor
	This is parameterized constructor with int and double!
	Be happy!!
*/