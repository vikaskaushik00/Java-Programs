package minAndMaxInputChallange;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int i,digit,min = 0,max = 0;
        boolean first = true;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter how many number you want to enter : " );
        int number = obj.nextInt();
        for(i = 1; i <= number; i++) {
            System.out.println("Enter the "+i+" number : ");
            boolean check = obj.hasNextInt();
            if(check) {
                   digit = obj.nextInt();
                   if(first){
                       first = false;
                       min = digit;
                       max = digit;

                   }
                  if ( digit > max){
                      max= digit;
                  }

                  if(digit < min){
                      min = digit;
                  }

            }else {
                System.out.println("Invalid input ");
                break;
            }
            obj.nextLine();

        }
        System.out.println("minimum : " +min);
        System.out.println("maximum : "+max);
        obj.close();
    }

}
