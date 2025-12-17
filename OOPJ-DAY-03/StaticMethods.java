class StaticMethods{
	//static variable
	static int a = 10;
	
	// instance variable
	int b = 20;
	
	// static method
	static void m1(){
		a = 20;
		System.out.println("Method m1.");
		 
		// non-static variable b cannot be referenced from a static context
		// b = 10;
		
		// non-static method m2() cannot be referenced from a static context
		// m2();
	}
	
	void m2(){
		System.out.println("Method m2.");
	}
	
	public static void main(String args[]){
		
	}
}