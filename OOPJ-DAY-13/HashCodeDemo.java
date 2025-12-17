class Employee{
	String name;
	int id;
	
	public Employee(String name, int id){  // constructor -- initialized when object is created
		this.name = name;
		this.id = id;
	}
	
	//overridden to give a human-readable output
	@Override 
	public String toString(){
		
		return name+" "+id;
	}
	
	//Overridden to return the ID.
	@Override
	public int hashCode(){
		
		return id; 
	}
	
}

// Every new object usually has a unique hash code.
// Objects are stored in hash-based collections like HashMap, HashSet, Hashtable 
//These collections use hashCode() to quickly locate, compare, and retrieve objects.

public class HashCodeDemo {
	public static void main(String args[]) {
		
		System.out.println("start");
		Employee e1 = new Employee("Vedika", 111);
		
		// If hashCode() isn’t overridden --> multiple Employee objects with the same id will be treated as different.
		
		System.out.println("ToString return: "+e1.toString()); //call to toString()
		
		System.out.println("Hashcode: "+e1.hashCode()); //call to toString()
	}
}

/*
Without overriding → prints memory reference.
With overriding → prints "Vedika 111"
*/

/*
Output:
start
ToString return: Vedika 111
Hashcode: 111
*/