class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayPhoneDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("-------------------------");
    }
}

public class MobileMain {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S23", 75000.0);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 15", 80000.0);
        
        phone1.displayPhoneDetails();
        phone2.displayPhoneDetails();
    }
}