package vikdev.com;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches ;

    public Bank(String name){
        this.branches = new ArrayList<Branch>();
        this.name = name;
    }

    public boolean addBranch(String branchName ){
        if (find(branchName) == null){
            this.branches.add(new Branch(name));
            System.out.println(branchName+" added");
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName,String name,double trans){
        Branch branch = find(branchName);
        if (branch != null){
            branch.add(name,trans);
            System.out.println("added");
            return true;
        }else {
            System.out.println("Not");
            return false;
        }
    }

    public boolean addTrans(String branchName,String name,double trans){
        Branch branch = find(branchName);
        if (branch != null){
            branch.addTrans(name,trans);
            return true;
        }
        return false;
    }
    public boolean printTrans(String branchName,boolean trans){
        Branch branch = find(branchName);
        if (branch != null){
           System.out.println("Customers for branch "+branchName);
           ArrayList<Customer> customers = branch.getBranchCustomer();
           for (int i = 0;i <customers.size();i++){

               System.out.println(customers.get(i).getName()+" ["+(i+1)+"]");

               if (trans){
                   System.out.println("Transactions ");
                   ArrayList<Double> amount = customers.get(i).getAmount();
                    for (int j = 0;j < amount.size();i++){
                        System.out.println(j+1+" Amount "+amount.get(i));
                    }


               }
           }
            return true;
        }

        else {
            return false;
        }
    }



    private Branch find(String name){
        for (int i = 0;i <this.branches.size();i++) {
            Branch branch = this.branches.get(i);
            if (( branch.getName()).equals(name)) {
                return  branch;
            }
        }
        return null;

    }

}
