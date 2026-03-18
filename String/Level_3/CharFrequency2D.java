import java.util.Scanner;

public class CharFrequency2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        String[][] result = getFrequency(text);
        for (String[] row : result) {
            System.out.println(row[0] + " occurs " + row[1] + " times");
        }
    }

    public static String[][] getFrequency(String s) {
        int[] freq = new int[256];
        int uniqueCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 0) uniqueCount++;
            freq[s.charAt(i)]++;
        }

        String[][] report = new String[uniqueCount][2];
        int index = 0;
        boolean[] processed = new boolean[256];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!processed[c]) {
                report[index][0] = String.valueOf(c);
                report[index][1] = String.valueOf(freq[c]);
                processed[c] = true;
                index++;
            }
        }
        return report;
    }
}