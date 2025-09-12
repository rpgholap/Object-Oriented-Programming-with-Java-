/*
11. Bank Account Types
Scenario: Bank provides different account types.
Problem Statement:
Superclass Account → accountNo, balance. Subclass SavingAccount → interestRate. Subclass
CurrentAccount → overdraftLimit. Display account details.
Classes/Fields:
● Account → accountNo, balance
● SavingAccount → interestRate
● CurrentAccount → overdraftLimit
Sample Input:
Saving → accountNo=101, balance=5000, interestRate=5%
Current → accountNo=102, balance=10000, overdraftLimit=2000
Sample Output:
Saving → 101, Balance=5000, Interest=5%
Current → 102, Balance=10000, Overdraft=2000
*/

// Superclass Account
class Account {
    int accountNo;
    double balance;

    // Constructor
    Account(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }
}

// Subclass SavingAccount
class SavingAccount extends Account {
    double interestRate; // in percent

    SavingAccount(int accountNo, double balance, double interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    void displayDetails() {
        System.out.println("Saving → " + accountNo + ", Balance=" + balance + ", Interest=" + interestRate + "%");
    }
}

// Subclass CurrentAccount
class CurrentAccount extends Account {
    double overdraftLimit;

    CurrentAccount(int accountNo, double balance, double overdraftLimit) {
        super(accountNo, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void displayDetails() {
        System.out.println("Current → " + accountNo + ", Balance=" + balance + ", Overdraft=" + overdraftLimit);
    }
}

// Main class
public class BankAccountTypes {
    public static void main(String[] args) {
        // Create account objects
        SavingAccount sa = new SavingAccount(101, 5000, 5);
        CurrentAccount ca = new CurrentAccount(102, 10000, 2000);

        // Display account details
        sa.displayDetails();
        ca.displayDetails();
    }
}
