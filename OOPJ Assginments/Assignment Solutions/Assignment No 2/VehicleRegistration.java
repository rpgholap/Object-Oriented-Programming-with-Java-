/*
Problem 19: Vehicle Registration – Static Block
Scenario:
Add a static block to Vehicle class:
● Print "Welcome to CDAC Vehicle Registration Portal" when class loads
● Verify that the message prints only once when multiple vehicles are created
*/

public class VehicleRegistration {

    // A static block that runs once when the class is loaded by the JVM.
    static {
        System.out.println("Welcome to CDAC Vehicle Registration Portal");
    }

    // A static variable to count the number of vehicles created.
    // It is shared across all instances of the VehicleRegistration class.
    private static int vehicleCount = 0;

    // Instance variables to store unique details for each vehicle.
    private String regNo;
    private String ownerName;
    private String vehicleType;

    public VehicleRegistration(String ownerName, String vehicleType) {
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

    public static void main(String[] args) {
        // Create the first vehicle object.
        VehicleRegistration car1 = new VehicleRegistration("Rajesh Kumar", "Car");
        
        // Create the second vehicle object.
        VehicleRegistration motorcycle1 = new VehicleRegistration("Sangeeta Sharma", "Motorcycle");

        // Display the details of the first vehicle.
        System.out.println("\nVehicle 1 Details:");
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
