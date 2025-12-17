interface Athlete{
	void compete();
	void train();
}

class Runner implements Athlete {
	private String name;                 // encapsulation 
	private int age; 
	
	public Runner(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	// getter and setter
	
	public String getName(){
		return name;
	}
	
	public int age(){
		return age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	// Interface method:
	
	@Override
	public void compete(){
		System.out.println(name + " is running in the Marathon.");
	}
	
	@Override
	public void train(){
		System.out.println(name + " is doing ABC Workout, indoor and outdoor activities.");
	}
}

class AthleticsDemo{
		public static void main(String args[]){
			Athlete a1 = new Runner("Vrunda", 21);
			
			a1.compete();
			a1.train();
		}
}

/*
output:

Vrunda is running in the Marathon.
Vrunda is doing ABC Workout, indoor and outdoor activities.
*/



/*
Encapsulation: private name, age -- getter & setter
Abstraction : Athlete Interface 
Interface : two methods (what methods a class must implement.
*/