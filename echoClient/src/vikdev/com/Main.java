package vikdev.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Main {
// 127.0.0.1 = localhost
    public static void main(String[] args) {
        try(Socket socket = new Socket("127.0.0.1",5000)){
            socket.setSoTimeout(30000);

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);

            Scanner scanner = new Scanner(System.in);
            String echoes;
            String response;
            do {
                System.out.println("Enter string to be echoed ");
                echoes =  scanner.nextLine();
                printWriter.println(echoes);
                if (!echoes.equals("Exit")){
                    response =  bufferedReader.readLine();
                    System.out.println(response);
                }
            }while (!echoes.equals("Exit"));
        }catch (SocketTimeoutException soc){
            System.out.println(soc.getMessage());
        }
        catch (IOException io){
            System.out.println("Client error : ");
            io.printStackTrace();
        }
    }
}
