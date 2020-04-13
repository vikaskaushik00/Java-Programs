package vikdev.com;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        string();
    }

    public static void string(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string (max length 10)");
        String name  = scanner.nextLine();
        System.out.println("Enter the Integer ex - 999");
        int num = scanner.nextInt();
        int n = name.length();
        if (n <= 10 && num < 1000){
            System.out.printf("%-15s%03d",name,num);
        }else {
            System.out.println(" Wrong input ");
        }
    }
}
