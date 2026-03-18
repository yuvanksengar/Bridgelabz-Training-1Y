import java.util.Scanner;

public class FriendsAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter " + names[i] + "'s age: ");
            ages[i] = input.nextInt();
            System.out.print("Enter " + names[i] + "'s height: ");
            heights[i] = input.nextDouble();
        }

        int minAgeIndex = 0;
        int maxHeightIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }

        System.out.println("Youngest Friend: " + names[minAgeIndex]);
        System.out.println("Tallest Friend: " + names[maxHeightIndex]);
        input.close();
    }
}