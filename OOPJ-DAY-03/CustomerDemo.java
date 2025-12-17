class Customer{
	
	int x;
	int y;
	String name;
	
	Customer(){
		System.out.println("Default........");
	}//Default Constructor 
	
	Customer(int num){//Parameterized constructor
		x = num;
		System.out.println("Para : 1........");
	}
	
	Customer(int num1, int num2, String str1){//Parameterized constructor
		x = num1;
		y = num2;
		name=str1;
		System.out.println("Para : 2........");
	}
	
	Customer(int x, int y){//Parameterized constructor
		this.x = x;
		this.y = y;
		System.out.println("Para : 3........");
	}
	
	void setdata(){
		//SOP(x)
	}
	
	void getdata(){
	}
	

}

//Driver class
class CustomerDemo{


	public static void main(String args[]){
		
		Customer c1 = new Customer();
		Customer c3 = new Customer(100,200);
		Customer c2 = new Customer(10,20,"Anuj");
		
	
	}
	
}