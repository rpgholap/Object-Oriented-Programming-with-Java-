class UnderstandError{
	// default values
	int x = 100;
	int y = 200;
	int z = 300;
	
	UnderstandError(){
		System.out.println("This is default constructor!");
	}
	
	UnderstandError(int a, int b){
		
		System.out.println("This is parameterized constructor");
	}
		
	
	public static void main(String args[]){
		
		UnderstandError e1 = new UnderstandError();
		UnderstandError e2 = new UnderstandError(10, 20);
		UnderstandError e3 = new UnderstandError(11, 20.45);
		
		// UnderstandError e4 = new UnderstandError(20.34);        --> error  : no suitable constructor found for UnderstandError(double)
		
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