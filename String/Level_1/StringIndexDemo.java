import java.util.Scanner;

public class StringIndexDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        try {
            generate(text);
        } catch (Exception e) {
            System.out.println("Abrupt stop avoided by main catch: " + e);
        }
        handle(text);
    }

    public static void generate(String text) {
        System.out.println(text.charAt(text.length() + 1));
    }

    public static void handle(String text) {
        try {
            System.out.println(text.charAt(text.length() + 1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e);
        }
    }
}