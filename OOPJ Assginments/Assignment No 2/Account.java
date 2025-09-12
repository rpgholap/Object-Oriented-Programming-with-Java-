/*
Problem 12: Bank Account Basic Info
Scenario:
Create BankAccount class with accountHolder and balance.
● Use parameterized constructor to initialize account.
● Create getter and setter for balance.
● In main, create one account and display details
*/
/**
 * Represents a basic bank account with an account holder and a balance.
 * Demonstrates a parameterized constructor and getters/setters.
 */
public class Account {

    // Instance variables
    private String accountHolder;
    private double balance;

    /**
     * Parameterized constructor to initialize a new Account object.
     * @param accountHolder The name of the account holder.
     * @param balance The initial balance of the account.
     */
    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    /**
     * Getter method to retrieve the account balance.
     * @return The current balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Setter method to update the account balance.
     * @param newBalance The new balance to set.
     */
    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    /**
     * Displays the account holder's name and current balance.
     */
    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }

    public static void main(String[] args) {
        // Create a Account object.
        Account myAccount = new Account("Rohit", 10000.00);

        // Display initial account details.
        myAccount.displayDetails();
    }
}
