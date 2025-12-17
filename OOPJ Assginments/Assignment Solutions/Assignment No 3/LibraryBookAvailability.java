/*
4. Library Book Availability
Scenario: A library wants to keep track of available copies without letting external code change it
directly.
Problem Statement:
Create a class Book with private copiesAvailable. Provide getter/setter to update or read copies.
Fields:
● private int copiesAvailable
Methods:
● addCopies(int n) → add copies
● removeCopies(int n) → subtract if enough copies
● getCopiesAvailable() → return current copies
Sample Input:
add 3 copies, remove 1 copy
Sample Output:
Copies available = 2
*/

import java.util.Scanner;

class Book{
	
	private int copiesAvailable;
	
	public Book(int initialCopies){
		if(initialCopies >= 0){
			this.copiesAvailable = initialCopies;
		}
		else{
			System.out.println("Invalid initial copies!");
			this.copiesAvailable = 0;
		}
	}
	
	
	// add copies:
	public void addCopies(int n){
		if(n > 0){
			copiesAvailable += n;
			System.out.println(n + " copies added.");
		}
		else{
			System.out.println("Cannot add!");
		}
	}
	
	// remove copies:
	public void removeCopies(int n){
		if(n > 0){
			if(n <= copiesAvailable){
				copiesAvailable -= n;
				System.out.println(n + " copies removed.");
			}
			else{
				System.out.println("Not enough copies");
			}
		}
	}
	
	
	
	public int getCopiesAvailable(){
		return copiesAvailable;
	}
	
	
}

public class LibraryBookAvailability{
	public static void main(String args[]){
		Book book = new Book(0);
		
		book.addCopies(5);
		book.removeCopies(2);
		
		System.out.println("Copies available: " + book.getCopiesAvailable());
	}
}

/*
output: 
5 copies added.
2 copies removed.
Copies available: 3
*/