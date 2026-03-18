package com.company.main;
import com.company.hr.*;
import com.company.payroll.*;

public class MainApp {
    public static void main(String[] args) {

        Employee e = new Employee(1,"Khushi","IT",50000);

        Payroll p = new Payroll();
        p.calculateBonus(e);
    }
}