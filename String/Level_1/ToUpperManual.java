import java.util.Scanner;

public class ToUpperManual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String customUpper = convertToUpper(text);
        String builtInUpper = text.toUpperCase();

        System.out.println("Custom: " + customUpper);
        System.out.println("Built-in: " + builtInUpper);
        System.out.println("Match: " + compareStrings(customUpper, builtInUpper));
    }

    public static String convertToUpper(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result += (char)(c - 32);
            } else {
                result += c;
            }
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
}