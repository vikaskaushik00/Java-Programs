package readUserInputChallange;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int num, i,sum = 0;
        Scanner obj  = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to input : ");
        num = obj.nextInt();
        for(i = 1; i <= num; i++) {
            System.out.println("Enter number #" + i + " : ");
            boolean isNum = obj.hasNextInt();
            if(isNum) {
               int number = obj.nextInt();
               sum += number;
            }else {
                System.out.println("Invalid input");
            }
            obj.nextLine();
        }
        System.out.println("Sum of the numbers is : " + sum);
        obj.close();

    }
}
