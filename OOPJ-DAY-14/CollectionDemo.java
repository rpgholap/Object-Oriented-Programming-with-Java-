import java.util.*;
class CollectionDemo{
	public static void main(String args[]){
		
		//Collection : interface and ArrayList : class (which implements this interface)
		Collection a = new ArrayList();
		a.add(111);
		a.add("Anuja");
		a.add(123.24);
		
		System.out.println(a);
		// heterogeneous data types  
        // [111, Anuja, 123.24]
		
		a.remove(111);
		System.out.println(a);
		// [Anuja, 123.24]
		
		
		Collection a1 = new ArrayList();
		a1.add(112);
		a1.add("Rutuja");
		a1.add(10.24);
		
		System.out.println(a1);
		// [112, Rutuja, 10.24]
		
		a1.add(112);
		System.out.println(a1);
		//[112, Rutuja, 10.24, 112]  --> duplicates allowed.
		
		System.out.println(a1);
		a.addAll(a1);                   // we can combine 
		System.out.println(a);
		// [Anuja, 123.24, 112, Rutuja, 10.24, 112]  --> dynamic in nature 
		
		// no change in a1
		System.out.println(a1);
		//[112, Rutuja, 10.24, 112] 
		
		System.out.println("============================");
		
		a.removeAll(a1);
		System.out.println(a);
		// [Anuja, 123.24]           ---> removed elements of a1 from a

		System.out.println(a1);
		// [112, Rutuja, 10.24, 112]    
		
		System.out.println("============================");
		
		//Retaining only the elements that are present in both collections
		a.retainAll(a1);          // returns common elements from a and a1
		System.out.println(a);
		//[]
		
		
		
	}
}



