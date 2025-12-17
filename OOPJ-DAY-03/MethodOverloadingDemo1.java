class Overload{

	static void show(int id){
		int x = id;
		System.out.println("This is overloading: 21: x="+x );
	}

}

//Driver class
class MethodOverloadingDemo1{
	
	static int x;
	static float x1;
		
	static void show(int id){
		x = id;
		System.out.println("This is overloading: 2: x="+x );
	}
	
	static void show(float id){
		x1 = id;
		System.out.println("This is overloading: 3: x1="+x1 );
	}
	
	public static void main(int id){}
	
	public static void main(String args[]){
		
		
		
		show(13.56f); //compile time : Number of parameters
		show(10); //compile time : Number of parameters
		Overload.show(234);
		
		
	}
	
	
	
}