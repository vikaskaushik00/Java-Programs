package vikdev.com;

import static org.junit.Assert.*;

public class BankAccountTest {
    private BankAccount bankAccount;
    private static int  count = 0;

    @org.junit.Before
    public void setup(){
        bankAccount = new BankAccount("Vikas","Kaushik",1000.00,BankAccount.CHECKING);
        System.out.println("Running a test...");
    }


    @org.junit.Test
    public void deposit() {
        double balance = bankAccount.deposit(100.00,true);
        assertEquals(1100.00,balance,0);
    }
    @org.junit.Test
    public void withdraw() {
        double balance = bankAccount.withdraw(600.00,true);
        assertEquals(400.00,balance,0);

    }

    @org.junit.Test //(expected = IllegalArgumentException.class) -> used in present after junit 4
    public void withdraw_atm() {
        try {
            bankAccount.withdraw(600.00,false); // used before junit 3 means in older version of junit
        }catch(IllegalArgumentException e){

        }
     }

    @org.junit.Test
    public void getBalance() {
        bankAccount.deposit(100.00,true);
        assertEquals(1100.00,bankAccount.getBalance(),0);
    }
    @org.junit.Test
    public void isCheck_true() {
        assertTrue("The account is not check",bankAccount.isCheck());
    }
    @org.junit.BeforeClass
    public static void beforeClass(){
        System.out.println("Running before class  count ==" + count++);
    }

    @org.junit.AfterClass
    public static void afterClass(){
        System.out.println("Running after class... count == " + count++);
    }

    @org.junit.After
    public void tearDown(){
        System.out.println("Count == "+ count++);
    }
}