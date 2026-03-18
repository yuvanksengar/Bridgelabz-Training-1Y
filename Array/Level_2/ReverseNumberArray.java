import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.util.in);
        System.out.print("Enter a number: ");
        long number = input.nextLong();
        long tempNum = Math.abs(number);
        
        int count = 0;
        long n = tempNum;
        while (n != 0) {
            n /= 10;
            count++;
        }

        int[] digits = new int[count];
        n = tempNum;
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(n % 10);
            n /= 10;
        }

        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[i];
        }

        System.out.print("Reversed number: ");
        for (int val : reversed) {
            System.out.print(val);
        }
        System.out.println();
        input.close();
    }
}