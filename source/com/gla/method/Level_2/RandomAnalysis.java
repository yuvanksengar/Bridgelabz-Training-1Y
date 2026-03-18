import java.util.Scanner;

public class RandomAnalysis {
    public static void main(String[] args) {
        RandomAnalysis ra = new RandomAnalysis();
        int[] randomNumbers = ra.generate4DigitRandomArray(5);
        
        System.out.print("Generated Numbers: ");
        for (int n : randomNumbers) System.out.print(n + " ");
        
        double[] stats = ra.findAverageMinMax(randomNumbers);
        
        System.out.println("\nAverage: " + stats[0]);
        System.out.println("Minimum: " + (int)stats[1]);
        System.out.println("Maximum: " + (int)stats[2]);
    }

    public int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + (int) (Math.random() * 9000);
        }
        return numbers;
    }

    public double[] findAverageMinMax(int[] numbers) {
        if (numbers.length == 0) return new double[3];

        int min = numbers[0];
        int max = numbers[0];
        double sum = 0;

        for (int n : numbers) {
            min = Math.min(min, n);
            max = Math.max(max, n);
            sum += n;
        }

        double avg = sum / numbers.length;
        return new double[]{avg, (double)min, (double)max};
    }
}