import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        double[][] marks = new double[numStudents][3];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];
        String[] remarks = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Physics: ");
            double p = input.nextDouble();
            System.out.print("Chemistry: ");
            double c = input.nextDouble();
            System.out.print("Maths: ");
            double m = input.nextDouble();

            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--;
                continue;
            }

            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;

            percentages[i] = (p + c + m) / 3.0;

            if (percentages[i] >= 80) {
                grades[i] = 'A';
                remarks[i] = "(Level 4, above agency-normalized standards)";
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
                remarks[i] = "(Level 3, at agency-normalized standards)";
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
                remarks[i] = "(Level 2, below, but approaching agency-normalized standards)";
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
                remarks[i] = "(Level 1, well below agency-normalized standards)";
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
                remarks[i] = "(Level 1-, too below agency-normalized standards)";
            } else {
                grades[i] = 'R';
                remarks[i] = "(Remedial standards)";
            }
        }

        System.out.println("\n--- Student Performance Report ---");
        System.out.printf("%-10s %-10s %-10s %-10s %-12s %-8s %-15s%n", 
            "Student", "Physics", "Chem", "Maths", "Percentage", "Grade", "Remarks");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d %-10.1f %-10.1f %-10.1f %-12.2f %-8c %-15s%n", 
                (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i], remarks[i]);
        }

        input.close();
    }
}