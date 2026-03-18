import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        // Formula: (n * (n - 1)) / 2
        int handshakes = (n * (n - 1)) / 2;

        System.out.println("For " + n + " students, the maximum number of possible handshakes is " + handshakes);

        input.close();
    }
}