/*
Problem 7: Indian Movie Ticket Booking
Scenario:
A cinema hall offers Normal and Premium tickets. A customer can book just name or name with
ticket type. Keep track of total tickets sold using a static counter.
Tasks:
1. Create a Customer class.
2. Implement two constructors:
Constructor 1 → Customer(String name)
Constructor 2 → Customer(String name, String ticketType)
3. Static counter to track tickets sold.
4. Print customer details and total tickets sold.
Input Example:
Customer1: "Rahul"
Customer2: "Pooja", "Premium"
Customer3: "Amit"
Expected Output:
Customer1: Name: Rahul, Ticket: Normal
Customer2: Name: Pooja, Ticket: Premium
Customer3: Name: Amit, Ticket: Normal
Total Tickets Sold: 3
*/

public class Customer {

    // Instance variables
    private String name;
    private String ticketType;

    // Static variable to count the total tickets sold
    private static int totalTicketsSold = 0;

    public Customer(String name) {
        this.name = name;
        this.ticketType = "Normal";
        totalTicketsSold++;
    }

    public Customer(String name, String ticketType) {
        this.name = name;
        this.ticketType = ticketType;
        totalTicketsSold++;
    }

    public void printDetails() {
        System.out.println("Customer: " + name + ", Ticket Type: " + ticketType);
    }

    public static void printTotalTickets() {
        System.out.println("Total Tickets Sold: " + totalTicketsSold);
    }

    public static void main(String[] args) {
        // Create customers using different constructors
        Customer c1 = new Customer("Rahul");
        Customer c2 = new Customer("Pooja", "Premium");
        Customer c3 = new Customer("Amit");

        // Print details for each customer
        c1.printDetails();
        c2.printDetails();
        c3.printDetails();

        // Print the total number of tickets sold
        Customer.printTotalTickets();
    }
}
