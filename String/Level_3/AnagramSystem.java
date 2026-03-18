import java.util.Scanner;

public class AnagramSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text 1: ");
        String s1 = sc.next();
        System.out.print("Enter text 2: ");
        String s2 = sc.next();

        System.out.println("Are Anagrams? " + checkAnagram(s1, s2));
    }

    public static boolean checkAnagram(String t1, String t2) {
        if (t1.length() != t2.length()) return false;

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        for (int i = 0; i < t1.length(); i++) {
            freq1[t1.charAt(i)]++;
            freq2[t2.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) return false;
        }
        return true;
    }
}