import java.util.*;

public class QueueDemo {
	public static void main(String args[]) {
		
		Queue<Integer> list = new PriorityQueue<>();
		
		
		
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(1);
		list.add(100);
		list.add(345);
		System.out.println(list);
		
		System.out.println(list.poll());
		System.out.println(list);
		
		
		
	}
	

}

