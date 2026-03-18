import java.util.Scanner;

public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        char result = findFirstNonRepeating(text);
        System.out.println(result == '\0' ? "No unique character" : "First non-repeating: " + result);
    }

    public static char findFirstNonRepeating(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) return s.charAt(i);
        }
        return '\0';
    }
}