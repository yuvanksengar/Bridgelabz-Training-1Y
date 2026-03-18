import java.util.Scanner;

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        int[][] pcmScores = generateRandomScores(numStudents);
        double[][] stats = calculateStats(pcmScores);
        String[][] grades = calculateGrades(stats);

        displayScorecard(pcmScores, stats, grades);
    }

    public static int[][] generateRandomScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                // Generates random 2-digit scores (10-99)
                scores[i][j] = 10 + (int) (Math.random() * 90);
            }
        }
        return scores;
    }

    public static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            // Percentage based on max 100 per subject
            double percentage = (total / 300.0) * 100;

            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return stats;
    }

    public static String[][] calculateGrades(double[][] stats) {
        String[][] gradeData = new String[stats.length][2];
        for (int i = 0; i < stats.length; i++) {
            double p = stats[i][2];
            if (p >= 80) {
                gradeData[i][0] = "A";
                gradeData[i][1] = "(Level 4, above agency-normalized standards)";
            } else if (p >= 70) {
                gradeData[i][0] = "B";
                gradeData[i][1] = "(Level 3, at agency-normalized standards)";
            } else if (p >= 60) {
                gradeData[i][0] = "C";
                gradeData[i][1] = "(Level 2, below, but approaching standards)";
            } else if (p >= 50) {
                gradeData[i][0] = "D";
                gradeData[i][1] = "(Level 1, well below standards)";
            } else if (p >= 40) {
                gradeData[i][0] = "E";
                gradeData[i][1] = "(Level 1-, too below standards)";
            } else {
                gradeData[i][0] = "R";
                gradeData[i][1] = "(Remedial standards)";
            }
        }
        return gradeData;
    }

    public static void displayScorecard(int[][] pcm, double[][] stats, String[][] grades) {
        System.out.println("\n------------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-5s %-5s %-5s %-8s %-10s %-12s %-8s %-30s%n", 
                          "Student", "Phy", "Che", "Mat", "Total", "Average", "Percentage", "Grade", "Remarks");
        System.out.println("------------------------------------------------------------------------------------------------------");
        
        for (int i = 0; i < pcm.length; i++) {
            System.out.printf("Student %-2d %-5d %-5d %-5d %-8.0f %-10.2f %-12.2f %-8s %-30s%n", 
                              (i + 1), pcm[i][0], pcm[i][1], pcm[i][2], 
                              stats[i][0], stats[i][1], stats[i][2], 
                              grades[i][0], grades[i][1]);
        }
    }
}