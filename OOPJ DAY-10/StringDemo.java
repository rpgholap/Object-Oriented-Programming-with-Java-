
class StringDemo{
	
	public static void main(String... args){
		String s1 = "ABC";//String Literal
		String s2 = "ABCD";
		String s3 = "ABC";
		String s4 = "ABCD";
		String s5 = "ABCDE";
		
		System.out.println(s1 == s2);//binary path: Object references
		System.out.println(s1 == s3);//binary path: Object references
		
		String s6 = new String("ABC");
		String s7 = new String("ABCD");
		s5 = new String("ABC");
		s6=s7;
		System.out.println(s1.equals(s3));//Value of reference
		System.out.println(s6.equals(s7));//Value of reference
		System.out.println(s6 == s7);
		
		String s8 = "Hello";
		String s9 = "Hello";
		String s10 = "Helloo";
	}

}

	
