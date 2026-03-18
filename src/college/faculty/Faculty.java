package college.faculty;

public class Faculty {
    String name;
    String subject;

    public Faculty(String n, String s) {
        name = n;
        subject = s;
    }

    public void display() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Subject: " + subject);
    }
}