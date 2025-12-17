/*
Problem 16: Room Allocation Update
Scenario: A facility management system assigns rooms to different activities and needs to insert building
information into existing room numbers.
Task: Use StringBuffer to update room allocation information.
Sample Input:
Original text: 101
Text to insert: New Building
Insert index: 0
Expected Output:
New Building 101
*/

import java.util.Scanner;

class RoomAllocationUpdate {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Original text:");
        StringBuffer originalText = new StringBuffer(in.nextLine());

        System.out.println("Text to insert:");
        String textToInsert = in.nextLine();

        System.out.println("Insert index:");
        int index = in.nextInt();

        originalText.insert(index, textToInsert + " ");

        System.out.println("Expected Output:");
        System.out.println(originalText.toString());

        in.close();
    }
}


/*
output:
Original text:
101
Text to insert:
new building
Insert index:
0
Expected Output:
new building 101
*/