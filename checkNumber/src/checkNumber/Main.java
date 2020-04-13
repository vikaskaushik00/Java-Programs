package checkNumber;

public class Main {

    public static void main(String[] a){
        checkNumber(-1);
        checkNumber(5);
    }

    public static void checkNumber(int number) {

        if(number > 0)
            System.out.println("This is postive number ");
        else if(number < 0)
            System.out.println("This  is negative number");
        else
            System.out.println("This number is zero ");
    }
}
