package vikdev.com;

public class Details {
     String name;
    String bookName;
     int rollNumber;

    public Details(String name,String bookName,int rollNumber){
        this.name = name;
        this.bookName = bookName;
        this.rollNumber = rollNumber;
    }

    public String getName(){
        return name;
    }
    public String getBookName(){
        return bookName;
    }
    public int getRollNumber(){
        return rollNumber;
    }
}
