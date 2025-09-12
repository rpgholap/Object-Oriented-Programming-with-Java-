
class Employee{
	private int id;
	private String name;
	
	Employee(){
		this.name = "Kiran";
	}
	
	//Getter Methods
	 public int getId(){
		 return id;
	 }
	 
	 public String getName(){
		 return name;
	 }
	 
	 //Setter methods
	  public void setId(int id){
		  this.id = id;
	  }
	 
	   public void setName(String name){
		  this.name = name;
	  }
	 
	 
}

public class EncapsulationDemo{
	
	public static void main(String args[]){
		
		Employee e1 = new Employee();
		e1.setName("Purva");
		e1.setId(111);
		
		System.out.println("Emp Id="+e1.getId()+" Emp Name="+e1.getName());
		
		Employee e11 = new Employee();
		//e11.setName("");
		e11.setId(222);
		
		System.out.println("Emp Id="+e11.getId()+" Emp Name="+e11.getName());
		
		
		
		
		
	}
}