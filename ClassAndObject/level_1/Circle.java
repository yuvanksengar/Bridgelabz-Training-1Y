class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    void displayResults() {
        System.out.println("Radius: " + radius);
        System.out.printf("Area: %.2f\n", calculateArea());
        System.out.printf("Circumference: %.2f\n", calculateCircumference());
        System.out.println("-------------------------");
    }
}

public class CircleMain {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        c.displayResults();
    }
}