package wrapper;

public class Main {

    public static void main(String[] args) {

        int a = 100;
        Integer obj = Integer.valueOf(a);
        System.out.println(obj);
        Integer obj1 = a;
        System.out.println(obj+obj1);

        Integer b = new Integer(50);
        int c = b.intValue();
        System.out.println(c);
        int d = b;
        System.out.println(c+d);


    }
}
