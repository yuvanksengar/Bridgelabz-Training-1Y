public class EmployeeBonusSystem {
    public static void main(String[] args) {
        double[][] initialData = generateEmployeeData();
        double[][] updatedData = calculateBonusAndNewSalary(initialData);
        displayReport(initialData, updatedData);
    }

    public static double[][] generateEmployeeData() {
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + (Math.random() * 90000); // 5-digit salary
            data[i][1] = (int) (Math.random() * 11);     // Years of service (0-10)
        }
        return data;
    }

    public static double[][] calculateBonusAndNewSalary(double[][] data) {
        double[][] results = new double[10][2];
        for (int i = 0; i < 10; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonusPercent = (years > 5) ? 0.05 : 0.02;
            
            double bonusAmount = salary * bonusPercent;
            double newSalary = salary + bonusAmount;
            
            results[i][0] = newSalary;
            results[i][1] = bonusAmount;
        }
        return results;
    }

    public static void displayReport(double[][] oldData, double[][] newData) {
        double sumOld = 0, sumNew = 0, totalBonus = 0;
        
        System.out.printf("%-12s %-10s %-12s %-12s %-10s%n", "Emp", "Service", "Old Salary", "New Salary", "Bonus");
        System.out.println("------------------------------------------------------------");
        
        for (int i = 0; i < 10; i++) {
            sumOld += oldData[i][0];
            sumNew += newData[i][0];
            totalBonus += newData[i][1];
            
            System.out.printf("Emp %-8d %-10.0f %-12.2f %-12.2f %-10.2f%n", 
                (i + 1), oldData[i][1], oldData[i][0], newData[i][0], newData[i][1]);
        }
        
        System.out.println("------------------------------------------------------------");
        System.out.printf("TOTALS:      %-10s %-12.2f %-12.2f %-10.2f%n", "", sumOld, sumNew, totalBonus);
    }
}