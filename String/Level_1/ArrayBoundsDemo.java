import java.util.Scanner;

public class ArrayBoundsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};

        try {
            generate(names);
        } catch (Exception e) {
            System.out.println("Main caught: " + e);
        }
        handle(names);
    }

    public static void generate(String[] names) {
        System.out.println(names[10]);
    }

    public static void handle(String[] names) {
        try {
            System.out.println(names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }
}