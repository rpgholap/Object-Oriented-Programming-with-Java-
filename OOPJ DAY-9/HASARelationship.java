// HAS-A Relationship:

class Coach{
	
	String name;
	
	Coach(String name){
		this.name = name;
	}
	
	void guide(){
		System.out.println("Coach" + name + " is guiding the athlete."); 
	}
}

class Athlete{
	String athleteName;
	
	Coach coach;    // HAS-A Relationship : Athlete has a coach
	
	Athlete(String athleteName, Coach coach){
		this.athleteName = athleteName;
		this.coach = coach;
	}
	
	 void train(){
		 System.out.println(athleteName + " is a Runner");
		 coach.guide();
	 }
}

public class HASARelationship{
	public static void main(String args[]){
		Coach coach1 = new Coach(" Dhamale Sir");
		Athlete athlete1 = new Athlete("Rutuja", coach1);
		
		athlete1.train();
	}
}


/*
Output:
Rutuja is a Runner
Coach Dhamale Sir is guiding the athlete.
*/