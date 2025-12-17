
class ArithmeticExceptionDemo{
	
	
	public static void main(String[] args){
		
		System.out.println("1: start");
		/*try{
			int i = 1/0;//Throws exception
			System.out.println("i= "+i);
		}catch(ArithmeticException e){
			e.printStackTrace();
		}*/
		
		try{
			int i = 1/0;//Throws exception
			System.out.println("i= "+i);
		}finally{
			System.out.println("Are Exception aaya hai!");
		}
		
		
		System.out.println("100: Completed");
			
	}

}

