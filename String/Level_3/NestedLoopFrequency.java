import java.util.Scanner;

public class NestedLoopFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        
        String[] result = getFreqNested(text);
        for (String s : result) System.out.println(s);
    }

    public static String[] getFreqNested(String s) {
        char[] chars = s.toCharArray();
        int[] freq = new int[s.length()];
        int validCount = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                freq[i] = 1;
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        freq[i]++;
                        chars[j] = '0';
                    }
                }
                validCount++;
            }
        }

        String[] result = new String[validCount];
        int index = 0;
        char[] original = s.toCharArray();
        for (int i = 0; i < original.length; i++) {
            if (chars[i] != '0') {
                result[index++] = original[i] + ": " + freq[i];
            }
        }
        return result;
    }
}