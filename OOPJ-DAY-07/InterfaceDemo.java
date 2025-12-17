
interface Shape{//interface
	double calculateArea();// abstract method
	
}

class Rectangle implements Shape{
	double length, width;
	
	Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double calculateArea(){
		
		return length * width;
	}
	
	
}

public class InterfaceDemo{
	
	public static void main(String args[]){
		
		//Rectangle r1 = new Rectangle(4.0,5.0);
		Shape r1 = new Rectangle(4.0,5.0);
		//Shape s1 = new Shape();//Error: object cannot be instantiated
		
		//Method 1
		//double res = r1.calculateArea();
		//System.out.println("Result = "+ res);
		
		
		//Method 2
		System.out.println("Result = "+ r1.calculateArea());
		
		
		
	}
}