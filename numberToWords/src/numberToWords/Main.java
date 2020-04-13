package numberToWords;

public class Main {

    public static void main(String[] args) {
        numberToWords(001);

    }


    public static int getDigitCount(int number) {
        if(number < 0) {
            System.out.println("Invalid value");
            return -1;
        }
        int count = 0;
        if(number == 0){
            count = 1;
        }

        while(number > 0){
            if(number % 10 >= 0){
                count += 1;


            }
            number /= 10;
        }
        return count;
    }

    public static void numberToWords(int number) {
        int number1 = number;

        number = reverse(number);
        int digit;
        if(number < 0) {
            System.out.println("Invalid Value");
        }
        else{
            for(int i = 0; i <= number; i++) {
                digit = number % 10;
                switch (digit){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Invalid");
                }
                number /= 10;
            }
            int digcount = getDigitCount(number1);
            int revcount = getDigitCount(reverse(number));
            int difcount = digcount - revcount;
            if(difcount != 0) {
                for(int i = 1; i<= difcount; i++) {
                    System.out.println("Zero");
                }
            }
        }
    }

    public static int reverse(int number) {
        int rev = 0;
        while (number != 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number = number/10;
        }
        return rev;
    }



}
