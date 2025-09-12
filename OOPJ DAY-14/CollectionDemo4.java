
import java.util.*;
class CollectionDemo4{
	public static void main(String args[]){
		ArrayList<String> a = new ArrayList<>();
		a.add("Prerna");
		a.add("Rutuja");
		a.add("Anuja");
		a.add("Sanika");
		a.add("Rutuja");   // allows duplicate
		
		System.out.println(a);
		
		//Addition at particular index
		a.add(1, "Harsh");
		System.out.println(a);
		
		//Accesing any element:
		System.out.println("Retrieve info: " + a.get(2));
		System.out.println(a);
		
		//Modify content
		a.set(2, "Pankaj");
		System.out.println(a);
		
		//Removal of elements with index
		a.remove(2);
		System.out.println(a);
		
		//Removal of element value
		a.remove("Rutuja");
		System.out.println(a);
		
		
		System.out.println(a.contains("Prerna"));
		System.out.println(a);
		
		System.out.println(a.size());
		
		System.out.println(a.isEmpty());
		
		Collection.sort(a);
		System.out.println(a);
		
		//to create sublist(subset) 
		List<String> subl1 = a.subList(0,2);   // prints 0 to (n-1) elements
		System.out.println(subl1);
		
		//Converting ArrayList into Arrays
		String[] arr = a.toArray(new String[0]); 
		System.out.println();

		a.clear();
		System.out.println(a);
		
		