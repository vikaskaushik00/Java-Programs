package DigitSumChallange;

public class Main {

    public static void main(String[] args) {
        sumDigits(53972);

    }

    public static int sumDigits(int number) {
        if (number >= 10) {
            int n,sum = 0;
            while (number > 0){
               n = number % 10;
               number = number /10;
               sum += n;


            }
            System.out.println("Sum of the digit is " + sum);

            return 1;


        } else if( number < 0) {
            System.out.println("Invalid Input");
            return -1;
        }
        else {
            System.out.println("Invalid input");
            return -1;
        }
    }
}