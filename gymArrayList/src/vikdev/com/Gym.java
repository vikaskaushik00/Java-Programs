package vikdev.com;

import java.util.ArrayList;
public class Gym {
    ArrayList<Customer> details = new ArrayList<Customer>();

    public boolean add(Customer customer){
        int pos = find(customer.getName());
        if (pos >= 0){
            System.out.println("Already exists ");
            return false;
        }
        else {
            details.add(customer);
            return true;
        }

    }

//    public boolean fees(Customer customer){
//        int pos = find(customer.getName());
//        if (pos >= 0){
//            System.out.println("Already exists ");
//            return false;
//        }
//        else {
//            details.add(customer);
//            return true;
//        }
//
//    }
//
    public void print(){
        for (int i =0; i < details.size();i++){
            System.out.println(details.get(i).getName()+" - > " + details.get(i).getFees());

        }

    }

    public boolean remove(String name){
        int pos = find(name);
        if (pos >= 0){
            details.remove(pos);
            return true;
        }
        else {
            System.out.println("Not exists");
            return false;
        }
    }


    public int find(String name){
        for (int i = 0;i < details.size();i++){
            if (details.get(i).getName().equals(name)){
                    return i;
            }
        }
        return -1;
    }


}
