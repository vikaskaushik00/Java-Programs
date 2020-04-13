package vikdev.com;

public class Compare  {
    private String name;
    private String subject;
    private int marks;

    public Compare(String name,String subject,int marks){
        this.name = name;
        this.subject = subject;
        this.marks = marks;
    }

    public int getMarks(){
        return marks;
    }
    public String toString(){
        return this.name + " : " + this.subject + " : " + this.marks;
    }





//    public int compareTo(Compare o){
//        if (this.marks < o.marks){
//            return 1;
//        }else if(this.marks > o.marks){
//            return -1;
//        }else {
//            return 0;
//        }
//    }
}
