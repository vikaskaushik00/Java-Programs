package vikdev.com;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Exceptions {
    public static void main(String[] args){
      try {
          int result = divide();
          System.out.println(result);
      }catch(ArithmeticException | NoSuchElementException  e){
          System.out.println(e.toString());
          throw new ArithmeticException("Unable to perform division ");
      }
      finally{
          System.out.println(" finally called ");
      }
    }

    public static int divide(){
        int x,y ;
       // try{
            x = getNum();
            y = getNum();
            System.out.println("x is : "+ x + " Y is : " + y);
            return x / y;
//        }catch (NoSuchElementException e){
//            throw new NoSuchElementException("No suitable input ");
//        }catch(ArithmeticException e){
//            throw new ArithmeticException("attempt to divide by zero");
//        }
    }

    public static int getNum(){
        System.out.println("Enter the number ");
        Scanner scanner = new Scanner(System.in);
        while (true){
            try{
                return scanner.nextInt();
            }catch (InputMismatchException e){
                scanner.nextLine();
                System.out.println("Enter the number : ");
            }
        }
    }

}
