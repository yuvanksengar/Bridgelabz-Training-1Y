import java.util.Scanner;

public class PalindromeMaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        System.out.println("Logic 1 (Iterative): " + isPalindromeIterative(text));
        System.out.println("Logic 2 (Recursive): " + isPalindromeRecursive(text, 0, text.length() - 1));
        System.out.println("Logic 3 (Reverse Array): " + isPalindromeArray(text));
    }

    public static boolean isPalindromeIterative(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return isPalindromeRecursive(s, start + 1, end - 1);
    }

    public static boolean isPalindromeArray(String s) {
        char[] original = s.toCharArray();
        char[] reverse = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            reverse[i] = s.charAt(s.length() - 1 - i);
        }
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) return false;
        }
        return true;
    }
}