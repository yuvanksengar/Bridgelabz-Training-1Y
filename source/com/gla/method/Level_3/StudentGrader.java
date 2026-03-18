import java.util.Scanner;

public class StudentGrader {
    public static void main(String[] args) {
        int numStudents = 10;
        int[][] scores = generatePCM(numStudents);
        double[][] stats = calculateStats(scores);
        String[][] grades = calculateGrades(stats);
        displayScorecard(scores, stats, grades);
    }

    public static int[][] generatePCM(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 10 + (int) (Math.random() * 90);
            }
        }
        return scores;
    }

    public static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percentage = (total / 300.0) * 100;
            stats[i][0] = total;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return stats;
    }

    public static String[][] calculateGrades(double[][] stats) {
        String[][] g = new String[stats.length][2];
        for (int i = 0; i < stats.length; i++) {
            double p = stats[i][2];
            if (p >= 80) { g[i][0] = "A"; g[i][1] = "Level 4"; }
            else if (p >= 70) { g[i][0] = "B"; g[i][1] = "Level 3"; }
            else if (p >= 60) { g[i][0] = "C"; g[i][1] = "Level 2"; }
            else if (p >= 50) { g[i][0] = "D"; g[i][1] = "Level 1"; }
            else if (p >= 40) { g[i][0] = "E"; g[i][1] = "Level 1-"; }
            else { g[i][0] = "R"; g[i][1] = "Remedial"; }
        }
        return g;
    }

    public static void displayScorecard(int[][] pcm, double[][] st, String[][] gr) {
        System.out.printf("%-10s %-5s %-5s %-5s %-8s %-10s %-8s %-10s%n", 
                          "Student", "P", "C", "M", "Total", "Average", "Grade", "Remarks");
        for (int i = 0; i < pcm.length; i++) {
            System.out.printf("S%-9d %-5d %-5d %-5d %-8.0f %-10.2f %-8s %-10s%n", 
                              (i+1), pcm[i][0], pcm[i][1], pcm[i][2], st[i][0], st[i][1], gr[i][0], gr[i][1]);
        }
    }
}