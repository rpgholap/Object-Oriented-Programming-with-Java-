/*
Problem 18: Vehicle Registration – Static Counter
Scenario:
Create Vehicle class with regNo, ownerName, vehicleType.
● Static variable: vehicleCount
● Constructor → auto-generate regNo as "MH-2025-" + vehicleCount
● Getter methods for all fields
● Create 2 vehicles, display registration details
*/


/**
 * The Vehicle class represents a vehicle with an auto-generated registration number.
 * It uses a static counter to ensure each vehicle has a unique ID.
 */
public class Vehicle {

    // A static variable to count the number of vehicles created.
    // It is shared across all instances of the Vehicle class.
    private static int vehicleCount = 0;

    // Instance variables to store unique details for each vehicle.
    private String regNo;
    private String ownerName;
    private String vehicleType;

    /**
     * Constructor to create a new Vehicle object.
     * It auto-generates a unique registration number by incrementing the static counter.
     *
     * @param ownerName The name of the vehicle owner.
     * @param vehicleType The type of the vehicle (e.g., "Car", "Motorcycle").
     */
    public Vehicle(String ownerName, String vehicleType) {
        // Increment the static counter.
        vehicleCount++;
        // Auto-generate the registration number using the static counter.
        this.regNo = "MH-2025-" + vehicleCount;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Getter methods for the instance variables.
    public String getRegNo() {
        return regNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * Main method to demonstrate the functionality of the Vehicle class.
     */
    public static void main(String[] args) {
        // Create the first vehicle object.
        Vehicle car1 = new Vehicle("Rajesh Kumar", "Car");
        
        // Create the second vehicle object.
        Vehicle motorcycle1 = new Vehicle("Sangeeta Sharma", "Motorcycle");

        // Display the details of the first vehicle.
        System.out.println("Vehicle 1 Details:");
        System.out.println("Registration No: " + car1.getRegNo());
        System.out.println("Owner Name: " + car1.getOwnerName());
        System.out.println("Vehicle Type: " + car1.getVehicleType());
        System.out.println();

        // Display the details of the second vehicle.
        System.out.println("Vehicle 2 Details:");
        System.out.println("Registration No: " + motorcycle1.getRegNo());
        System.out.println("Owner Name: " + motorcycle1.getOwnerName());
        System.out.println("Vehicle Type: " + motorcycle1.getVehicleType());
    }
}
