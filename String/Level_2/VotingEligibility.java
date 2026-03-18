import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] report = checkEligibility(ages);
        displayTable(report);
    }

    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) ages[i] = (int)(Math.random() * 50) + 1;
        return ages;
    }

    public static String[][] checkEligibility(int[] ages) {
        String[][] data = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            data[i][0] = String.valueOf(ages[i]);
            data[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return data;
    }

    public static void displayTable(String[][] data) {
        System.out.printf("%-10s %-15s%n", "Age", "Status");
        for (String[] row : data) System.out.printf("%-10s %-15s%n", row[0], row[1]);
    }
}