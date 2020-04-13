package vikdev.com;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> myInt = new ArrayList<Integer>();
        for (int i = 0;i < 11; i++){
            myInt.add(Integer.valueOf(i));
        }
        for (int i = 0;i < 11;i++){
            System.out.println(i +" -> "+myInt.get(i).intValue());
        }
        System.out.println("**************************************************************************");
        ArrayList<Double> myDouble = new ArrayList<Double>();
        for (double dbl = 0.0;dbl <= 10; dbl += 0.5){
            myDouble.add(Double.valueOf(dbl));
        }
        for (int i = 1;i < myDouble.size();i++){
            System.out.println(i +" -> "+myDouble.get(i).doubleValue());
        }
    }
}
