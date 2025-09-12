class A{
	int x;
	A(int x){
		this.x = x;
		System.out.println("Instance created.");
	}
	
}

class GC{
	public static void main(String args[]){
		A a1 = new A(5);     // a1 --> x = 5 --> resource
		A a2 = new A(10);     // a2 --> x = 10 --> resource
		System.out.println("1.Nulling a object");
		 
		a1 = null;          //x = 5 --> resource
		a2 = null;          //x = 10 --> resource
		
		System.gc();   // request for GC
	}
	
	protected void finalize(){
		System.out.println("Null references are collected by finalize()");
	}
}

/*
output:
	Instance created.
	Instance created.
	1.Nulling a object
*/