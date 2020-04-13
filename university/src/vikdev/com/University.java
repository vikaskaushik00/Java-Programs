package vikdev.com;

public class University {
    private Courses courses;
    private String name;
    private int college;

    public University(String name,int college,Courses courses){
        this.name = name;
        this.college = college;
        this.courses = courses;
    }

    public String getName(){
        return this.name;
    }
    public int getCollege(){
        return this.college;
    }
    public Courses getCourses(){
        return this.courses;
    }

    public void total(){
        System.out.println(name+" University have "+college+" college in its campus ");
    }
}
