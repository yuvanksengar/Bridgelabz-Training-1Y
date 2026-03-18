import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Amar's age and height: ");
        int age1 = input.nextInt(); double h1 = input.nextDouble();
        System.out.print("Enter Akbar's age and height: ");
        int age2 = input.nextInt(); double h2 = input.nextDouble();
        System.out.print("Enter Anthony's age and height: ");
        int age3 = input.nextInt(); double h3 = input.nextDouble();

        if (age1 < age2 && age1 < age3) {
            System.out.println("The youngest friend is Amar.");
        } else if (age2 < age3) {
            System.out.println("The youngest friend is Akbar.");
        } else {
            System.out.println("The youngest friend is Anthony.");
        }

        if (h1 > h2 && h1 > h3) {
            System.out.println("The tallest friend is Amar.");
        } else if (h2 > h3) {
            System.out.println("The tallest friend is Akbar.");
        } else {
            System.out.println("The tallest friend is Anthony.");
        }
        input.close();
    }
}