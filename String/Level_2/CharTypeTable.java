import java.util.Scanner;

public class CharTypeTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] result = getCharTypes(text);
        System.out.printf("%-10s %-15s%n", "Char", "Type");
        for (String[] row : result) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }

    public static String[][] getCharTypes(String s) {
        String[][] data = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            data[i][0] = String.valueOf(s.charAt(i));
            data[i][1] = VowelConsonantCount.checkChar(s.charAt(i));
        }
        return data;
    }
}