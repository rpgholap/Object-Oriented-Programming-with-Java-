class Demo{

}

//Driver class
class DemoApp{
	static void show(int a, int b)//Exact => int, int
	{
		System.out.println("Interger data");
	}
	
	static void show(int... b)//Variable arguments
	{
		System.out.println("VAriable arguments");
	}

	public static void main(String args[]){
		
		show(4,5);
		show("23",45.34f);
		//show(2,3,4,3);
	}
	
}