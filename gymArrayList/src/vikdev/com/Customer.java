package vikdev.com;

public class Customer {
    private String name;
    private int fees;

    public String getName() {
        return name;
    }

    public int getFees() {
        return fees;
    }

    public Customer(String name, int fees){
        this.name = name;
        this.fees = fees;
    }
}
