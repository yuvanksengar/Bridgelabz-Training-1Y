import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the countdown start value: ");
        int counter = input.nextInt();

        System.out.println("Rocket launch sequence started!");

        while (counter >= 1) {
            System.out.println(counter + "...");
            counter--; 
        }

        System.out.println("Liftoff! 🚀");

        input.close();
    }
}