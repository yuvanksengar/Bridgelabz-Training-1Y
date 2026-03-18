import java.util.Scanner;

public class BmiTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("  Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("  Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        String[][] results = processBmiData(data);
        displayBmiTable(results);
    }

    public static String[][] processBmiData(double[][] input) {
        String[][] results = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = input[i][0];
            double heightCm = input[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);

            results[i][0] = String.valueOf(heightCm);
            results[i][1] = String.valueOf(weight);
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = getBmiStatus(bmi);
        }
        return results;
    }

    public static String getBmiStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        if (bmi <= 24.9) return "Normal";
        if (bmi <= 39.9) return "Overweight";
        return "Obese";
    }

    public static void displayBmiTable(String[][] table) {
        System.out.println("\n---------------------------------------------------------");
        System.out.printf("%-12s %-12s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("---------------------------------------------------------");
        for (String[] row : table) {
            System.out.printf("%-12s %-12s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }
}