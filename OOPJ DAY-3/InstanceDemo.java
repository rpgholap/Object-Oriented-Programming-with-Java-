class Demo{
	int m=25;
	
	void display1(){
		System.out.println("Display1 : Demo()call kiya hai !");
	}
	void display(){
		System.out.println("Display : Demo() call kiya hai !");
	}
	
	
	
}

class InstanceDemo{
	int x=10;
	int y=20;
	
	void display(){
		System.out.println("Display call kiya hai !");
	}
	
	public static void main(String args[]){
		
		int z =100;
		
		//System.out.println(x);//Error: reference cahiye
		//System.out.println(y);//Error: reference cahiye
		System.out.println(z);//z=100
		
		InstanceDemo i1 = new InstanceDemo();//instance created
		
		System.out.println(i1.x);
		System.out.println(i1.y);
		
		i1.display();//method call: non static
		
		
		Demo d1 = new Demo();//Instance created
		System.out.println(d1.m);
		
		d1.display1();
		d1.display();
		
	}
	
	
	
}