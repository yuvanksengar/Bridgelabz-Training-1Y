import java.util.Scanner;

public class WordSplitter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] customWords = splitWords(text);
        String[] builtInWords = text.split(" ");

        System.out.println("Arrays are identical: " + compareArrays(customWords, builtInWords));
    }

    public static String[] splitWords(String s) {
        int wordCount = 0;
        boolean inWord = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        String[] words = new String[wordCount];
        String currentWord = "";
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                currentWord += s.charAt(i);
            } else if (!currentWord.equals("")) {
                words[index++] = currentWord;
                currentWord = "";
            }
        }
        if (!currentWord.equals("")) words[index] = currentWord;
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }
}