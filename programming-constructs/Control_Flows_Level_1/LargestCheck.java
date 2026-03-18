import java.util.Scanner;

public class LargestCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double n1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double n2 = input.nextDouble();
        System.out.print("Enter third number: ");
        double n3 = input.nextDouble();

        boolean firstLargest = (n1 > n2) && (n1 > n3);
        boolean secondLargest = (n2 > n1) && (n2 > n3);
        boolean thirdLargest = (n3 > n1) && (n3 > n2);

        System.out.println("Is the first number the largest? " + firstLargest);
        System.out.println("Is the second number the largest? " + secondLargest);
        System.out.println("Is the third number the largest? " + thirdLargest);

        input.close();
    }
}