import java.util.Scanner;

public class StudentScorecardSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        int[][] scores = generateRandomScores(numStudents);
        double[][] stats = calculateStats(scores);
        String[][] grades = calculateGrades(stats);

        displayScorecard(scores, stats, grades);
        input.close();
    }

    public static int[][] generateRandomScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 90) + 10;
            }
        }
        return scores;
    }

    public static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100.0;

            stats[i][0] = Math.round(total * 100.0) / 100.0;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return stats;
    }

    public static String[][] calculateGrades(double[][] stats) {
        String[][] grades = new String[stats.length][2];
        for (int i = 0; i < stats.length; i++) {
            double p = stats[i][2];
            if (p >= 80) {
                grades[i][0] = "A";
                grades[i][1] = "(Level 4, above standards)";
            } else if (p >= 70) {
                grades[i][0] = "B";
                grades[i][1] = "(Level 3, at standards)";
            } else if (p >= 60) {
                grades[i][0] = "C";
                grades[i][1] = "(Level 2, approaching standards)";
            } else if (p >= 50) {
                grades[i][0] = "D";
                grades[i][1] = "(Level 1, well below standards)";
            } else if (p >= 40) {
                grades[i][0] = "E";
                grades[i][1] = "(Level 1-, too below standards)";
            } else {
                grades[i][0] = "R";
                grades[i][1] = "(Remedial standards)";
            }
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] stats, String[][] grades) {
        System.out.println("\n-----------------------------------------------------------------------------------------");
        System.out.printf("%-5s %-5s %-5s %-5s %-7s %-7s %-7s %-5s %-20s%n", 
                          "ID", "Phy", "Che", "Mat", "Total", "Avg", "Perc", "Grd", "Remarks");
        System.out.println("-----------------------------------------------------------------------------------------");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-5d %-5d %-5d %-5d %-7.1f %-7.1f %-7.1f %-5s %-20s%n", 
                              (i + 1), scores[i][0], scores[i][1], scores[i][2], 
                              stats[i][0], stats[i][1], stats[i][2], grades[i][0], grades[i][1]);
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}