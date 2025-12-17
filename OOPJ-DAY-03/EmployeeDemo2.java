class Employee{
	int empid;
	String empname;
	
	/*static{
		
		empid = 100;
		System.out.println("empId="+empid);
	}*/
	
	void setdata(int id, String name){
		empid = id;
		empname = name;
	}
	
	void getdata(){
		System.out.println("empId="+empid);
		System.out.println("empName="+empname);
	}
	
	void show(){
		System.out.println(empid+" "+empname);
	}

	
}

//Driver class
class EmployeeDemo1{
	
	public static void main(String args[]){
				
		System.out.println("Employee details");
		Employee e1 = new Employee();
		//System.out.println(e1.empid);
		//System.out.println(e1.empname);
		
		System.out.println();
		e1.setdata(111,"Ajay");
		e1.getdata();
		System.out.println();
		
		Employee e2 = new Employee();
		e2.setdata(222,"Suchit"); //Resettig of data
		e2.getdata();
		
		System.out.println();
		e1.getdata();
		
		
	}
	
	
	
}