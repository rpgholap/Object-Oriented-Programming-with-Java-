class A{
	
}

class B extends A{
	
}
class ClassCastExceptionDemo1{
	
	
	public static void main(String[] args){
		
		
		System.out.println("Start :1 ");
		A a = new A();
		//try-catch
		//try-catch-finally
		try{
			B b = (B)a;//Downcasting : Throws Exception
		}
		//to handle the exception
		catch(ClassCastException e){
			System.out.println(e.getMessage());
			
			System.out.println();
			e.printStackTrace();
			System.out.println();
			
			//exception handling code
			System.out.println("Invalid Downcasting");
			System.out.println("class A cannot be cast to class B");
		}finally{
			System.out.println("Finally use ho haya!!!!");
		}
		System.out.println("End :100 ");
		
		
	}

}

//try-catch
//try-catch-finally
//try-finally


//final- finally -finalize()