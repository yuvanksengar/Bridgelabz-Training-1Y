import java.util.Scanner;

public class TeamBMI2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int number = input.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));
            
            double w, h;
            while (true) {
                System.out.print("Enter weight (kg): ");
                w = input.nextDouble();
                System.out.print("Enter height (cm): ");
                h = input.nextDouble();
                
                if (w > 0 && h > 0) {
                    break;
                }
                System.out.println("Invalid input. Please enter positive values.");
            }

            personData[i][0] = w;
            personData[i][1] = h;

            double heightInMeters = h / 100.0;
            double bmi = w / (heightInMeters * heightInMeters);
            personData[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-12s %-12s %-10s %-15s%n", "Person", "Weight(kg)", "Height(cm)", "BMI", "Status");
        
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10d %-12.1f %-12.1f %-10.1f %-15s%n", 
                (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        input.close();
    }
}