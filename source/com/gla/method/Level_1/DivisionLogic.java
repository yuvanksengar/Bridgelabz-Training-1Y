import java.util.Scanner;

public class DivisionLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] res = findRemainderAndQuotient(sc.nextInt(), sc.nextInt());
        System.out.println("Remainder: " + res[0] + ", Quotient: " + res[1]);
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number % divisor, number / divisor};
    }
}