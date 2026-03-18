public class NumberCheckerDivisors {
    public static int sumProperDivisors(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum;
    }

    public static boolean isPerfect(int n) { return sumProperDivisors(n) == n; }
    public static boolean isAbundant(int n) { return sumProperDivisors(n) > n; }
    public static boolean isDeficient(int n) { return sumProperDivisors(n) < n; }

    public static boolean isStrong(int n) {
        int sum = 0;
        int[] digits = NumberChecker.getDigitsArray(n);
        for (int d : digits) {
            int fact = 1;
            for (int i = 1; i <= d; i++) fact *= i;
            sum += fact;
        }
        return sum == n;
    }
}