package college;
import college.student.Student;
import college.faculty.Faculty;
public class MainApp {
    public static void main(String[] args) {

        Student s = new Student("Khushi", 101);
        Faculty f = new Faculty("Tanmya", "Java");

        s.display();
        f.display();
    }
}