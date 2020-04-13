package evenDigitSum;

public class Main {

    public static void main(String[] args) {
        System.out.println(" Sum of even numbers : "+getEvenDigitSum(123456898));

    }
    public static int getEvenDigitSum(int number) {
        int lastDigit,sum = 0;
        if(number > 0 ) {
            while (number != 0) {
                lastDigit = number % 10;
                number = number / 10;
                if (lastDigit % 2 == 0) {
                    System.out.println(lastDigit);
                    sum = sum + lastDigit;
                }
            }
            return sum;

        }
        else
            return -1;
    }
}
