// Method 2: 

import java.util.*;
class CollectionDemo2{
	public static void main(String args[]){
		Collection a = new ArrayList();
		a.add(111);
		a.add("Anuja");
		a.add(123.24);
		a.add(123.24);
		
		System.out.println(a);
		// o/p: [111, Anuja, 123.24, 123.24]   --> printed on forward directin
		
		//Traverse the collections: for each loop method
		Iterator it = a.iterator();            // created reference of interface  (no constructor in interface)
		while(it.hasNext()){                   // hasNext(): to check next element exists or not
			System.out.println(it.next());     // .next(): to retrive the element
		}
		// o/p:
		/*
			111
			Anuja
			123.24
			123.24
		*/
	}
}