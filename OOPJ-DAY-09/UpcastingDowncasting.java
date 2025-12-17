class Athlete{
	
	void train(){
		System.out.println("Athlete: train()");
	}
}

class Runner extends Athlete{
	void run(){
		System.out.println("Running..!!");
	}
}

class Thrower extends Athlete{
	void throwEvent(){
		System.out.println("Thrower is practicing throws!");
	}
}

public class UpcastingDowncasting{
	public static void main(String args[]){
		
		Athlete a1 = new Runner();   // upcasting  --> superclass reference -> subclass object 
		Athlete a2 = new Thrower();  // upcasting 
		
		a1.train();
		a2.train();
		
		// a1.run(); error  --> type of a1 is Athlete and there is not run() method in Athlete.
		
		// Runner r1 = (Runner) a1;  // Downcasting --> subclass reference <-- superclass reference
		// r1.run();
		
		// Runner r2 = (Runner) a2;   // ClassCastException --> class Thrower cannot be cast to class Runner (Thrower and Runner are in unnamed module)
		
		if (a1 instanceOf Runner){   // checking is it instance of Runner class 
			Runner r1 = (Runner) a1;
			r1.run();
		}
		else {
			System.out.println("a1 is not runner, cannot cast");
		}
		
	}
	
}

/*
output:
Athlete: train()
Athlete: train()
Running..!!
a2 is not runner, cannot cast
*/