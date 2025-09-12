
class String1{
	
	public static void main(String... args){
		
		String s1 = "JAVA";
		String s2 = "JAVA";

		System.out.println(s1 == s2);      // true → both refer to same literal pool object
		System.out.println(s1.equals(s2)); // true

		String s3 = new String("JAVA");
		String s4 = "JAVA";

		System.out.println(s3 == s4);      // false → different objects in memory
		System.out.println(s3.equals(s4)); // true → content is the same

		
	}

}

/*
output:

true
true
false
true
*/

	
