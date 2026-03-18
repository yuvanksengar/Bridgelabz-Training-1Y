import java.util.Scanner;

public class RocketLaunchForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the countdown start value: ");
        int startValue = input.nextInt();

        System.out.println("Rocket launch sequence started!");

        // for (initialization; condition; increment/decrement)
        for (int counter = startValue; counter >= 1; counter--) {
            System.out.println(counter + "...");
        }

        System.out.println("Liftoff! 🚀");

        input.close();
    }
}