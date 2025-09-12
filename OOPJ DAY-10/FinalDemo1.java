class A{
	final int x;//constant:Compile time constant
	
	//A final variable can be initialized in a constructor, but only once
	A(int x){
		this.x = x;
	}
	
	void display(){
		//x=200;//Error: cannot reassign the value
		System.out.println(x);
	}
}
	
public class FinalDemo1{
	
	
	
	public static void main(String args[]){
		
		A a1 =new A(120);//instance
		a1.display();
		A a11 =new A(150);//instance
		a11.display();
		
		
	}
}

	
