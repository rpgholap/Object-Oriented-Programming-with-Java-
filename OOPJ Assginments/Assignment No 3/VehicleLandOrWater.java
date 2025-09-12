/*
22. Vehicle Types
Scenario: Vehicles can be Land or Water types. Some vehicles can operate on both.
Problem Statement:
● Interface LandVehicle → method driveOnLand()
● Interface WaterVehicle → method driveOnWater()
● Class AmphibiousVehicle implements both interfaces → provides both methods
Sample Input:
AmphibiousVehicle → name=HydroCar
Sample Output:
HydroCar → Driving on Land
HydroCar → Driving on Wate
*/

// LandVehicle interface
interface LandVehicle {
    void driveOnLand();
}

// WaterVehicle interface
interface WaterVehicle {
    void driveOnWater();
}

// AmphibiousVehicle implementing both interfaces
class AmphibiousVehicle implements LandVehicle, WaterVehicle {
    private String name;

    public AmphibiousVehicle(String name) {
        this.name = name;
    }

    @Override
    public void driveOnLand() {
        System.out.println(name + " → Driving on Land");
    }

    @Override
    public void driveOnWater() {
        System.out.println(name + " → Driving on Water");
    }
}

// Main class
public class VehicleLandOrWater {
    public static void main(String[] args) {
        AmphibiousVehicle vehicle = new AmphibiousVehicle("HydroCar");

        vehicle.driveOnLand();
        vehicle.driveOnWater();
    }
}
