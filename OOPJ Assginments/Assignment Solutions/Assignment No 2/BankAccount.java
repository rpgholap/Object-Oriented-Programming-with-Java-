class BankAccount1 {
    private String name;
    private double balance;
    private static double interestRate;

    // Static block to initialize interest rate
    static {
        interestRate = 4.0;
        System.out.println("Bank Interest Rate Initialized: " + interestRate + "%");
    }

    // Constructor
    public BankAccount1(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for balance
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter for interest rate
    public static double getInterestRate() {
        return interestRate;
    }

    // Method to display account details
    public void displayAccount() {
        System.out.println("Name=" + name + ", Balance=" + balance + ", Interest Rate=" + interestRate + "%");
    }
}

public class BankAccount {
    public static void main(String[] args) {
        BankAccount1 account1 = new BankAccount1("Rohit", 5000);
        BankAccount1 account2 = new BankAccount1("Priya", 15000);

        System.out.print("Account1: ");
        account1.displayAccount();

        System.out.print("Account2: ");
        account2.displayAccount();
    }
}
