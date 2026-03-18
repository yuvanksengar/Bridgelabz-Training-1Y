import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Convert feet to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3.0;

        // Convert yards to miles (1 mile = 1760 yards)
        double distanceInMiles = distanceInYards / 1760.0;

        System.out.println("The distance in feet is " + distanceInFeet + 
                           " while in yards is " + distanceInYards + 
                           " and miles is " + distanceInMiles);

        input.close();
    }
}