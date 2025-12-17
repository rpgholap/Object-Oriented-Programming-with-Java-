/*
Problem 14: Bank Name Display
Scenario:
Add a static variable bankName = "CDAC Bank" and static method displayBankName() to
BankAccount.
● Call displayBankName() from main.
● Create one account to verify instance creation.
*/


// Unique class name
class CDACBankAccount {
    // Static variable - shared by all accounts
    static String bankName = "CDAC Bank";
    
    // Instance variables
    private String accountHolder;
    private double balance;

    // Constructor to initialize an account
    public CDACBankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Static method to display bank name
    public static void displayBankName() {
        System.out.println("Bank Name: " + bankName);
    }

    // Instance method to display account info
    public void showAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Call static method without creating an object
        CDACBankAccount.displayBankName();

        // Create one account to verify instance creation
        BankTransaction account1 = new BankTransaction("Rahul", 5000.00);
		BankTransaction account1 = new BankTransaction("Priya", 15000.00);

        // Display account info
        account1.showAccountInfo();
    }
}
