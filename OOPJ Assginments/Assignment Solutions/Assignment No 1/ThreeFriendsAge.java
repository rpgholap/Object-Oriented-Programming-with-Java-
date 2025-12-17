/*
12. Oldest and Youngest Among Three Friends
Scenario: You and two friends want to know who is oldest and youngest. Take ages as input and print the
oldest and youngest.
Input:
Enter age of Friend 1: 22
Enter age of Friend 2: 25
Enter age of Friend 3: 20
Output:
Oldest: Friend 2
Youngest: Friend 3
*/

import java.util.Scanner;

class ThreeFriendsAge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter age of Friend 1: ");
        int frd1 = in.nextInt();

        System.out.print("Enter age of Friend 2: ");
        int frd2 = in.nextInt();

        System.out.print("Enter age of Friend 3: ");
        int frd3 = in.nextInt();

        // Finding oldest
        if (frd1 > frd2 && frd1 > frd3) {
            System.out.println("Oldest: Friend 1");
        } else if (frd2 > frd1 && frd2 > frd3) {
            System.out.println("Oldest: Friend 2");
        } else {
            System.out.println("Oldest: Friend 3");
        }

        // Finding youngest
        if (frd1 < frd2 && frd1 < frd3) {
            System.out.println("Youngest: Friend 1");
        } else if (frd2 < frd1 && frd2 < frd3) {
            System.out.println("Youngest: Friend 2");
        } else {
            System.out.println("Youngest: Friend 3");
        }

        in.close();
    }
}
