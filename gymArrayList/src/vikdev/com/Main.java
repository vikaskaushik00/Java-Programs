package vikdev.com;
import java.util.Scanner;

public class Main {
    private static  Scanner scan = new Scanner(System.in);
    private static  Gym gym = new Gym();

    public static void main(String[] args) {

        boolean quit = true;
        System.out.println("************WELCOME TO VIKAS'S GYM***************");
        printOption();
        while (quit){
            System.out.println("Enter your choice ");
           int choose =  scan.nextInt();
           scan.nextLine();
            switch (choose){
                case 0:
                    System.out.println("Shutting down application ");
                    quit = false;
                    break;
                case 1:
                    printOption();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    removeCustomer();
                    break;
                case 4:
                    printCustomer();
                    break;
                default:
                    System.out.println("Wrong input");
            }

        }

    }

    public static void printOption(){
        System.out.println("Available option \n"+"Press \n"+
                "0 : TO exit from application \n"+
                "1 : TO print options \n"+
                "2 : TO add name and fees \n"+
                "3 : TO remove name from membership \n "+
                "4 : TO print details ");
    }


    public static void addCustomer(){
        System.out.println("Enter Customer name ");
        String name = scan.nextLine();
        System.out.println("Enter customer fees ");
        int fees = scan.nextInt();
        Customer customer = new Customer(name,fees);
        gym.add(customer);
        System.out.println(name +" added successfully");

    }
    public static void removeCustomer(){
        System.out.println("Enter Customer name ");
        String name = scan.nextLine();
        gym.remove(name);
        System.out.println(name+" has been removed");

    }
    public static void printCustomer(){
        gym.print();
    }

}

