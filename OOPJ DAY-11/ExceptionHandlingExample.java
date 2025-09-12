
/*

When an error occurs, the JVM creates an object for that error. 
If its type matches the type specified in the catch block, 
the reference to the error object is assigned to ‘e’, and it prints the error information."

try{
	code..... --> possibal errors: doubtful statements 
}
catch(ExceptionType e){
	// handling code 
}

*/

class ExceptionHandlingExample{
	public static void main(String[] args){
		System.out.println("Started...");
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		
		System.out.println("Got two number:");
		int result = n1/n2;
		System.out.println("Division is: "+ result);
		
		System.out.println("Ended...");
	}
}