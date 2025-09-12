class Customer{
	
	String name;
	int age;
	double cost;
	
	//constructor 1
	Customer()
	{
		this("unknown",0,200.0);
	}
	
	//constructor 2
	Customer(String name, int age){
		this();
		this.name = name;//this.name : refere to instance variable
		this.age = age;//age : parameter
		
	}
	
	//constructor 3
	Customer(String name, int age, double cost){
		this.name = name;//this.name : refere to instance variable
		this.age = age;//age : parameter
		this.cost = cost;
	}
	
	
	void display(){
		System.out.println("Name="+name+" Age="+age+" Cost="+cost);
	}
	

}

//Driver class
class CustomerDemo2{


	public static void main(String args[]){
		
		Customer c1 = new Customer();//call default const.
		Customer c2 = new Customer("Java", 22);
		Customer c3 = new Customer("Test", 23,2000.00);
		
		c1.display();
		c2.display();
		c3.display();
		
		
	
	}
	
}