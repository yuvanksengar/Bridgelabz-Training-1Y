import java.util.Scanner;

public class NaturalSumChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input.");
            return;
        }

        int recursive = sumRecursive(n);
        int formula = sumFormula(n);

        System.out.println("Recursive Sum: " + recursive);
        System.out.println("Formula Sum: " + formula);
        System.out.println("Correct: " + (recursive == formula));
    }

    public static int sumRecursive(int n) {
        if (n <= 1) return n;
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }
}