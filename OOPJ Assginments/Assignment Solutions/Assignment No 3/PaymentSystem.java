/*
12. Payment System
Scenario: A company accepts different payment modes.
Problem Statement:
Create an abstract class Payment with abstract method pay(). Create subclasses CreditCardPayment and
UPIPayment that implement pay().
Classes/Fields:
● Payment → pay() (abstract)
● CreditCardPayment → cardNumber, amount
● UPIPayment → upiId, amount
Sample Input:
Credit Card → cardNumber=1234567890123456, amount=5000
UPI → upiId=rahul@upi, amount=2000
Sample Output:
Payment via Credit Card 1234567890123456 → Rs. 5000 Paid
Payment via UPI rahul@upi → Rs. 2000 Paid
*/

// Abstract class Payment
abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    // Abstract method
    abstract void pay();
}

// Subclass CreditCardPayment
class CreditCardPayment extends Payment {
    String cardNumber;

    CreditCardPayment(String cardNumber, double amount) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void pay() {
        System.out.println("Payment via Credit Card " + cardNumber + " → Rs. " + amount + " Paid");
    }
}

// Subclass UPIPayment
class UPIPayment extends Payment {
    String upiId;

    UPIPayment(String upiId, double amount) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    void pay() {
        System.out.println("Payment via UPI " + upiId + " → Rs. " + amount + " Paid");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        // Create payment objects
        Payment creditPayment = new CreditCardPayment("1234567890123456", 5000);
        Payment upiPayment = new UPIPayment("rahul@upi", 2000);

        // Make payments
        creditPayment.pay();
        upiPayment.pay();
    }
}
