package account;
import java.util.Scanner;

public class bank {
    private int acNumber;
    private int balance;
    private String customerName;
    private String email;
    private  String phoneNumber;

    public bank(){
        this(1234,10000,"Vikas kaushik","vikaskaushik00008@gmail.com","8433103747");
    }

    public bank(int acNumber,int balance,String customerName,String email,String phoneNumber){

        this.acNumber = acNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public void setAcNumber(int acNumber){
        this.acNumber = acNumber;
    }
    public int getAcNumber(){
        return this.acNumber;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void deposit(){
        Scanner obj = new Scanner(System.in);
        int a;
        System.out.println("Want to deposit? press 1 for YES and 2 for No");
        a= obj.nextInt();
        if(a == 1) {
            int bal;
            System.out.println("Enter the amount you want to deposit :");
            bal = obj.nextInt();
            this.balance = this.balance + bal;
            System.out.println("Current balance is : " + this.balance);
        }
        else if (a == 2){
            System.out.println("Current balance is  : "+ this.balance);
        }
        else
            System.out.println("Invalid Input");
    }

    public void withdraw(){
        Scanner obj = new Scanner(System.in);
        int a;
        System.out.println("Want to withdraw? press 1 for YES and 2 for No");
        a = obj.nextInt();
        if(a == 1) {
            System.out.println("Enter how much amount you want to withdraw : ");
            int amount = obj.nextInt();
            if (this.balance >= 500) {
                if (amount <= this.balance) {
                    this.balance = this.balance - amount;
                    System.out.println("Amount has been withdrawn successfully :) ");
                    System.out.println("Current balance is : " + this.balance);

                } else {
                    System.out.println("Insufficient amount! ");
                    System.out.println("You are withdrawing " + amount + " rupees" + " And current balance in the account is " + this.balance);

                }

            } else {
                System.out.println("Can not withdraw ! to withdraw amount you should have at least 500INR in your account");
            }
        }
        else if (a == 2){
            System.out.println("Current balance is  : "+ this.balance);
        }
        else
            System.out.println("Invalid Input");

    }
}
