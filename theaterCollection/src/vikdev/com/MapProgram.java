package vikdev.com;
import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String args[]){
        Map<Integer,String> list = new HashMap<>();
        if (list.containsKey(1)){
            System.out.println("1 is already on the list");
        }else {
            list.put(1," First number ");
            System.out.println("1 is added successfully ");
        }
        list.put(2," Vikas ");
        list.put(3," Python ");
        list.put(4," Vikas Kaushk ");

        list.replace(3,"Vikas is a big developer ");
        list.replace(2," Vikas ","akash is a low level developer");

       // System.out.println(list.get(1));
        //list.put(1,"Java is platform independent language ");

      //  list.remove(10);
//        if (list.remove(2," Python ")){
//            System.out.println("removed");
//        }else {
//            System.out.println("not removed");
//        }


        for (Integer i : list.keySet()){
            System.out.println(list.get(i));
        }



//        if (list.containsKey(1)){
//            System.out.println("1 is already on the list");
//        }else {
//            list.put(1,"First number");
//
//        }

    }
}
