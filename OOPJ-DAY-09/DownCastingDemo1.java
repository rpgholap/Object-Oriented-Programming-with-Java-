class A{
	void testdata(){
		System.out.println("A:: testdata()");
	}
}

class B extends A{
	void testdata1(){
		System.out.println("B:: testdata1()");
	}

}

public class DownCastingDemo1 {
	
	public static void main(String args[]){
		
		A x = new A();// Upcasting
		B y = (B) x;//Downcasting
		
		if(x instanceof B){//checking before downcasting
			B m = (B) x;
			m.testdata1();
		}else{
			System.out.println("Downcasting not possible...");
		}
		
		
	}
}

	
