class Demo{
	static int m=25;
	static{
		m =2000;
		System.out.println("Block value "+m);
	}
	
	static void display1(){
		System.out.println("Display1:DEmo() call kiya hai !");
	}
	
	static void display(){
		System.out.println("Display : Demo() call kiya hai !");
	}
	
}

class StatDemo{
	static int x=10;
	static int y=20;
	
	static{
		x =1000;
		System.out.println("Block value "+x);
	}
	
	static void display(){
		System.out.println("Display call kiya hai !");
	}
	
	public static void main(String args[]){
		
		int z =100;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);//z=100
		System.out.println(Demo.m);
		
		display();//StatDemo method() call
	
		Demo.display1();//Demo method() call
		Demo.display();//Demo method() call
	}
	
	
	
}