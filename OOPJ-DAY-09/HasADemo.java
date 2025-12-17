//Employee HAS-A Address object as an instance variable in line 6

//represents Aggregation: Employee has an Address (Relationship)

class Employee{
	int id;
	String name;
	Address address;//HAS-A relationship with Address class
	
	Employee(int id, String name, Address address){
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void display(){
		
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
}

class Address{
	String city;
	String state;
	String country;
	
	
	Address(String city, String state, String country){
		this.city = city;
		this.state = state;
		this.country = country;
	}

}
public class HasADemo {
	
	public static void main(String args[]){
		Address address1 = new Address("Mumbai","MH","India");
		Address address2 = new Address("Pune","MH","India");
		
		Employee e1 = new Employee(101," Ajay",address1);
		Employee e2 = new Employee(102," Someshwar",address1);
		e1.display();
		
				
		
	}
}

	
