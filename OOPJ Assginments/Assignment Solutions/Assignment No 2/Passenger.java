/*
Problem 6: Indian Railway Ticket Booking
Scenario:
You are building a mini ticket booking system. A passenger can book a ticket either by giving name and
age or name, age, and seat type. The system should also count the total tickets booked using a static
counter.
Tasks:
1. Create a Passenger class.
2. Implement two constructors (constructor overloading):
Constructor 1 → Passenger(String name, int age)
Constructor 2 → Passenger(String name, int age, String seatType)
3. Use a static counter to keep track of total passengers booked.
4. Print passenger details and total passengers.
Input Example:
Passenger1: "Ravi", 25
Passenger2: "Anita", 30, "AC Sleeper"
Passenger3: "Suresh", 40
Expected Output:
Passenger1: Name: Ravi, Age: 25, Seat: General
Passenger2: Name: Anita, Age: 30, Seat: AC Sleeper
Passenger3: Name: Suresh, Age: 40, Seat: General
Total Passengers Booked: 3
*/


public class Passenger {

    // Instance variables
    private String name;
    private int age;
    private String seatType;

    // Static variable to keep track of total passengers
    private static int totalPassengers = 0;


    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
        this.seatType = "General";
        totalPassengers++;
    }

    public Passenger(String name, int age, String seatType) {
        this.name = name;
        this.age = age;
        this.seatType = seatType;
        totalPassengers++;
    }

    public void printDetails() {
        System.out.println("Passenger Name: " + name + ", Age: " + age + ", Seat Type: " + seatType);
    }

    public static void printTotalPassengers() {
        System.out.println("Total Passengers Booked: " + totalPassengers);
    }

    public static void main(String[] args) {
        // Create two passengers using different constructors
        Passenger p1 = new Passenger("Ravi", 25);
        Passenger p2 = new Passenger("Anita", 30, "AC Sleeper");
        Passenger p3 = new Passenger("Suresh", 40);

        // Print details for each passenger
        p1.printDetails();
        p2.printDetails();
        p3.printDetails();

        // Print the total number of passengers
        Passenger.printTotalPassengers();
    }
}
