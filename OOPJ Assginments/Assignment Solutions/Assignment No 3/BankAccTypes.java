/*19. Bank Account Types
Scenario: Bank manages different types of accounts: Savings and Current. Both share basic account
details, but Savings accounts have interest and Current accounts have overdraft limit.
Problem Statement:
Create a superclass BankAccount with:
● Fields: accountNumber, accountHolder, balance
● Method: displayBalance()
Create subclasses:
● SavingsAccount → field: interestRate, method: calculateInterest()
● CurrentAccount → field: overdraftLimit, method: checkOverdraft()
Sample Input:
SavingsAccount → accountNumber=101, accountHolder=Ramesh, balance=5000, interestRate=5%
CurrentAccount → accountNumber=102, accountHolder=Anita, balance=2000, overdraftLimit=1000
Sample Output:
Ramesh → Balance=5000, Interest=250
Anita → Balance=2000, Overdraft Limit=1000
*/


// Superclass BankAccount
class BankAccount {
    protected int accountNumber;
    protected String accountHolder;
    protected double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void displayBalance() {
        System.out.println(accountHolder + " → Balance=" + (int)balance);
    }
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return balance * interestRate / 100;
    }

    @Override
    public void displayBalance() {
        super.displayBalance();
        System.out.println("Interest=" + (int)calculateInterest());
    }
}

// Subclass CurrentAccount
class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void checkOverdraft() {
        System.out.println("Overdraft Limit=" + (int)overdraftLimit);
    }

    @Override
    public void displayBalance() {
        super.displayBalance();
        checkOverdraft();
    }
}

// Main class
public class BankAccTypes {
    public static void main(String[] args) {
        // Creating SavingsAccount instance
        SavingsAccount savings = new SavingsAccount(101, "Ramesh", 5000, 5);
        
        // Creating CurrentAccount instance
        CurrentAccount current = new CurrentAccount(102, "Anita", 2000, 1000);
        
        // Displaying account details
        savings.displayBalance();
        current.displayBalance();
    }
}
