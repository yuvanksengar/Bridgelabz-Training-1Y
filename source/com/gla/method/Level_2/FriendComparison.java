import java.util.Scanner;

public class FriendComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter " + friends[i] + "'s age and height: ");
            ages[i] = sc.nextInt();
            heights[i] = sc.nextDouble();
        }

        System.out.println("Youngest: " + friends[findYoungest(ages)]);
        System.out.println("Tallest: " + friends[findTallest(heights)]);
    }

    public static int findYoungest(int[] ages) {
        int idx = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[idx]) idx = i;
        }
        return idx;
    }

    public static int findTallest(double[] h) {
        int idx = 0;
        for (int i = 1; i < 3; i++) {
            if (h[i] > h[idx]) idx = i;
        }
        return idx;
    }
}