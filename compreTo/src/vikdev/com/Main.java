package vikdev.com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        List<Compare> list = new ArrayList<>();
        Compare compare = new Compare("Vikas","Java",100);
        list.add(compare);

        compare = new Compare("Akash","Maths",78);
        list.add(compare);

        compare = new Compare("Ansh","History",88);
        list.add(compare);

        compare = new Compare("Rahul","Science",66);
        list.add(compare);

        compare = new Compare("Jitik","SST",50);
        list.add(compare);

        Collections.sort(list,new Comparator<Compare>(){
            public int compare(Compare o1, Compare o2) {
               return o2.getMarks() - o1.getMarks();
            }
        });

        for (Compare c : list){
            System.out.println(c);
        }
    }
}
