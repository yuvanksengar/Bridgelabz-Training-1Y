import java.util.Scanner;

public class CustomLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        int custom = getLength(text);
        int builtIn = text.length();

        System.out.println("Custom Length: " + custom);
        System.out.println("Built-in Length: " + builtIn);
    }

    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }
}