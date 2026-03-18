import java.util.Scanner;

public class ManualTrim{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        int[] bounds = findBounds(text);
        String customTrim = manualSub(text, bounds[0], bounds[1]);
        String builtInTrim = text.trim();

        System.out.println("Trimmed: '" + customTrim + "'");
        System.out.println("Matches built-in: " + customTrim.equals(builtInTrim));
    }

    public static int[] findBounds(String s) {
        int start = 0;
        while (start < s.length() && s.charAt(start) == ' ') start++;
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }

    public static String manualSub(String s, int start, int end) {
        String res = "";
        for (int i = start; i < end; i++) res += s.charAt(i);
        return res;
    }
}