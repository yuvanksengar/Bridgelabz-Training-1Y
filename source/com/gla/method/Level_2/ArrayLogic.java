import java.util.Scanner;

public class ArrayLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
            if (isPositive(nums[i])) {
                if (isEven(nums[i])) System.out.println("Positive Even");
                else System.out.println("Positive Odd");
            } else {
                System.out.println("Negative");
            }
        }

        int res = compare(nums[0], nums[4]);
        if (res == 1) System.out.println("First > Last");
        else if (res == 0) System.out.println("Equal");
        else System.out.println("First < Last");
    }

    public static boolean isPositive(int n) { return n >= 0; }
    public static boolean isEven(int n) { return n % 2 == 0; }
    public static int compare(int n1, int n2) {
        if (n1 > n2) return 1;
        if (n1 == n2) return 0;
        return -1;
    }
}