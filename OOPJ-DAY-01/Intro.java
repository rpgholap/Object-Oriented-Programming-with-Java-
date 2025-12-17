class Intro{
	public static void main(String args[]){
		System.out.println("Welcome to java programming!!");
	}
}

// compile : javac filename.java
// Execute: java filename (filename is class name of the program)

// class name = filename
// At least one class is required to execute each program 
// each program execution starts from main() method. 
// main method is the entry point of the program, from which jvm starts execute the program.

// public static void main(String args[]) --> 

	// public : access modifier -->  who can access it
	// static : method modifier --> bcz of static we do not have call the method or not have to create object
	// void : return type --> does not return any value
	// main : methodName  --> entry point of program 
	// (String args[]) : parameters which is of string data type : char/number/special char
	// args[] : accepts multiple arguments 
	// (String args[]) or (String[] args) both can be accepted.

// [] : array
// () : Function/ method
// {} : scope

// System.out.println() -->
// System : inbuilt java class  (defined in java.lang package)
// out : out is public static final reference variable of java.io.PrintStream type
// println() : method of PrintStream class. it prints given text to console window.


// in one program we can make multiple classes 
// if we are creating multiple classes then we have to complile that if not then class will not convert into bytecode hence will not exceuted.
// in one program we can not create two main() [signature method] --> method overloading  

// but we can create two different main method, different signature should be there, parameters should be different 


/*
 Importance of static keyword in main method :
	- imp for execute
	- initiating the main method automatically 
	

*/