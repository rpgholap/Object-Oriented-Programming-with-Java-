/*
24. Payment Gateway
Scenario: An e-commerce platform supports multiple payment methods like CreditCard and PayPal. All
payments must implement a pay() method.
Problem Statement:
● Create an interface Payment → method pay(double amount)
● Classes CreditCardPayment and PayPalPayment implement Payment → provide their own pay()
implementation
● In main(), take payment amount and process payment using both methods
Sample Input:
CreditCardPayment → amount=2500
PayPalPayment → amount=1500
Sample Output:
Processing Credit Card Payment of 2500
Processing PayPal Payment of 1500
*/

import java.util.Scanner;

// Payment interface with method pay
interface Payment {
    void pay(double amount);
}

// CreditCardPayment implementing Payment
class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Processing Credit Card Payment of " + (int)amount);
    }
}

// PayPalPayment implementing Payment
class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal Payment of " + (int)amount);
    }
}

// Main class
public class PaymentGateway {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for Credit Card payment
        System.out.print("Enter amount for Credit Card Payment: ");
        double creditAmount = scanner.nextDouble();

        // Take input for PayPal payment
        System.out.print("Enter amount for PayPal Payment: ");
        double paypalAmount = scanner.nextDouble();

        // Create payment instances
        Payment creditCard = new CreditCardPayment();
        Payment payPal = new PayPalPayment();

        // Process payments
        creditCard.pay(creditAmount);
        payPal.pay(paypalAmount);

        scanner.close();
    }
}

