// Method 3:

import java.util.*;
class CollectionDemo3{
	public static void main(String args[]){
		List a = new ArrayList();
		a.add(111);
		a.add("Anuja");
		a.add(123.24);
		a.add(123.24);
		
		System.out.println(a);
		// o/p: [111, Anuja, 123.24, 123.24]   --> printed on forward directin
		
		// Object obj : access by index
		Objct obj  = a.get();
		System.out.println(obj);
		// o/p : Anuja
		
		//hw: 
		//Traverse the collections:
		// forloop
			// for(Object obj : a){
				// System.out.println(a);
			// }
			
		//Traverse the collections: for each loop method
		ListIterator lit = a.listIterator();            // created reference of interface  (no constructor in interface)
		
		//Forward Direction traversing
//		while(lit.hasNext()){                   
//			System.out.println(lit.next());    
//		}
//		/*
//			111
//			Anuja
//			123.24
//			123.24
//		*/


		while(lit.hasNext()){
			Object obj1 = lit.next();
			System.out.println(obj1);
			lit.set("100");
		}
		System.out.println();
		
		// Backward Direction traversing
		while(lit.hasPrevious()){                 
			System.out.println(lit.previous());     
		}
		// o/p:
		/*
			123.24
			123.24
			Anuja
			111
		*/
	}
}