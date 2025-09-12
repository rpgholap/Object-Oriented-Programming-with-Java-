class StackOverFlow{
	int x = 10;
	int y = 20;
	static int i = 50;
	
	void m1(){
		System.out.println("m1");
	}
	
	void m2(){
		System.out.println("m2");
	}
	
	void m3(){
		System.out.println("m3");
	}
	
	public static void main(String args[]){
		int asd = 5;
		StackOverFlow obj = new StackOverFlow();
		obj.m1();
		obj.m2();
		obj.m3();
	}
}