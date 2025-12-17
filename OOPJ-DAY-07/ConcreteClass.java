// Concrete class : 
// it is complete class and can be instantiated.
// any class which is not abstract is concrete class.

class ConcreteClass{
	private String title;  // instance variable
	
	ConcreteClass(String title){       // contructor 
		this.title = title;
	}
	
	void readbook(){
		System.out.println("Read Book Method: " + title);
	}
}

class CreateConcrete{
	public static void main(String args[]){
		ConcreteClass c1 = new ConcreteClass("ABC");
		c1.readbook();
	}
}


// output: Read Book Method: ABC