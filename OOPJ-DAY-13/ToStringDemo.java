//toString(): providing a string representation of an object

class Employee{
	String name;
	int id;
	
	
	// public: accessible from anywhere 
	public Employee(String name, int id){   //  parametarized constructor 
		this.name = name;
		this.id = id;
	}
	
	//
	@Override                  // Overriding toString() method from object class
	public String toString(){
		
		return name+" "+id;
	}
	
}

public class ToStringDemo {
	public static void main(String args[]) {
		
		System.out.println("start");
		Employee e1 = new Employee("Anuja", 1);        // created instance of employee 
		System.out.println(e1);						   // calls toString() automatically   
	}

}

