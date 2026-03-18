import java.util.Scanner;
import java.util.Random;

public class StudentGradingSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        int[][] marks = generateScores(numStudents);
        double[][] stats = calculateStats(marks);
        displayScorecard(marks, stats);
        
        sc.close();
    }

    public static int[][] generateScores(int num) {
        Random rand = new Random();
        int[][] scores = new int[num][3];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(90) + 10;
            }
        }
        return scores;
    }

    public static double[][] calculateStats(int[][] marks) {
        int num = marks.length;
        double[][] results = new double[num][3];
        for (int i = 0; i < num; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    public static void displayScorecard(int[][] marks, double[][] stats) {
        System.out.println("\nStudent\tPhysics\tChem\tMath\tTotal\tAvg\tPerc%\tGrade");
        System.out.println("-------------------------------------------------------------------------");
        for (int i = 0; i < marks.length; i++) {
            double p = stats[i][2];
            String grade;
            if (p >= 80) grade = "A";
            else if (p >= 70) grade = "B";
            else if (p >= 60) grade = "C";
            else if (p >= 50) grade = "D";
            else if (p >= 40) grade = "E";
            else grade = "R";

            System.out.println((i + 1) + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t" + marks[i][2] + "\t" + 
                               stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2] + "\t" + grade);
        }
    }
}