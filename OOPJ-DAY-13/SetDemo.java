import java.util.*;

public class SetDemo {
	public static void main(String args[]) {
		
		//Set<Integer> list = new HashSet<>();
		//Set<Integer> list = new LinkedHashSet<>();
		//Set<Integer> list = new TreeSet<>();
		//Collection<Integer> list = new TreeSet<>();
		Iterable list = new TreeSet();
		
		
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(1);
		list.add(100);
		list.add(345);
		System.out.println(list);
		list.add(100);//Duplicate value is always ignored
		list.add(345);
		System.out.println(list);
		
		
	}
	

}

