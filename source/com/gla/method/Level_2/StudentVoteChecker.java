import java.util.Scanner;

public class StudentVoteChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();
        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            System.out.println("Eligible: " + checker.canStudentVote(ages[i]));
        }
    }

    public boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }
}