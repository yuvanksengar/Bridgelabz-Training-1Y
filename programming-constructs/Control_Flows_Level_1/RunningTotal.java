import java.util.Scanner;

public class RunningTotal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double total = 0.0;
        double number;

        System.out.println("Enter numbers to add them to the total. Enter 0 to finish.");
        
        System.out.print("Enter a number: ");
        number = input.nextDouble();

        while (number != 0) {
            total = total + number;
            
            System.out.print("Enter another number (or 0 to stop): ");
            number = input.nextDouble();
        }

        System.out.println("The total sum of the entered numbers is: " + total);
        
        input.close();
    }
}