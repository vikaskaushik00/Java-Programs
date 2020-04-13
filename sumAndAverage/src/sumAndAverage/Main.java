package sumAndAverage;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }
    public static void inputThenPrintSumAndAverage() {
        int sum = 0,n,i;
        double avg = 0;

        Scanner calc = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to enter  : ");
        n=calc.nextInt();
        for(i = 1; i <= n; i++) {
            System.out.println("Enter number " + i+" : ");
            boolean number = calc.hasNextInt();
            if(number) {
                int digit = calc.nextInt();
                sum += digit;
                avg = sum / n;
                avg = Math.round(avg);
            }
            calc.nextLine();
        }
        calc.close();
        System.out.println("Sum = "+sum+ "   Average = " + avg);

    }
}
