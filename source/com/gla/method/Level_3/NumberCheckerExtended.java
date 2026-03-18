public class NumberCheckerExtended {
    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int n) {
        int sum = sumDigits(NumberChecker.getDigitsArray(n));
        return n % sum == 0;
    }

    public static int[][] getDigitFrequency(int n) {
        int[] digits = NumberChecker.getDigitsArray(n);
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        return freq;
    }
}