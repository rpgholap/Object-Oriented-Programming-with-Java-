class A{
	int x;
	
	A(int x){
		this.x = x;
		System.out.println("Instance created" + x);
	}
	
}

class GCDemo{
	
	public static void main(String args[]){
		
		A a1 = new A(5);
		A a2 = new A(10);
		System.out.println("1. Nulling a object");
		a1 = null;
		a2 = null;
		
		System.gc();//Request for GC :
		System.out.println(a1.x);	
		System.out.println("Null references are collected by finalize()");
		
			
	}
	/*protected void finalize(){
		System.out.println("Null references are collected by finalize()");
	}*/
}

	
