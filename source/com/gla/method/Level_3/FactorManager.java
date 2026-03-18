public class FactorManager {
    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) factors[idx++] = i;
        return factors;
    }

    public static int getGreatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    public static long getCubeProduct(int[] factors) {
        long prod = 1;
        for (int f : factors) prod *= Math.pow(f, 3);
        return prod;
    }
}