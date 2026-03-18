class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public void setCGPA(double CGPA) { this.CGPA = CGPA; }
    public double getCGPA() { return this.CGPA; }
}

class PostgraduateStudent extends Student {
    PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    void showDetails() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name);
    }
}