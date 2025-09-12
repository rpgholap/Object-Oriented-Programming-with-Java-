class Overload{

	
}

//Driver class
class MethodOverloadingDemo{
	
	int x;
	float x1;
	
	void show(){
		System.out.println("This is overloading: 1");
	}
	
	void show(int id){
		x = id;
		System.out.println("This is overloading: 2: x="+x );
	}
	
	void show(float id){
		x1 = id;
		System.out.println("This is overloading: 3: x="+x1 );
	}
	
	void show(float id, int age){
		int a;
		a = age;
		x1 = id;
		System.out.println("This is overloading: 3: x="+x1+"a="+a );
	}
	
	void show(int age, float id){
		int a1;
		a1= age;
		x1 = id;
		System.out.println("This is overloading: 3: x="+x1+"a1="+a1 );
	}
	
	public static void main(String args[]){
		
		
		MethodOverloadingDemo d1 = new MethodOverloadingDemo();
		//MEthod 1
		d1.show(); //compile time : Number of parameters
		d1.show(10); //compile time : Number of parameters
		
		//MEthod 2
		d1.show(); //compile time : Type of parameters
		d1.show(10);//compile time : Type of parameters
		d1.show(10.0f);//compile time : Type of parameters
		
		//Method 3
		d1.show(12,3.45f); //compile time: Order of parameters
		d1.show(3.45f, 55);//compile time:
		
	}
	
	
	
}