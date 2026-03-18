import java.util.Scanner;

public class FootballHeights {
    public static void main(String[] args) {
        int[] heights = new int[11];
        for (int i = 0; i < 11; i++) {
            heights[i] = 150 + (int) (Math.random() * 101);
        }

        System.out.println("Shortest: " + findShortest(heights) + " cm");
        System.out.println("Tallest: " + findTallest(heights) + " cm");
        System.out.println("Mean: " + findMean(heights) + " cm");
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int h : arr) sum += h;
        return sum;
    }

    public static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int h : arr) if (h < min) min = h;
        return min;
    }

    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int h : arr) if (h > max) max = h;
        return max;
    }
}