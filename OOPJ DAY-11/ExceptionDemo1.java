
class ExceptionDemo1{
	
	
	public static void main(String[] args){
		
		System.out.println("1: start");
		String s1 = "12";
		String s2 = "0";
		int i = Integer.parseInt(s1);//12
		int j = Integer.parseInt(s2);//0
		
		try{
			int k = i/j;//throws exception
			System.out.println(k);
		}catch(NumberFormatException e){
			e.printStackTrace();
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
		
		
		
		System.out.println("100: Completed");
			
	}

}

