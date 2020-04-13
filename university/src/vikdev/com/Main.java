package vikdev.com;

public class Main {

    public static void main(String[] args) {

    Courses courses = new Courses("School of Engineering",400);
    University university = new University("Sharda",22,courses);
    university.getCourses().training();
    university.total();


    }
}
