class Customer{
	
	String name;
	int age;
	double cost;
	Customer()
	{
		cost = 100;
	}
	
	Customer(String name, int age, double cost){
		this.name = name;
		this.age = age;
		this.cost = cost;
	}
	Customer(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	
	void display(){
		System.out.println("Name="+name+"Age="+age+"Cost="+cost);
	}
	

}

//Driver class
class CustomerDemo1{


	public static void main(String args[]){
		
		Customer c = new Customer();
		c.display();
		Customer c1 = new Customer("Shruti",18,500.00);
		c1.display();
		Customer c2 = new Customer("Komal",19,400.00);
		c2.display();
		Customer c3;
		c3 = new Customer("Samiksha",20);
		c3.display();
	
	}
	
}