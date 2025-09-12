class A{
	int x;
	
	A(int x){
		this.x = x;
		System.out.println("Instance created" + x);
	}
	
}

class GCDemo1{
	
	public static void main(String args[]){
		
		A a1 = new A(5);
		A a2 = new A(10);
		A a3 = new A(11);
		System.out.println("2. Reassigning a object");
		a3 = a2;
		a2 = a1;
		
		System.gc();//Request for GC :Depends on JVM
		System.out.println(a1.x);	
		System.out.println("Null references are collected by finalize()");
		
			
	}

}

	
