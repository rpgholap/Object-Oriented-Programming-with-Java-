// Static variables: we can create Static variables at class level only.
// static variables and static blocks are executed in the order they are in program (squenctially).
class StaticVariables{
	
	// static block:
	static{
		System.out.println("Inside static block.");
	}
	
	//static method (main)
	public static void main(String args[]){
		System.out.println("The value of a: " + a);
		System.out.println("Main Method!!");
	}
	
	// static variable:
	static int a = m1();
	
	// static method:
	static int m1(){
		System.out.println("Method m1.");
		return 10;
	}

}