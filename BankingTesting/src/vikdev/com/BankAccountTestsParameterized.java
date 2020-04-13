package vikdev.com;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BankAccountTestsParameterized {

    private BankAccount bankAccount;
    private double amount;
    private boolean branch;
    private double expected;

    public BankAccountTestsParameterized(double amount, boolean branch, double expected) {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }

    @org.junit.Before
    public void setup(){
        bankAccount = new BankAccount("Vikas","Kaushik",1000.00,BankAccount.CHECKING);
        System.out.println("Running test....");
    }
    @Parameterized.Parameters
    public static Collection<Object[]> testCondition(){
        return Arrays.asList(new Object[][]{
                {100.00, true, 1100},
                {200, true, 1200},
                {325.14, true, 1325.14},
                {489.33, true, 1489.33},
                {1000.00, true, 2000}
        });
    }

    @org.junit.Test
    public void getBalance() {
        bankAccount.deposit(amount,branch);
        assertEquals(expected,bankAccount.getBalance(),0.01);
    }
}
