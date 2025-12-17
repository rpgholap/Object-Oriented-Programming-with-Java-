import java.util.*;

/*
Map is a collection that stores key-value pairs.
HashMap is a class that implements the Map interface, 
and it allows null values and null keys, 
though only one null key is allowed.
The key is unique, meaning you can't have two identical keys in a map. 
If you add a duplicate key, it will overwrite the previous value.
*/

public class MapDemo {
	public static void main(String args[]) {
		
		//Creates a Map : key is of type Integer & the value is of type String.
		// HashMap : doesn't maintain any particular order.
		Map<Integer,String> list = new HashMap<>();
		
		// to add key value pair: .put(key, value);
		list.put(1,"abc");
		list.put(6, "ert");
		list.put(7,"ertgr");
		list.put(11,"dfgfdgvfd");
		list.put(100,"rdfdf");
		list.put(345,"sddf");
		list.put(34,"sddf");
		list.put(15, "lmn");
		System.out.println(list);
		// o/p: {1=abc, 34=sddf, 100=rdfdf, 6=ert, 7=ertgr, 345=sddf, 11=dfgfdgvfd, 15=lmn}

		
		// Access a value by a key:
		System.out.println("Value of key 6: " + list.get(6));
		// o/p: Value of key 6: ert

		
		//Check if a key or value exists
		System.out.println("Does key 11 exists? " + list.containsKey(11));    
		//o/p: Does key 11 exists? true
		
		System.out.println("Does value of 'lmn' exists? " + list.containsValue("lmn"));    //true
		//o/p: Does value of 'lmn' exists? true
		
		// remove entry by the key
		list.remove(345);
		System.out.println("After removing key 345: " + list);
		// o/p: After removing key 345: {1=abc, 34=sddf, 100=rdfdf, 6=ert, 7=ertgr, 11=dfgfdgvfd, 15=lmn}
		
		// replace a value for a key:
		list.put(1, "ABCS");
		System.out.println("After replacing key 1: " + list);
		//o/p: After replacing key 1: {1=ABCS, 34=sddf, 100=rdfdf, 6=ert, 7=ertgr, 11=dfgfdgvfd, 15=lmn}
		
		// Get all keys or values
		System.out.println("All keys: " + list.keySet());
		// o/p: All keys: [1, 34, 100, 6, 7, 11, 15]
		
		System.out.println("All values: " + list.values());
		//o/p: All values: [ABCS, sddf, rdfdf, ert, ertgr, dfgfdgvfd, lmn]
	}
	

}



// Map<Integer, String> list2 = new TreeMap<>();

