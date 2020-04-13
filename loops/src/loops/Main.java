package loops;

public class Main {

    public static void main(String[] args) {
        int i;
        for(i = 2; i <= 5; i++) {
            System.out.println("10000 at " + i +"% interest is = " + String.format("%.2f",calculateInterest(10000,i)));
        }
        for(i = 8; i >= 2; i--) {
            System.out.println("10000 at " + i +"% interest is = " + String.format("%.2f",calculateInterest(10000,i)));
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
            return (amount*(interestRate/100));

    }
}
