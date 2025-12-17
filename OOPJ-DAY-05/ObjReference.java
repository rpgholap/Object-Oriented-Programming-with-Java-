class ObjReference{
	int x = 10;
	public static void main(String args[]){
		ObjReference e = new ObjReference();  
		//Creates a new object in heap and e stores its reference (memory address).
		
		ObjReference e1 = new ObjReference();
		ObjReference e2 = new ObjReference();
		
		System.out.println(e);
		// ObjReference@2f92e0f4
		
		System.out.println(e1);
		// ObjReference@28a418fc
		
		e = e1;
		// e points to the object referenced by e1.
		System.out.println(e);
		// ObjReference@28a418fc
		
		e1 = e2;
		// Reference of e2 is assigned to e1. 
		// Both point to the same object now.
		
		System.out.println(e2);
		// ObjReference@5305068a
		
		e2 = null;
		// Reference is removed, so e2 doesn’t point to any object. 
		// If no other reference exists, that object becomes eligible for Garbage Collection.
		System.out.println(e2);
		// null
	}
	
}

/*
Output: 
	ObjReference@2f92e0f4
	ObjReference@28a418fc
	ObjReference@28a418fc
	ObjReference@5305068a
	null
*/