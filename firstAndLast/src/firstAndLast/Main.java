package firstAndLast;

public class Main {

    public static void main(String[] args) {
        sumFirstAndLastDigit(1234);

    }
    public static int sumFirstAndLastDigit(int number) {
        int lst,lastDigit,reverse = 0,sum = 0;
        if(number > 0) {
            lst = number % 10;
            while(number != 0) {
                lastDigit = number % 10;
                reverse = reverse * 0 + lastDigit;
                number= number/10;

                sum = lst + reverse;
            }
            System.out.println("number "+sum) ;
            return 1;
        }
        else
            return -1;
    }
}
