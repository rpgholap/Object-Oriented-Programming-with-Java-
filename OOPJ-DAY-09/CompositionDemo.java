
class Engine{
	String type;
	
	Engine(String type){
		this.type = type;
	}
}

class Car{
	String color;
	String model;
	Engine engine;//HAS-A Relationship: Composition
	
	Car(String color, String model,String enginetype){
		this.color = color;
		this.model = model;
		this.engine = new Engine(enginetype);//creating object inside the constructor
	}
	
	void display(){
		System.out.println(color+" "+model+" "+engine.type);
	}
	
}

	
public class CompositionDemo{
	
	public static void main(String args[]){
		
		//Engine e = new Engine("M5");//No need to write as it is available in car constructor line
		
		Car c1 = new Car("Black","Toyota","M5");
		c1.display();
	}
}

	
