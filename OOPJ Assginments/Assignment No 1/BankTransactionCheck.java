/*
	3. Bank Transaction Check
	Scenario: You check your bank account and see a transaction amount. Print whether the transaction is a
	deposit (positive) or a withdrawal (negative).
	Input:
	Enter transaction amount: -2500
	Output:
	Withdrawal transaction.
*/
import java.util.Scanner;

class BankTransactionCheck{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter transaction amount: ");
        int amount = in.nextInt();

        if (amount > 0) {
            System.out.println("Deposit transaction.");
        } else if (amount < 0) {
            System.out.println("Withdrawal transaction.");
        } else {
            System.out.println("No transaction.");
        }

        in.close();
    }
}