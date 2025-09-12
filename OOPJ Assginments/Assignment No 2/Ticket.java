/*
Problem 20: Ticket Booking System
Question:
Create a class Ticket with:
● passengerName (instance)
● ticketNo (instance, auto-generated using a static counter starting from 5001)
● Constructor to accept passengerName
● Method displayTicket() to show ticket details
Task:
Create 3 tickets and display their details.
Sample Input:
Passenger 1: Rahul
Passenger 2: Priya
Passenger 3: Amit
Sample Output:
Ticket No: 5001, Passenger: Rahul
Ticket No: 5002, Passenger: Priya
Ticket No: 5003, Passenger: Amit
*/


// Ticket class
class Ticket {
    // Instance variables
    private String passengerName;
    private int ticketNo;

    // Static counter for auto-generated ticket numbers
    private static int counter = 5001;

    // Constructor
    public Ticket(String passengerName) {
        this.passengerName = passengerName;
        this.ticketNo = counter++;  // Auto-generate ticket number
    }

    // Method to display ticket details
    public void displayTicket() {
        System.out.println("Ticket No: " + ticketNo + ", Passenger: " + passengerName);
    }

    // Getters (optional)
    public String getPassengerName() { return passengerName; }
    public int getTicketNo() { return ticketNo; }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create tickets
        Ticket ticket1 = new Ticket("Rahul");
        Ticket ticket2 = new Ticket("Priya");
        Ticket ticket3 = new Ticket("Amit");

        // Display ticket details
        ticket1.displayTicket();
        ticket2.displayTicket();
        ticket3.displayTicket();
    }
}
