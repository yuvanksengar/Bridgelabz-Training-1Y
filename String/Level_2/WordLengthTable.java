import java.util.Scanner;

public class WordLengthTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] table = getWordData(words);

        System.out.printf("%-15s %-10s%n", "Word", "Length");
        for (String[] row : table) {
            System.out.printf("%-15s %-10d%n", row[0], Integer.parseInt(row[1]));
        }
    }

    public static String[] splitWords(String s) {
        return s.trim().split("\\s+");
    }

    public static String[][] getWordData(String[] words) {
        String[][] data = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(words[i].length());
        }
        return data;
    }
}