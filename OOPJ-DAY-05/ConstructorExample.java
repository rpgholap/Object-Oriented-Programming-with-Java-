class ConstructorExample{
	int x;
	int y;
	double z;
	
	ConstructorExample(){
		System.out.println("This is default constructor!");
	}
	
	
	ConstructorExample(int a, int b){
		
		System.out.println("This is parameterized constructor");
		this.x = a ;    // using with instance variable  --> Assigns the parameter 'a' to the instance variable 'this.x'
		
		// The primary significance of this.x = a; is to explicitly differentiate between an instance variable x 
		// and a local variable or method parameter a
	}
	
	ConstructorExample(int a1, double b1){
		System.out.println("This is parameterized constructor with int and double!");
		this.x = a1;
		this.z = b1;
		
	}
	
	public static void main(String args[]){
		
		ConstructorExample e1 = new ConstructorExample();
		// ConstructorExample e1 = new ConstructorExample(10, 20);    // error
			// variable e1 is already defined in method main(String[])
		ConstructorExample e2 = new ConstructorExample(10, 20);
		ConstructorExample e3 = new ConstructorExample(11, 20.45);
		
		System.out.println("Be happy!!");
	}
	
}
 
/*
// Output:
	This is default constructor!
	This is parameterized constructor
	This is parameterized constructor with int and double!
	Be happy!!
*/