class ExceptionExample{
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


/*
output:
java ExceptionExample 10 20
Started...
Got two number:
Division is: 0
Ended...

//===================================================================================================================

errors: 

// 1.
java ExceptionExample
Started...
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at ExceptionExample.main(ExceptionExample.java:4)

// 2.
java ExceptionExample avc
Started...
Exception in thread "main" java.lang.NumberFormatException: For input string: "avc"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:662)
        at java.base/java.lang.Integer.parseInt(Integer.java:778)
        at ExceptionExample.main(ExceptionExample.java:4)
*/

//======================================================================================================================

// for error handling : try catch block

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