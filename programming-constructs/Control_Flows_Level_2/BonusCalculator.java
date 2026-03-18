import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter years of service: ");
        int years = input.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Your bonus amount is: " + bonus);
        } else {
            System.out.println("Years of service must be more than 5 years to get a bonus.");
        }
        input.close();
    }
}