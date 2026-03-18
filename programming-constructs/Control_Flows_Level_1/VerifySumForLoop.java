import java.util.Scanner;

public class VerifySumForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number (n): ");
        int n = input.nextInt();

        if (n >= 1) {
            // 1. Computation using the Formula
            int formulaSum = n * (n + 1) / 2;

            // 2. Computation using a For Loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            // 3. Comparison and Output
            System.out.println("Sum using Formula: " + formulaSum);
            System.out.println("Sum using For Loop: " + loopSum);

            if (formulaSum == loopSum) {
                System.out.println("Success: Both computations match!");
            } else {
                System.out.println("Error: Results do not match.");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }

        input.close();
    }
}