/*
Problem 8: Bank Account Initialization
Scenario:
A bank wants to initialize the interest rate for all accounts once when the system starts. Each account
has account holder name, balance, and interest rate. Students should practice static blocks for
initialization and setters/getters to modify and access account details.
Tasks:
1. Create a BankAccount class.
2. Use a static block to initialize interest rate to 4%.
3. Create instance variables: name (String) and balance (double).
4. Create setters and getters for name and balance.
5. Print account details including interest rate.
Input Example:
Account1: Name="Rohit", Balance=5000
Account2: Name="Priya", Balance=15000
Expected Output:
Bank Interest Rate Initialized: 4.0%
Account1: Name=Rohit, Balance=5000.0, Interest Rate=4.0%
Account2: Name=Priya, Balance=15000.0, Interest Rate=4.0%
*/



/**
 * Represents a bank account and demonstrates a static variable and a static method
 * for information common to all accounts.
 */
public class BankAccount {

    // Instance variables
    private String accountHolder;
    private double balance;

    // Static variable for the bank name, shared by all accounts.
    public static String bankName = "CDAC Bank";

    /**
     * Constructor for the BankAccount class.
     * @param accountHolder The name of the account holder.
     * @param balance The initial balance.
     */
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    /**
     * A static method to display the bank's name.
     * This method can be called without creating a BankAccount object.
     */
    public static void displayBankName() {
        System.out.println("Welcome to " + bankName);
    }

    /**
     * Prints the details of the account.
     */
    public void printDetails() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: $" + balance);
    }

    public static void main(String[] args) {
        // Call the static method directly from the class.
        BankAccount.displayBankName();
        
        // Create an account and print its details.
        BankAccount myAccount = new BankAccount("Ajay Sharma", 75000.00);
        myAccount.printDetails();
    }
}
