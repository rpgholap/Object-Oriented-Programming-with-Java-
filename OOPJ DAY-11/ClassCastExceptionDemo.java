class A{}

class B extends A{}
class ClassCastExceptionDemo{
	
	
	public static void main(String[] args){
		
		
		System.out.println("Start :1 ");
		A a = new A();
		try{
			B b = (B)a;//Downcasting : Throws Exception
		}catch(ClassCastException e){
			//exception handling code
			System.out.println("Invalid Downcasting");
			System.out.println("class A cannot be cast to class B");
		}
		System.out.println("End :100 ");
		
		
	}

}

	
