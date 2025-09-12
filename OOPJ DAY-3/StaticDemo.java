class Demo{
	static int m =100;
	static void show1(){
		System.out.println("Show(): Demo :static method()");
	}
}

class StaticDemo{
	
	int x=10;//instance variable
	static int y =20;
	static int y1;
	
	static{
		 y1 = 2000;
		System.out.println("Static block y: "+y);//static variable
		System.out.println("Static block y1: "+y1);// static variable : initiatize in a block
	}
	
	void display(){//Instance method(): accepts static and non static both variables
		System.out.println("Display(): Instance method()");
		System.out.println(y);
		System.out.println(x);
	}
	
	static void show(){//Static method: accept only static variables
		System.out.println("Show(): static method()");
		System.out.println(y);
		System.out.println(x);//Error : static() will not accept instance variable
	}
	
	public static void main(String args[]){
		
		//System.out.println(x);//Error: access nahi kar sakte hai: Ref cahiye
		System.out.println(y);
		System.out.println(Demo.m);
		
		StaticDemo d1 = new StaticDemo();//Instance created
		d1.display();//Instance method call
		
		show();//static method call
		Demo.show1();//static method call
		
	}
	
	
	
}