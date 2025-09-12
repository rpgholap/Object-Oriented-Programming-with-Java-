// Method 1:
import java.util.*;
class CollectionDemo1{
	public static void main(String args[]){
		Collection a = new ArrayList();
		a.add(111);
		a.add("Anuja");
		a.add(123.24);
		a.add(123.24);
		
		System.out.println(a);
		//o/p: [111, Anuja, 123.24, 123.24]   --> printed on forward directin
		
		//Traverse the collections: for each loop method
		for(Object obj: a){           // obj bcz of heterogenious data 
			System.out.println(obj);
		}
		//o/p:
		/*
			111
			Anuja
			123.24
			123.24
		*/
	}
}