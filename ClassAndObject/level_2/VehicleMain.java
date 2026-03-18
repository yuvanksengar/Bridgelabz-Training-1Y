class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 2000.0;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + " | Type: " + vehicleType + 
                           " | Reg Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Raj", "Car");
        v1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(2500.0);
        v1.displayVehicleDetails();
    }
}