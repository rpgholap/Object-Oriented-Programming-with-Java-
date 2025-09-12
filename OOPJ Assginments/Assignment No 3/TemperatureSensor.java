/*
5. Temperature Sensor
Scenario: Sensor should only accept temperatures in safe range.
Problem Statement:
Create a class TemperatureSensor with private temperature. Setter validates range 0–100°C.
Fields:
● private int temperature
Methods:
● setTemperature(int t) → only 0–100 valid
● getTemperature() → return temperature
Sample Input:
temperature = -5
Sample Output:
“Temperature out of range”
*/

class TempSensor{
	private int temperature;
	
	public void setTemperature(int t){
		if( t > 0 && t <= 100){
			this.temperature = t;
			System.out.println("Temperature: " + t + "°C.");
		}
		else{
			System.out.println("Tempreture out of range.");
		}
	}
	
	public int getTemperature(){
		return temperature;
	}
	
}

public class TemperatureSensor{
	public static void main(String args[]){
		
		TempSensor s = new TempSensor();
		
		// s.setTemperature(25);
		// System.out.println("Current temperature: " + s.getTemperature());
		/*
		output:
			Temperature: 25°C.
			Current temperature: 25
		*/
		
		s.setTemperature(-5);
		System.out.println("Current temperature: " + s.getTemperature());
		
		
	}
}