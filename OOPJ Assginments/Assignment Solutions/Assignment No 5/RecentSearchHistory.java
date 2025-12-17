/*
Problem 5: Recent Search History
Use Case: A search application maintains the last 5 searches, removing the oldest when the limit is
exceeded.
Requirements:
● Store recent searches (maximum 5)
● Remove oldest search when limit exceeded
● Maintain insertion order
Sample Input:
Searches: "Java", "Python", "C++", "DSA", "OOP", "Spring"
Expected Output:
Recent searches: Python, C++, DSA, OOP, Spring
*/

import java.util.ArrayList;
import java.util.List;

public class RecentSearchHistory {
    public static void main(String[] args) {
        List<String> recentSearches = new ArrayList<>();
        int maxSize = 5; // maximum searches to store

        // Add searches
        String[] searches = {"Java", "Python", "C++", "DSA", "OOP", "Spring"};

        for (String search : searches) {
            // If list exceeds max size, remove the oldest search
            if (recentSearches.size() == maxSize) {
                recentSearches.remove(0); // remove first (oldest) element
            }
            recentSearches.add(search); // add new search
        }

        // Display recent searches
        System.out.print("Recent searches: ");
        for (int i = 0; i < recentSearches.size(); i++) {
            System.out.print(recentSearches.get(i));
            if (i < recentSearches.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
