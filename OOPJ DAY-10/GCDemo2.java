
class A{
	int x;
	A a;//reference created
	
	A(int x){
		this.x = x;
		System.out.println("Instance created " + x);
	}
	
}
class RunTime{
}

class GCDemo2 extends RunTime{
	
	public static void main(String args[]){
		
		A a1 = new A(5);
		A a2 = new A(10);
		A a3 = new A(11);
		System.out.println("3. Island of Isolation");
		a1.a = a3;
		a3.a = a2;
		a2.a = a1;
		
		a1=a2=a3=null;
		
		
		//System.gc();//Request for GC :Depends on JVM
		Runtime.getRuntime().gc();
			
		System.out.println("Null references are collected by finalize()");
		
			
	}

}

	
