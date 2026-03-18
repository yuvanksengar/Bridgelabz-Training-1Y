import java.util.Scanner;

public class SmallestCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();
        System.out.print("Enter third number: ");
        double number3 = input.nextDouble();

        boolean isSmallest = (number1 < number2) && (number1 < number3);

        System.out.println("Is the first number the smallest? " + isSmallest);

        input.close();
    }
}