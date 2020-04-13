package vikdev.com;
import java.util.ArrayList;

public class Customer {
    private String name ;
    ArrayList<Double> amount;

    public Customer(String name,double initial){
        this.name = name;
        this.amount = new ArrayList<Double>();
        addTransaction(initial);
    }

    public void addTransaction(double amount){
        this.amount.add(amount);
    }
    public String getName(){
        return this.name;
    }
    public ArrayList<Double> getAmount(){
        return amount;
    }

}
