import java.util.Scanner;

public class TeamBMISystem {
    public static void main(String[] args) {
        double[][] measurements = new double[10][2];
        inputData(measurements);
        
        String[][] results = processBMI(measurements);
        displayReport(results);
    }

    public static void inputData(double[][] data) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1));
            System.out.print("Enter weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm): ");
            data[i][1] = sc.nextDouble();
        }
    }

    public static String[] getStatus(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        String status;

        if (bmi <= 18.4) status = "Underweight";
        else if (bmi <= 24.9) status = "Normal";
        else if (bmi <= 39.9) status = "Overweight";
        else status = "Obese";

        return new String[]{String.format("%.2f", bmi), status};
    }

    public static String[][] processBMI(double[][] measurements) {
        String[][] report = new String[10][4];
        for (int i = 0; i < 10; i++) {
            String[] bmiData = getStatus(measurements[i][0], measurements[i][1]);
            report[i][0] = String.valueOf(measurements[i][1]); // Height
            report[i][1] = String.valueOf(measurements[i][0]); // Weight
            report[i][2] = bmiData[0]; // BMI
            report[i][3] = bmiData[1]; // Status
        }
        return report;
    }

    public static void displayReport(String[][] report) {
        System.out.println("\n---------------------------------------------------------");
        System.out.printf("%-10s %-12s %-12s %-10s %-10s%n", "Person", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < report.length; i++) {
            System.out.printf("%-10d %-12s %-12s %-10s %-10s%n", 
                (i + 1), report[i][0], report[i][1], report[i][2], report[i][3]);
        }
    }
}