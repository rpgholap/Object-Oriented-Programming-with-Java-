
class A{
	String name;
	final static double Pi = 3.14;
	
	final A(String name){
		this.name = name;
	}
		
	void display(){
		System.out.println("Class A:A()"+name);
	}
	
}


class FinalDemo4{
	
	public static void main(String args[]){
		
		final A a1 = new A("Aniket");//instance created
		a1.display();
		System.out.println(A.Pi);
		final FinalDemo4 f1=new FinalDemo4();
		
		
		
		
	}
}

	
