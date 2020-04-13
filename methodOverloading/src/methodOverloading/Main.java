package methodOverloading;

public class Main {

    public static void main(String[] args) {
        int val = calculator("vikas ", 100);
        System.out.println(val);
        System.out.println(calculator(10));
    }
    public static int calculator(String name, int score) {
        System.out .println(name + "got the " + score +"  marks");
        return score * 1000;
    }
    public static int calculator(int num) {
        return num * 100;
    }

}
