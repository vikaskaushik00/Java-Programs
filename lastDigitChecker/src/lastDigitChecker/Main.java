package lastDigitChecker;

public class Main {

    public static void main(String[] args) {
        hasSameLastDigit(23,32,41);

    }
    public static boolean hasSameLastDigit(int num1,  int num2, int num3 ) {
        if(num1 >= 10 && num1 <= 1000 && num2 >= 10 && num2 <= 1000 && num3 >= 10 && num3 <= 1000) {

            int last1 = num1 % 10;
            System.out.println(last1);
            num1 /= 10;
            int digit1 = num1 % 10;
            System.out.println(digit1);
            int last2 = num2 % 10;
            System.out.println(last2);

            num2 /= 10;
            int digit2 = num2 % 10;
            System.out.println(digit2);

            int last3 = num3 % 10;
            System.out.println(last3);

            num3 /= 10;
            int digit3 = num3 % 10;
            System.out.println(digit3);



            if(last1 == last2 || last1 == digit2 || digit1 == last2 || digit1 == digit2 || last2 == last3 || last2 == digit3 || digit2 == last3 || digit2 == digit3 || last3 == last1 || last3 == digit1 || digit3 == last1|| digit3 == digit1 ){
                            System.out.println("have same last two digit number ");
                            return true;
                        }
                   else return false;
        }
        else
            return false;
    }




}
