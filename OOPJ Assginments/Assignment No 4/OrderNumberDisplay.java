/*
Problem 13: Order Number Display
Scenario: An e-commerce system generates invoice numbers and needs to display them in reverse order
for verification purposes.
Task: Use StringBuilder to reverse order numbers.
Sample Input:
INV2025
Expected Output:
5202VNI
*/

import java.util.Scanner;

class OrderNumberDisplay {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Order Number:");
        StringBuilder orderNumber = new StringBuilder(in.nextLine());

        orderNumber.reverse();

        System.out.println("Reversed Order Number:");
        System.out.println(orderNumber.toString());
        
        in.close();
    }
}

/*
output:
Enter Order Number:
INV2025
Reversed Order Number:
5202VNI
*/