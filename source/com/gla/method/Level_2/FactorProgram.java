import java.util.Scanner;

public class FactorProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int[] factors = findFactors(n);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");

        System.out.println("\nSum: " + calculateSum(factors));
        System.out.println("Product: " + calculateProduct(factors));
        System.out.println("Sum of Squares: " + calculateSumOfSquares(factors));
    }

    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        int[] arr = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) arr[index++] = i;
        }
        return arr;
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int val : arr) sum += val;
        return sum;
    }

    public static long calculateProduct(int[] arr) {
        long prod = 1;
        for (int val : arr) prod *= val;
        return prod;
    }

    public static double calculateSumOfSquares(int[] arr) {
        double sumSq = 0;
        for (int val : arr) sumSq += Math.pow(val, 2);
        return sumSq;
    }
}