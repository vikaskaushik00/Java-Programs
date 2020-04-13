package equalSumChecker;

public class Main {

    public static void main(String[] args) {

        boolean sum = hasEqualSum(5,5,10);
        System.out.println(sum);

    }
    public static boolean hasEqualSum (int a , int b , int c) {
        if( a+b == c) {
            System.out.println("yes, sum of first parameter and second parameter is " +
                    "equal to third" );
            return true;
        }
        else
            return false;
    }
}