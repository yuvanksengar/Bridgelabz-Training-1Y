import java.util.Scanner;

public class FreqWithUniqueHelper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        String[][] result = findFrequencyWithUnique(text);
        for (String[] row : result) {
            System.out.println(row[0] + " -> " + row[1]);
        }
    }

    public static char[] uniqueCharacters(String s) {
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) temp += s.charAt(i);
        }
        return temp.toCharArray();
    }

    public static String[][] findFrequencyWithUnique(String s) {
        int[] freqMap = new int[256];
        for (int i = 0; i < s.length(); i++) freqMap[s.charAt(i)]++;

        char[] unique = uniqueCharacters(s);
        String[][] res = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            res[i][0] = String.valueOf(unique[i]);
            res[i][1] = String.valueOf(freqMap[unique[i]]);
        }
        return res;
    }
}