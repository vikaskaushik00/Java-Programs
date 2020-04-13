package sharedDigit;

public class Main {

    public static void main(String[] args) {
        hasSharedDigit(12,55);

    }
    public static boolean  hasSharedDigit(int num1, int num2) {
        if((num1 >= 10 &&   num1 <= 99) && (num2 >= 10 && num2 <= 99)) {

            while(num1 > 0){
                int digit,digit2;
                digit=num1 % 10;
                digit2 = num1 /10;

                while (num2 > 0) {

                    if(digit == num2 % 10 || digit2 == num2 % 10) {
                        System.out.println(  " same number in both");
                        return true;
                    }
                    num2 = num2 / 10;
                }
            }

            return false;

        }
        else {
            return false;
        }
    }
}
