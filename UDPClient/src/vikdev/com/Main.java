package vikdev.com;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            DatagramSocket datagramSocket = new DatagramSocket();

            Scanner scanner = new Scanner(System.in);
            String message;
            do {
               System.out.println("Enter the message : ");
               message = scanner.nextLine();
               byte[] buffer = message.getBytes();
               DatagramPacket packet = new DatagramPacket(buffer, buffer.length, inetAddress, 5000);
               datagramSocket.send(packet);

               byte[] bytes = new byte[50];
               packet = new DatagramPacket(bytes,bytes.length);
               datagramSocket.receive(packet);
               System.out.println(new String(bytes,0,packet.getLength()));


            }while (!message.equals("exit"));

        }catch (SocketTimeoutException e){
            System.out.println("Time out " + e.getMessage());
        }catch (IOException ioe){
            System.out.println("Client error : " + ioe.getMessage());
        }

    }
}
