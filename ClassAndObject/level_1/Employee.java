class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("-------------------------");
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 101, 50000.0);
        emp.displayDetails();
    }
}