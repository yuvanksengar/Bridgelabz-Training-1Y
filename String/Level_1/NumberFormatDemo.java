import java.util.Scanner;

public class NumberFormatDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter non-numeric text: ");
        String text = sc.next();

        try {
            generate(text);
        } catch (Exception e) {
            System.out.println("Main caught: " + e);
        }
        handle(text);
    }

    public static void generate(String text) {
        Integer.parseInt(text);
    }

    public static void handle(String text) {
        try {
            Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }
}