
class ErrorDemo{
	static void m1(){
		System.out.println("m1(): executed");
		m1();
	}
	
	public static void main(String[] args){
		
		
		System.out.println("Please understand what is an error !");//CTE
		m1();
		
	}

}

	
