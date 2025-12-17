class Casting{
	public static void main(String args[]){
		int a = 10;   // primitive
		Integer i1 = Integer.valueOf(a);    // Boxing 
		System.out.println("Wrapper: " + i1);
		
		Integer i2 = 20;   // wrapper class
		int num = i2.intValue();     //wrapper to int --> Unboxing

		String str = "123";    // String class
		int num1 = Integer.parseInt(str);   //String --> int
		String s = Integer.toString(456); // int --> String
		
		Integer n1 = 10;   // Autoboxing 
		Integer n2 = n1 + 5 ;  // n1 --> int 
		
		String str1 = "123.456";
		double num11 = Double.parseDouble(str1);  // String --> double
		float f1 = Float.parseFloat(str1);  //String --> float
		
	}
}