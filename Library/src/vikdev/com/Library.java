package vikdev.com;
import java.util.ArrayList;

public class Library {
    ArrayList<Details> details = new ArrayList<Details>();
    private String name;
    public  Library(String name){
        this.name = name;
    }

    public void show(){
        for (int i = 0;i < details.size();i++){
            System.out.println(details.get(i).getName()+" -> "+details.get(i).getBookName()+" -> "+details.get(i).getRollNumber());
        }
    }

    public void add(Details all){
        Details num = search(all.getName());
        if (num == null){
            details.add(all);
        }
        else {
            System.out.println("Already exists");
        }
    }

    public Details search(String name){
        for (int i = 0;i < details.size();i++){
            if (details.get(i).getName().equals(name)){
                return details.get(i);
            }
        }
        return null;
    }

}
