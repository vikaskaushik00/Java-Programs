package vikdev.com;

public class Account {
    private int accountNum;
    private int balance;
    private int phoneNumber;
    private String customerName;
    private String email;

    public Account(int accountNum, int balance, int phoneNumber, String customerName, String email){
        this.accountNum = accountNum;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
        this.customerName = customerName;
        this.email = email;
    }
    public int getAccountNum(){
        return accountNum;
    }
    public int getBalance(){
        return balance;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getEmail(){
        return email;
    }

    public void addFund(int amount){
        balance += amount;
        System.out.println("New amount is : "+balance);
    }
    public void withdraw(int amount){
       if ((balance = balance - amount) >= 500 ){
           System.out.println("Balance is "+balance);
       }
       else
           System.out.println("Balance is insufficient ");

    }

}
