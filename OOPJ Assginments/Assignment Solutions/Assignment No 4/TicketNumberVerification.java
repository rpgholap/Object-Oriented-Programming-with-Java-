/*
Problem 18: Ticket Number Verification
Scenario: A ticketing system generates verification codes by reversing ticket numbers for security
purposes.
Task: Use StringBuffer to create verification codes.
Sample Input:
12345
Expected Output:
54321
*/

import java.util.Scanner;

class TicketNumberVerification {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Ticket Number:");
        StringBuffer ticket = new StringBuffer(in.nextLine());

        ticket.reverse();

        System.out.println("Expected Output:");
        System.out.println(ticket.toString());

        in.close();
    }
}
