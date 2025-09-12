/*
1. Bank Account Protection
Scenario: You are creating a simple banking system. A user should not be able to directly change their
balance.
Problem Statement:
Create a class BankAccount with a private variable balance. Provide deposit() and withdraw() methods to
change balance. Provide a getter to view balance. Validate that withdrawal cannot exceed balance.
Class/Fields:
● private double balance
Methods:
● deposit(double amount) → add to balance
● withdraw(double amount) → subtract from balance if sufficient
● getBalance() → returns current balance
Sample Input:
Deposit = 5000
Withdraw = 2000
Sample Output:
Updated Balance = 3000

*/

class BankAccount{
	
	// encapsulation 
	private double balance;
	
	
	void deposit(double amount){
		if(amount > 0){
			balance += amount;
			System.out.println("Deposited: " + amount);
		}
		else{
			System.out.println("Invalid Deposit amount.");
		}
		
	}
	
	void withdraw(double amount){
		if(amount > 0){
			if(amount <= balance){
				balance -= amount;
				System.out.println("Withdrawn: " + amount);
			}
			else{
				System.out.println("Insufficient Balance!");
			}
		}
		
	}
	
	// getter for balance
	double getBalance(){
		return balance;    // current balance
	}
}


public class BankAccountProtection{
	public static void main(String args[]){
		BankAccount account = new BankAccount();      //--> balance = 0;  
		
		account.deposit(5000);
		account.withdraw(2000);
		
		// error: compile time error
//		account.balance = 500;      //balance has private access in BankAccount
		
		System.out.println("Updated Balance: " + account.getBalance());
	}

}