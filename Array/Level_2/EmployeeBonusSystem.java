import java.util.Scanner;

public class EmployeeBonusSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] oldSalaries = new double[10];
        double[] serviceYears = new double[10];
        double[] newSalaries = new double[10];
        double[] bonuses = new double[10];
        
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonusPayout = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1));
            System.out.print("Enter Salary: ");
            double s = input.nextDouble();
            System.out.print("Enter Years of Service: ");
            double y = input.nextDouble();

            if (s <= 0 || y < 0) {
                System.out.println("Invalid input. Try again.");
                i--;
                continue;
            }
            oldSalaries[i] = s;
            serviceYears[i] = y;
        }

        for (int i = 0; i < 10; i++) {
            double rate = (serviceYears[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = oldSalaries[i] * rate;
            newSalaries[i] = oldSalaries[i] + bonuses[i];
            
            totalOldSalary += oldSalaries[i];
            totalBonusPayout += bonuses[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Paid: " + totalBonusPayout);
        System.out.println("Total New Salary: " + totalNewSalary);
        input.close();
    }
}