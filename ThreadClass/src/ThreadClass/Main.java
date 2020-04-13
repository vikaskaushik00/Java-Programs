package ThreadClass;


class hi implements Runnable{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi"+Thread.currentThread().getPriority());
            try {
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}
class hello implements Runnable{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }
    }
}

public class Main {

    public static void main(String[] args) {
        hi obj1 = new hi();
        hello obj2 = new hello();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
