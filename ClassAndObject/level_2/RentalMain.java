class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double ratePerDay = 2000.0;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotal() {
        return rentalDays * ratePerDay;
    }

    void display() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car: " + carModel);
        System.out.println("Total Cost: " + calculateTotal());
    }
}

public class RentalMain {
    public static void main(String[] args) {
        CarRental rental = new CarRental("Vijay", "Sedan", 4);
        rental.display();
    }
}