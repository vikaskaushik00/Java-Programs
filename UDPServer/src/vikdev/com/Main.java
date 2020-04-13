package vikdev.com;

import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.DatagramSocket;
import java.net.DatagramPacket;

public class Main {

    public static void main(String[] args) {
	try{
	    DatagramSocket datagramSocket = new DatagramSocket(5000);

	    while (true){
	        byte[] buffer = new byte[50];
	        DatagramPacket datagramPacket = new DatagramPacket(buffer,buffer.length);
	        datagramSocket.receive(datagramPacket);
	        System.out.println("Received : " + new String(buffer, 0, datagramPacket.getLength()));

	        String returnString = "Echoed : " + new String(buffer, 0, datagramPacket.getLength());
	        byte[] bytes = returnString.getBytes();
			InetAddress inetAddress = datagramPacket.getAddress();
			int port = datagramPacket.getPort();

			datagramPacket = new DatagramPacket(bytes, bytes.length, inetAddress, port);
			datagramSocket.send(datagramPacket);
        }

    }catch (SocketException e){
	    System.out.println(e.getMessage());
    }catch (IOException ioe){
	    System.out.println(ioe.getMessage());
    }
    }
}
