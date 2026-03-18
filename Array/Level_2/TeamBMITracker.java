import java.util.Scanner;

public class TeamBMITracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of persons in the team: ");
        int numPersons = input.nextInt();

        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] statuses = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nEntering details for person " + (i + 1) + ":");
            System.out.print("Enter weight (kg): ");
            weights[i] = input.nextDouble();
            System.out.print("Enter height (cm): ");
            heights[i] = input.nextDouble();

            double heightInMeters = heights[i] / 100.0;
            bmis[i] = weights[i] / (heightInMeters * heightInMeters);

            if (bmis[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmis[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmis[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        System.out.println("\n--- Team BMI Report ---");
        System.out.printf("%-10s %-12s %-12s %-10s %-15s%n", "Person", "Height(cm)", "Weight(kg)", "BMI", "Status");
        
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10d %-12.1f %-12.1f %-10.1f %-15s%n", 
                (i + 1), heights[i], weights[i], bmis[i], statuses[i]);
        }

        input.close();
    }
}