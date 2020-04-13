package equalityPrinter;

public class Main {

    public static void main(String[] args) {
        printEqual(1,1,1);
        printEqual(1,2,3);
        printEqual(-1,-2,-3);
        printEqual(1,2,1);
        printEqual(0,0,2);
    }

    public static void printEqual(int a, int b, int c) {

        if((a < 0) || (b < 0 ) || (c < 0)) {
            System.out.println("Invalid Value");
        }
        else if((a == b) && (b == c) && (a == c)) {
            System.out.println("All numbers are equal");
        }
        else if ((a == b) || (b == c) || (a == c)) {
            System.out.println("Neither all are equal or different");
        }
        else if((a != b) && (a != c) && (a != c)) {
            System.out.println("All numbers are different");
        }

    }

}
