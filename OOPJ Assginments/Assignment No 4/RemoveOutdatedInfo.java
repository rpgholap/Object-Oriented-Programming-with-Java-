/*
Problem 17: Remove Outdated Information
Scenario: An academic system maintains course information that includes year details. When information
becomes outdated, the year needs to be removed.
Task: Use StringBuffer to remove outdated information.
Sample Input:
Original text: CDAC Kharghar 2024
Exact substring to delete: 2024
Expected Output:
CDAC Kharghar
*/
import java.util.Scanner;

class RemoveOutdatedInfo {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Original text:");
        StringBuffer originalText = new StringBuffer(in.nextLine());

        System.out.println("Exact substring to delete:");
        String substringToDelete = in.nextLine();

        int index = originalText.indexOf(substringToDelete);
        if (index != -1) {
            originalText.delete(index, index + substringToDelete.length());
        }

        System.out.println("Expected Output:");
        System.out.println(originalText.toString());

        in.close();
    }
}
