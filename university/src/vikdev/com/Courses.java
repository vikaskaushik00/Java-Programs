package vikdev.com;

public class Courses {
    private String name;
    private int students;

    public Courses (String name,int students){
        this.name = name;
        this.students = students;
    }

    public String getName(){
        return this.name;
    }
    public int getStudents(){
        return this.students;
    }

    public void training(){
        System.out.println(students+" students are studying in "+name);
    }

}
