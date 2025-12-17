/*
Problem 10: Electronic Voting System
Use Case: Track unique voters in an election system to prevent duplicate voting.
Requirements:
● Record voter IDs
● Ensure one vote per voter
● Count total unique voters
Sample Input:
Voter IDs: 201, 202, 203, 202
Expected Output:
Total voters: 3
*/

import java.util.HashSet;
import java.util.Scanner;

public class ElectronicVotingSystem{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		HashSet<Integer> voterIds = new HashSet<>();
		
		System.out.println("Enter the number of voter entries: " );
		int n = in.nextInt();
		
		System.out.println("Enter the voter ID's: ");
			for(int i = 0; i< n; i++){
			int id = in.nextInt();
			voterIds.add(id);
		}
		
		System.out.println("Total Voters: " + voterIds.size());
	}
}

