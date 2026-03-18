import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in cm: ");
        double heightCm = input.nextDouble();

        // Convert total cm to total inches
        double totalInches = heightCm / 2.54;

        // Calculate feet (integer division)
        int feet = (int) (totalInches / 12);

        // Calculate remaining inches using modulus
        double remainingInches = totalInches % 12;

        System.out.println("Your Height in cm is " + heightCm + 
                           " while in feet is " + feet + 
                           " and inches is " + remainingInches);

        input.close();
    }
}