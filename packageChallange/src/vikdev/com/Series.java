package vikdev.com;
import java.util.ArrayList;

public  class Series {
    static int  sum = 0;
    static int fact = 1;
    static int fab = 0;

    public static int nSum(int n){
        ArrayList<Integer> num = new ArrayList<>();
        num.add(n);
        for (int i = 0;i < num.size();i++){
            sum = sum + num.get(i);
        }
        return sum;
    }
    public static int factor(int n){
        ArrayList<Integer> factorial = new ArrayList<>();
        factorial.add(n);
        for(int i = 0;i < factorial.size();i++){
            fact = fact * factorial.get(i);
        }
            return fact;
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
            int a = 1;
            int b = 0;
            int fib = 0;
            for (int i = 1; i < n; i++) {
                fib = a + b;
                a = b;
                b = fib;
            }
            return fib;

    }

}
