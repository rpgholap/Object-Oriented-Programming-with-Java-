/*
Problem 25: Payment Processing
Scenario: An e-commerce system receives payment amounts as strings from web forms and needs to
convert them to integers for financial calculations.
Task: Parse string input to integer and perform calculations.
Sample Input:
Amount as string: 1000
Additional amount to add: 500
Expected Output:
1000 + 500 = 1500
*/

import java.util.Scanner;

class PaymentProcessing1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Amount as string:");
        String amountStr = in.nextLine();

        System.out.println("Additional amount to add:");
        int additionalAmount = in.nextInt();

        int amount = Integer.parseInt(amountStr);

        System.out.println("Expected Output:");
        System.out.println(amount + " + " + additionalAmount + " = " + (amount + additionalAmount));

        in.close();
    }
}
