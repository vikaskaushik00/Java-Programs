package vikdev.com;

public class AnotherThread extends Thread {
    @Override
    public void run(){
        System.out.println("Hello from " + currentThread().getName());

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println("AnotherThread Woke me up");
            return;
        }

        System.out.println("3 seconds completed I am awake ");
    }
}
