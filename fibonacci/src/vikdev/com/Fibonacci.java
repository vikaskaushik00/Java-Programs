package vikdev.com;

public class Fibonacci {
    private int a = 0,b = 1,c = 0;

    public void fib(){
        System.out.println(a);
        System.out.println(b);

        for (int i = 0; i <= 10; i++){
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
