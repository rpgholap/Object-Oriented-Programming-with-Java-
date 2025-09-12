class cmdArgs{
	public static void main(String args[]){
		String s1 = args[0];
		String s2 = args[1];
		System.out.println(s1);
		System.out.println(s2);
		
		int i = Integer.parseInt(s1);
		int j = Integer.parseInt(s2);
		int k = i + j;
		System.out.println("Sum: " + k);
		
	}
}