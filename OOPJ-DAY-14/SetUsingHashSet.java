import java.util.*;

class SetUsingHashSet{
	public static void main(String args[]){
		Set a = new HashSet();
		
		a.add(101);
		a.add("Shivneri");
		a.add(123.90);
		
		System.out.println(a);
		//[123.9, 101, Shivneri]
		
		a.remove(101);
		System.out.println(a);
		//[123.9, Shivneri]
		
		Set a1 = new HashSet();
		a1.add(102);
		a1.add("Lenyadri");
		a1.add(14);
		System.out.println(a1);
		//[Lenyadri, 102, 14]
		
		a.addAll(a1);
        System.out.println(a);
		// [123.9, Lenyadri, 102, Shivneri, 14]
		
		System.out.println(a.contains("Shivneri")); // true or false
		// true
		
        a.removeAll(a1);
        System.out.println(a);
		//[123.9, Shivneri]

        a.retainAll(a1);
        System.out.println(a);
		//[]
		
		a.clear();
		System.out.println(a); 
		// []
		
		//containsAll() – Checking if Another Collection's Elements Are Present
		Set<Integer> numbers = new HashSet<>(Arrays.asList(1,2,3,4,5));
		Set<Integer> subset = new HashSet<>(Arrays.asList(2,4));
		System.out.println(numbers.containsAll(subset));
		//true
		
		Iterator<Integer> it = numbers.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		/*
			1
			2
			3
			4
			5
		*/
	}
}




