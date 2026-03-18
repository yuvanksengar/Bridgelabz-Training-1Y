package com.company.payroll;
import com.company.hr.Employee;
public class Payroll {
    public void calculateBonus(Employee e) {

        double bonus = e.getSalary() * 0.10;
        double total = e.getSalary() + bonus;

        System.out.println("Employee: " + e.getName());
        System.out.println("Salary After Bonus: " + total);
    }

}