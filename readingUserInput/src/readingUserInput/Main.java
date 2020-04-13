package readingUserInput;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter your birth of year :");
        boolean isInt = obj.hasNextInt();
        if(isInt){
            int yearOfBirth = obj.nextInt();
            obj.nextLine();
            System.out.println("Enter your name :");

                String name = obj.nextLine();
                int year = 2019 - yearOfBirth;
                if(year >= 0 && year <= 100) {
                    System.out.println(" Your name is : " + name + " you are : " + year + " years old");
                } else {
                    System.out.println("Invalid Age");
                }

        }else {
            System.out.println("Can't parse year of birth ");
        }

        obj.close();

    }
}

