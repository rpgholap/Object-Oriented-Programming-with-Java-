import java.util.*;

public class ListDemo {
	public static void main(String args[]) {
		
		//List<String> list = new ArrayList<>();
		ArrayList<String> list = new ArrayList<>();
		//LinkedList<String> list = new LinkedList<>();
		
		list.add("Madhuri");
		list.add("Soumya");
		list.add("Vrushali");
		list.add("Sanket");
		list.add("Sanket");
		list.add("Sanket");
		System.out.println(list);
		
		list.remove("Vrushali");
		System.out.println(list);
		list.remove("Sanket");
		System.out.println(list);
		list.remove("Vrushali");
		System.out.println(list);
		
		System.out.println(list.get(1));
		System.out.println(list);
		
	}
	

}

