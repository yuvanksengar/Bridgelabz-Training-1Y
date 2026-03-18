import java.util.Scanner;

public class IllegalArgDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        try {
            generate(text);
        } catch (Exception e) {
            System.out.println("Main caught: " + e);
        }
        handle(text);
    }

    public static void generate(String text) {
        text.substring(5, 2);
    }

    public static void handle(String text) {
        try {
            text.substring(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }
}