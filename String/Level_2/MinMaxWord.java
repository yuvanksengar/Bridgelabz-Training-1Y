import java.util.Scanner;

public class MinMaxWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = text.trim().split("\\s+");
        String[][] data = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(words[i].length());
        }

        int[] indices = findMinMax(data);
        System.out.println("Shortest: " + data[indices[0]][0]);
        System.out.println("Longest: " + data[indices[1]][0]);
    }

    public static int[] findMinMax(String[][] data) {
        int minIdx = 0, maxIdx = 0;
        for (int i = 1; i < data.length; i++) {
            if (Integer.parseInt(data[i][1]) < Integer.parseInt(data[minIdx][1])) minIdx = i;
            if (Integer.parseInt(data[i][1]) > Integer.parseInt(data[maxIdx][1])) maxIdx = i;
        }
        return new int[]{minIdx, maxIdx};
    }
}