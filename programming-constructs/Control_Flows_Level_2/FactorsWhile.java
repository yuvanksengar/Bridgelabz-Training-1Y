import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number > 0) {
            int counter = 1;
            while (counter <= number) {
                if (number % counter == 0) {
                    System.out.print(counter + " ");
                }
                counter++;
            }
        }
        input.close();
    }
}