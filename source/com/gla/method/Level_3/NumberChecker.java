public class NumberChecker {
    public static int getDigitCount(int n) {
        return String.valueOf(Math.abs(n)).length();
    }

    public static int[] getDigitsArray(int n) {
        int count = getDigitCount(n);
        int[] digits = new int[count];
        n = Math.abs(n);
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int n) {
        int[] digits = getDigitsArray(n);
        for (int d : digits) if (d == 0) return true;
        return false;
    }

    public static boolean isArmstrong(int n) {
        int[] digits = getDigitsArray(n);
        int power = digits.length;
        double sum = 0;
        for (int d : digits) sum += Math.pow(d, power);
        return (int) sum == n;
    }

    public static void findLargestTwo(int[] digits) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > first) {
                second = first;
                first = d;
            } else if (d > second && d != first) {
                second = d;
            }
        }
        System.out.println("Largest: " + first + ", Second Largest: " + second);
    }

    public static void findSmallestTwo(int[] digits) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < first) {
                second = first;
                first = d;
            } else if (d < second && d != first) {
                second = d;
            }
        }
        System.out.println("Smallest: " + first + ", Second Smallest: " + second);
    }
}