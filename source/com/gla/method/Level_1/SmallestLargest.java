import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] res = findSmallestAndLargest(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("Smallest: " + res[0] + ", Largest: " + res[1]);
    }

    public static int[] findSmallestAndLargest(int n1, int n2, int n3) {
        int s = Math.min(n1, Math.min(n2, n3));
        int l = Math.max(n1, Math.max(n2, n3));
        return new int[]{s, l};
    }
}