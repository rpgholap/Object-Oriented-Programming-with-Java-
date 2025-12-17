import java.util.*;

class TreeSetExample{
	public static void main(String args[]){
		// Create a a of integers
        TreeSet<Integer> a = new TreeSet<>();

        // add() - adds elements in sorted order, ignores duplicates
        a.add(50);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(10);
        a.add(30); // duplicate ignored
        System.out.println("a after add(): " + a);
		//a after add(): [10, 20, 30, 40, 50]

        // addAll() - adds all elements from a collection, ignores duplicates
        Set<Integer> anotherSet = new HashSet<>(Arrays.asList(25, 35, 50));
        a.addAll(anotherSet);
        System.out.println("a after addAll(): " + a);
		a after addAll(): [10, 20, 25, 30, 35, 40, 50]

        // ceiling() - least element >= 25
        System.out.println("ceiling(25): " + a.ceiling(25));

        // clear() - removes all elements
        TreeSet<Integer> tempSet = new TreeSet<>(a);
        
        // clone() - shallow copy of the set
        @SuppressWarnings("unchecked")
        TreeSet<Integer> clonedSet = (TreeSet<Integer>) a.clone();
        System.out.println("Cloned set: " + clonedSet);

        // comparator() - returns comparator or null if natural order
        System.out.println("Comparator used: " + a.comparator());

        // contains() - checks if element exists
        System.out.println("Contains 30? " + a.contains(30));

        // descendingIterator() - iterator in reverse order
        System.out.print("Descending Iterator: ");
        Iterator<Integer> descIt = a.descendingIterator();
        while (descIt.hasNext()) {
            System.out.print(descIt.next() + " ");
        }
        System.out.println();

        // descendingSet() - view in reverse order
        System.out.println("Descending set: " + a.descendingSet());

        // first() - first (smallest) element
        System.out.println("First element: " + a.first());

        // floor() - greatest element <= 25
        System.out.println("floor(25): " + a.floor(25));

        // headSet() - elements less than 35
        System.out.println("headSet(35): " + a.headSet(35));

        // higher() - least element > 25
        System.out.println("higher(25): " + a.higher(25));

        // isEmpty() - checks if set is empty
        System.out.println("Is set empty? " + a.isEmpty());

        // iterator() - iterator from smallest to largest
        System.out.print("Iterator: ");
        Iterator<Integer> it = a.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // last() - largest element
        System.out.println("Last element: " + a.last());

        // lower() - greatest element < 25
        System.out.println("lower(25): " + a.lower(25));

        // pollFirst() - retrieves and removes first element
        System.out.println("pollFirst(): " + a.pollFirst());
        System.out.println("a after pollFirst(): " + a);

        // pollLast() - retrieves and removes last element
        System.out.println("pollLast(): " + a.pollLast());
        System.out.println("a after pollLast(): " + a);

        // remove() - removes specific element
        a.remove(30);
        System.out.println("a after removing 30: " + a);

        // size() - returns number of elements
        System.out.println("Size of a: " + a.size());

        // spliterator() - creates a Spliterator
        Spliterator<Integer> split = a.spliterator();
        System.out.print("Spliterator output: ");
        split.forEachRemaining(e -> System.out.print(e + " "));
        System.out.println();

        // subSet() - elements from 20 (inclusive) to 40 (exclusive)
        System.out.println("subSet(20, 40): " + a.subSet(20, 40));

        // tailSet() - elements >= 20
        System.out.println("tailSet(20): " + a.tailSet(20));

        // clear the original set
        a.clear();
        System.out.println("a after clear(): " + a);
        System.out.println("Is set empty after clear()? " + a.isEmpty());
    }
}


/*
a after add(): [10, 20, 30, 40, 50]
a after addAll(): [10, 20, 25, 30, 35, 40, 50]
ceiling(25): 25
Cloned set: [10, 20, 25, 30, 35, 40, 50]
Comparator used: null
Contains 30? true
Descending Iterator: 50 40 35 30 25 20 10
Descending set: [50, 40, 35, 30, 25, 20, 10]
First element: 10
floor(25): 25
headSet(35): [10, 20, 25, 30]
higher(25): 30
Is set empty? false
Iterator: 10 20 25 30 35 40 50
Last element: 50
lower(25): 20
pollFirst(): 10
a after pollFirst(): [20, 25, 30, 35, 40, 50]
pollLast(): 50
a after pollLast(): [20, 25, 30, 35, 40]
a after removing 30: [20, 25, 35, 40]
Size of a: 4
Spliterator output: 20 25 35 40
subSet(20, 40): [20, 25, 35]
tailSet(20): [20, 25, 35, 40]
a after clear(): []
Is set empty after clear()? true
*/

