import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Principal: ");
        double p = sc.nextDouble();
        System.out.print("Rate: ");
        double r = sc.nextDouble();
        System.out.print("Time: ");
        double t = sc.nextDouble();

        double si = calculateSI(p, r, t);
        System.out.println("The Simple Interest is " + si + " for Principal " + p + ", Rate of Interest " + r + " and Time " + t);
    }

    public static double calculateSI(double p, double r, double t) {
        return (p * r * t) / 100;
    }
}