package vikdev.com;
import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> branchCustomer;

    public Branch(String name){
        branchCustomer = new ArrayList<Customer>();
        this.name = name;
    }
    public ArrayList<Customer> getBranchCustomer(){
        return getBranchCustomer();
    }

    public String getName() {
        return name;
    }

    public boolean add(String name, double amount){
            if (find(name) == null){
               this.branchCustomer.add(new Customer(name,amount));
                return true;
            }
            return false;
        }

        public boolean addTrans(String name,double trans){
            Customer customer = find(name);
            if (customer != null){
                customer.addTransaction(trans);
                return true;
            }
            return false;

        }


    private Customer find(String name){
        for (int i =0;i < this.branchCustomer.size();i++){
            if((branchCustomer.get(i).getName()).equals(name)){
                return branchCustomer.get(i);
            }
        }
        return null;
    }
}
