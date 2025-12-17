class Employee{
	private int empid;
	private String empname;
	
	
	//to set data 
	void setdata(int id, String name){
		empid= id;          // left to right assignment 
		empname = name;     
	}
	
	
	//to get the data
	void getdat(){
		System.out.println("empid= " + empid);
		System.out.println("empname= " + empname);
	}
	
	// same as display() method
	void show(){
		System.out.println(empid + " " + empname) ;
	}
}

// driver class
class EmployeeMyDemo{
	public static void main(String args[]){
		
		System.out.println("Employee Details: ");
		Employee e1 = new Employee();
		e1.setdata(101, "Anuja");
		System.out.println(e1.empid);
		System.out.println(e1.empname);
		e1.getdat();
	}
}