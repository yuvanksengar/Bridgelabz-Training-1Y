import java.util.Scanner;

public class SumWithBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;

        System.out.println("Enter numbers to sum. Enter 0 or a negative number to stop.");

        while (true) {
            System.out.print("Enter a number: ");
            double number = input.nextDouble();

            if (number <= 0) {
                break;
            }

            total += number;
        }

        System.out.println("The final sum is: " + total);
        input.close();
    }
}