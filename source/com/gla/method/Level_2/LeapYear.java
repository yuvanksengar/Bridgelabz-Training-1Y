import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (isLeapYear(year)) System.out.println("Leap Year");
        else System.out.println("Not a Leap Year");
    }

    public static boolean isLeapYear(int y) {
        if (y < 1582) return false;
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }
}