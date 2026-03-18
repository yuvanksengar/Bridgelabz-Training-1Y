package college.student;

public class Student {
    String name;
    int roll;
    public Student(String n, int r) {
        name = n;
        roll = r;
    }
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + roll);
    }
}