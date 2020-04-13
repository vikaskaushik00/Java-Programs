package vikdev.com;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Bank {

    private  String accountNumber;
    private double deposit = 0;
    private Lock lock;

    public Bank(String accountNumber, double deposit){
        this.accountNumber = accountNumber;
        this.deposit = deposit;
        this.lock = new ReentrantLock();
    }

    public  void setDeposit(double deposit){
        boolean status = false;
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                try{
                    this.deposit += deposit;
                    status = true;
                    System.out.println("Total amount after depositing the amount is :  " + this.deposit);

                }finally {
                    lock.unlock();
                }

            }
            else {
                System.out.println("Couldn't find the lock");
            }
        }catch (InterruptedException e){
            System.out.println("Exception");
        }
        System.out.println("Transaction status is : " + status);
    }

    public  void withdraw(double withdrawAmount){
        boolean status = false;
        try {
           if (lock.tryLock(1000,TimeUnit.MILLISECONDS)){
               try{
                   this.deposit -= withdrawAmount;
                   status = true;
                   System.out.println("Total amount after withdrawing the amount is  : " + this.deposit);
               }finally {
                   lock.unlock();
               }
           }else {
               System.out.println("Couldn't find the lock");
           }
            }catch (InterruptedException e) {
            System.out.println("Exception");
        }
        System.out.println("Transaction status is : " + status);
    }

        public String getAccountNumber(){
        return accountNumber;
        }
        public void printAccountNumber(){
        System.out.println("Account number : "  + accountNumber);
        }
}
