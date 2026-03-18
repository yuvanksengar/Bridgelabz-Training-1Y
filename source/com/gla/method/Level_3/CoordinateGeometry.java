import java.util.Scanner;

public class CoordinateGeometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1, y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.print("Enter x2, y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double dist = findDistance(x1, y1, x2, y2);
        double[] lineParams = findLineEquation(x1, y1, x2, y2);

        System.out.println("Euclidean Distance: " + dist);
        if (lineParams != null) {
            System.out.println("Line Equation: y = " + lineParams[0] + " * x + " + lineParams[1]);
        } else {
            System.out.println("Line is vertical; slope is undefined.");
        }
    }

    public static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        if (x2 - x1 == 0) return null; // Avoid division by zero
        
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        
        return new double[]{m, b};
    }
}