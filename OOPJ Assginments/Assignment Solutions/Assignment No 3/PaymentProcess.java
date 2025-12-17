/*
18. Payment Process
Scenario: Company wants to process payments differently depending on mode of payment, but handle all
payments through a single reference.
Problem Statement:
Create abstract class Payment with abstract method pay(). Subclass CreditCardPayment and UPIPayment
implement pay().
Usage:
● Use Payment p reference → p = new CreditCardPayment(...) or p = new UPIPayment(...)
● Call p.pay() for runtime polymorphic behavior
Sample Input:
Credit Card → cardNumber=1234567890123456, amount=5000
UPI → upiId=rahul@upi, amount=2000
Sample Output:
Payment via Credit Card 1234567890123456 → Rs. 5000 Paid
Payment via UPI rahul@upi → Rs. 2000 Paid
*/

// Abstract class Payment
abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public abstract void pay();
}

// Subclass CreditCardPayment
class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(String cardNumber, double amount) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay() {
        System.out.println("Payment via Credit Card " + cardNumber + " → Rs. " + (int)amount + " Paid");
    }
}

// Subclass UPIPayment
class UPIPayment extends Payment {
    private String upiId;

    public UPIPayment(String upiId, double amount) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    public void pay() {
        System.out.println("Payment via UPI " + upiId + " → Rs. " + (int)amount + " Paid");
    }
}

// Main class
public class PaymentProcess {
    public static void main(String[] args) {
        // Using Payment reference for Credit Card payment
        Payment p = new CreditCardPayment("1234567890123456", 5000);
        p.pay();

        // Using Payment reference for UPI payment
        p = new UPIPayment("rahul@upi", 2000);
        p.pay();
    }
}
