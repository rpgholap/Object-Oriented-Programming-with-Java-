
class StringInternDemo{
	
	public static void main(String[] args){
		
		String s1 = new String("CoreJava");
		String s2 = s1.intern();
		System.out.println(s1 == s2);//Heap (s1) vs Stringpool (s2)
		System.out.println(s1.equals(s2));
		
	}

}

	
