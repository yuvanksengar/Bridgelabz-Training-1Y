import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value for a (double): ");
        double a = input.nextDouble();
        System.out.print("Enter value for b (double): ");
        double b = input.nextDouble();
        System.out.print("Enter value for c (double): ");
        double c = input.nextDouble();

        double res1 = a + b * c;
        double res2 = a * b + c;
        double res3 = c + a / b;
        double res4 = a % b + c;

        System.out.println("The results of Double Operations are " + 
                           res1 + ", " + res2 + ", " + res3 + ", and " + res4);

        input.close();
    }
}