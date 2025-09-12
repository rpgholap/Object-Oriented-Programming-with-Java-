// static methods can called without creating instance of the object.

class StaticWithoutObject{
	
	// static method:
	static void m1(){
		System.out.println("Method m1.");
	}
	
	public static void main(String args[]){
		m1();  // calling m1 without creating any object
	}
}