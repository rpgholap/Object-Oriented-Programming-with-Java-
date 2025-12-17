/*
Problem 13: Bank Deposit & Withdrawal
Scenario:
Extend previous problem. Add methods:
● deposit(double amount) → adds to balance
● withdraw(double amount) → subtracts from balance
● Create two accounts, perform deposit/withdraw, display updated balance
*/


/**
 * Represents a bank account with deposit and withdrawal functionality.
 * This class demonstrates methods that modify an object's state.
 */
public class BankTransaction {

    // Instance variables
    private String accountHolder;
    private double balance;

    public BankTransaction(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }


    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of " + amount + " successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }

    public static void main(String[] args) {
        // Create two BankTransaction objects with initial balances.
        BankTransaction account1 = new BankTransaction("Rahul", 5000.00);
        BankTransaction account2 = new BankTransaction("Priya", 15000.00);

        // Display initial details.
        System.out.println("Initial Account Details:");
        account1.displayDetails();
        account2.displayDetails();
        System.out.println();

        // Perform deposit and withdrawal.
        account1.deposit(2000.00);
        account2.withdraw(3000.00);
        System.out.println();

        // Display updated details.
        System.out.println("Updated Account Details:");
        account1.displayDetails();
        account2.displayDetails();
    }
}
