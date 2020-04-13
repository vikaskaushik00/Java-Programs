package vikdev.com;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Axis Bank");
        bank.addBranch("a");
        bank.addCustomer("a","Vikas",10000.00);
        bank.addCustomer("a","ansh",20000.00);
        bank.addCustomer("a","akash",3000.00);

        bank.addBranch("v");
        bank.addCustomer("v","Vikas",10000.00);






        bank.printTrans("a",true);



    }
}
