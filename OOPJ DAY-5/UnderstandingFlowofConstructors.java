class UnderstandingFlowofConstructors{
	UnderstandingFlowofConstructors(){   // default constructor 
		System.out.println("This is default Constructor");
	}
	
	public static void main(String args[]){
		System.out.println("Hello Rutuja");
		
		// object creation:
		UnderstandingFlowofConstructors c1 = new UnderstandingFlowofConstructors();              // Instance created 
		System.out.println("Hello Everyone");
		
	}
	
}


/*
Output: Understand the flow here 
Hello Rutuja
This is default Constructor      
Hello Everyone
*/