package vikdev.com;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello from the main ");

        AnotherThread anotherThread = new AnotherThread();
        anotherThread.setName("==AnotherThread==");
        anotherThread.start();

        new Thread(){
            @Override
            public void run(){
                System.out.println("Hello from anonymous class");
            }
        }.start();

        Thread myRunnable = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous MyRunnable class ");
                try{
                    anotherThread.join();
                    System.out.println("AnotherThread terminated or time out , so i am running again ");
                }catch (InterruptedException e){
                    System.out.println("I couldn't wait after all , i was interrupted ");
                }
            }
        });
        myRunnable.start();
       // anotherThread.interrupt();


        System.out.println("Hello from the main ");

    }
}
