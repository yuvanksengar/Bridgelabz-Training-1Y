import java.util.Scanner;

public class Handshake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of students: ");
        int n = sc.nextInt();
        System.out.println("Maximum handshakes: " + getHandshakes(n));
    }

    public static int getHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}