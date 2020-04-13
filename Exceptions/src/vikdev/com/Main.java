package vikdev.com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(divideLBYL(2,0));
        System.out.println(divideEAFP(5,4));
        int x = getNumEAFP();
        System.out.println("x is : "+x);
    }

    public static int getNum(){
        System.out.println("Enter the string : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        boolean isValid = true;
        for (int i = 0; i < input.length(); i++){
            if (!Character.isDigit(input.charAt(i))){
                isValid = false;
                break;
            }
        }
        if(isValid){
            return Integer.parseInt(input);
        }
        return 0;
    }

    public static int getNumEAFP(){
        System.out.println("Enter the Integer : ");
        Scanner scanner = new Scanner(System.in);

        try {
            return scanner.nextInt();
        }catch(InputMismatchException e){
            return 0;
        }
    }

    public static int divideLBYL(int x, int y){
        if (y != 0){
            return x / y;
        }else {
            return 0;
        }
    }

    public static int divideEAFP(int x, int y){
        try{
            return x / y;
        }catch (ArithmeticException e){
            return 0;
        }
    }
}
