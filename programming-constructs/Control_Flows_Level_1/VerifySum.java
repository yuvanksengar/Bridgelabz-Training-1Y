import java.util.Scanner;

public class VerifySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number (n): ");
        int n = input.nextInt();

        if (n >= 1) {
           
            int formulaSum = n * (n + 1) / 2;

     
            int loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
            }

      
            System.out.println("Sum using Formula: " + formulaSum);
            System.out.println("Sum using While Loop: " + loopSum);

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