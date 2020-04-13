package vikdev.com;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Echoer extends Thread{
    private Socket socket;

    public Echoer(Socket socket){
        this.socket = socket;
    }

    public void run(){
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);

            while (true){
                String string = bufferedReader.readLine();
                System.out.println("Received client message : " + string);
                if (string.equals("Exit")){
                    break;
                }
//                try{
//                    Thread.sleep(15000);
//                }catch (InterruptedException e){
//                    System.out.println(e.getMessage());
//                }
                 printWriter.println(string);
            }

        }catch (IOException e) {
            System.out.println("OOPs" + e.getMessage());
        }finally {
            try {
                socket.close();
            } catch (IOException ie) {
                // oh well
            }
        }
        }
    }


