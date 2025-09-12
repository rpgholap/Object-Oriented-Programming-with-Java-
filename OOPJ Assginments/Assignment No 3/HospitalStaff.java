/*
21. Hospital Staff
Scenario: Hospital has Staff members. Both Doctors and Nurses are Staff.
Problem Statement:
● Staff → name, staffId, displayDetails()
● Doctor → specialization, displayDetails() override
● Nurse → shift, displayDetails() override
Sample Input:
Doctor → name=Dr. Reddy, staffId=101, specialization=Cardiology
Nurse → name=Nisha, staffId=102, shift=Night
Sample Output:
Dr. Reddy → Staff ID=101, Specialization=Cardiology
Nisha → Staff ID=102, Shift=Night
*/

// Base class Staff
class Staff {
    protected String name;
    protected int staffId;

    public Staff(String name, int staffId) {
        this.name = name;
        this.staffId = staffId;
    }

    public void displayDetails() {
        System.out.println(name + " → Staff ID=" + staffId);
    }
}

// Doctor class extending Staff
class Doctor extends Staff {
    private String specialization;

    public Doctor(String name, int staffId, String specialization) {
        super(name, staffId);
        this.specialization = specialization;
    }

    @Override
    public void displayDetails() {
        System.out.println(name + " → Staff ID=" + staffId + ", Specialization=" + specialization);
    }
}

// Nurse class extending Staff
class Nurse extends Staff {
    private String shift;

    public Nurse(String name, int staffId, String shift) {
        super(name, staffId);
        this.shift = shift;
    }

    @Override
    public void displayDetails() {
        System.out.println(name + " → Staff ID=" + staffId + ", Shift=" + shift);
    }
}

// Main class
public class HospitalStaff {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Reddy", 101, "Cardiology");
        Nurse nurse = new Nurse("Nisha", 102, "Night");

        doctor.displayDetails();
        nurse.displayDetails();
    }
}
