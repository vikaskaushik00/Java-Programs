package vikdev.com;

public class Main {

    public static void main(String[] args) {
        Bank bank1 = new Bank("123-578", 1000.00);

        Thread t1 = new Thread(){
          public  void run(){
              bank1.setDeposit(300);
              bank1.withdraw(50.00);
              bank1.printAccountNumber();
            }
        };
        Thread t2 = new Thread(){
            public  void run(){
                bank1.setDeposit(203.75);
                bank1.withdraw(100.00);
                bank1.printAccountNumber();
            }
        };
        t1.start();
        t2.start();

    }
}
