class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "BridgeLabz";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Institute: " + instituteName + " | Course: " + courseName + 
                           " | Duration: " + duration + " months | Fee: " + fee);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

public class CourseMain {
    public static void main(String[] args) {
        Course c1 = new Course("Java", 3, 15000);
        c1.displayCourseDetails();
        Course.updateInstituteName("Global Tech Institute");
        c1.displayCourseDetails();
    }
}