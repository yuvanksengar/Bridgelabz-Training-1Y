import java.util.Scanner;

public class SignCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(check(n));
    }

    public static int check(int n) {
        if (n > 0) return 1;
        if (n < 0) return -1;
        return 0;
    }
}