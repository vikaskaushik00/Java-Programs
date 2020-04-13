package vikdev.com;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.nio.channels.Pipe;

public class Main {

    public static void main(String[] args) {
        try{
            Pipe pipe = Pipe.open();


            Runnable writer = new Runnable() {
                @Override
                public void run() {
                    try {
                        Pipe.SinkChannel sinkChannel = pipe.sink();
                        ByteBuffer buffer = ByteBuffer.allocate(56);

                        for (int i = 0; i < 10; i++) {
                            String currentTime = "The Time is : " + System.currentTimeMillis();
                            buffer.put(currentTime.getBytes());
                            buffer.flip();

                            while (buffer.hasRemaining()) {
                                sinkChannel.write(buffer);
                            }
                            buffer.flip();
                            Thread.sleep(100);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };

            Runnable reader = new Runnable() {
                @Override
                public void run() {
                    try {
                        //for adding the console output on the  file.txt
                       // System.setOut(new PrintStream(new FileOutputStream("output.txt")));

                        Pipe.SourceChannel sourceChannel = pipe.source();
                        ByteBuffer buffer = ByteBuffer.allocate(56);
                        for(int i = 0; i < 10; i++){
                            int bytesRead = sourceChannel.read(buffer);
                            byte[] timeString = new byte[bytesRead];
                            buffer.flip();
                            buffer.get(timeString);
                            System.out.println("Reader Thread : " + new String(timeString));
                            buffer.flip();
                            Thread.sleep(100);
                        }
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            };

            new Thread(writer).start();
            new Thread(reader).start();

        }catch (IOException e){
            e.printStackTrace();
        }



//	    try(FileOutputStream binFile = new FileOutputStream("data.dat");
//            FileChannel binChannel = binFile.getChannel()){
//            ByteBuffer buffer = ByteBuffer.allocate(100);
//	        byte[] outPutBytes = "Hello World ".getBytes();
//           // byte[] outPutBytes2 = "Nice to meet you".getBytes();
//        //    buffer.put(outPutBytes).putInt(100).putInt(294).put(outPutBytes2).putInt(3).flip();
//
//
//
//            buffer.put(outPutBytes);
//            long intPos1 = outPutBytes.length;
//            buffer.putInt(100);
//            long pos2 = intPos1 + Integer.BYTES;
//            buffer.putInt(294);
//            byte[] outPutBytes2 = "Nice to meet you".getBytes();
//            buffer.put(outPutBytes2);
//            long pos3 = pos2 + Integer.BYTES + outPutBytes2.length;
//            buffer.putInt(3);
//            buffer.flip();
//            binChannel.write(buffer);
//
//
//            RandomAccessFile rand = new RandomAccessFile("data.dat","rwd");
//            FileChannel channel = rand.getChannel();
//
//            ByteBuffer readBuffer = ByteBuffer.allocate(Integer.BYTES);
//           channel.position(pos3);
//           channel.read(readBuffer);
//           readBuffer.flip();
//           System.out.println("Int 3 : " + readBuffer.getInt());
//            readBuffer.flip();
//
//            channel.position(pos2);
//            channel.read(readBuffer);
//            readBuffer.flip();
//            System.out.println("Int 2 : " + readBuffer.getInt());
//            readBuffer.flip();
//
//            channel.position(intPos1);
//            channel.read(readBuffer);
//            readBuffer.flip();
//            System.out.println("Int 1 : " + readBuffer.getInt());
//
//            RandomAccessFile file = new RandomAccessFile("dataCopy.dat","rw");
//            FileChannel copyChannel = file.getChannel();
//            channel.position(0);
//           // long numtransferred = copyChannel.transferFrom(channel,0,channel.size());
//            long numtransferred = channel.transferTo(0,channel.size(),copyChannel);
//            System.out.println("Num tranfered is : " + numtransferred);
//
//            channel.close();
//            copyChannel.close();
//            file.close();

//            //**************************************************************************
//
//            byte[] outputString = "Hello world".getBytes();
//            long str1 = 0;
//            long newInt1 = outputString.length;
//            long newInt2 = newInt1 + Integer.BYTES;
//            byte[] outputString2 = "Nice to meet you".getBytes();
//            long str2 = newInt2 + Integer.BYTES;
//            long newInt3 = str2 + outputString2.length;
//
//            ByteBuffer writer = ByteBuffer.allocate(Integer.BYTES);
//            writer.putInt(100);
//            writer.flip();
//            channel.position(newInt1);
//            channel.write(writer);
//
//            writer.flip();
//            writer.putInt(-232);
//            writer.flip();
//            channel.position(newInt2);
//            channel.write(writer);
//
//            writer.flip();
//            writer.putInt(32);
//            writer.flip();
//            channel.position(newInt3);
//            channel.write(writer);
//
//            channel.position(str1);
//            channel.write(ByteBuffer.wrap(outPutBytes));
//            channel.position(str2);
//            channel.write(ByteBuffer.wrap(outPutBytes2));
//
//

//            ByteBuffer buffer1 = ByteBuffer.allocate(100);
//            channel.read(buffer1);
//            buffer1.flip();
//            byte[] str1 = new byte[outPutBytes.length];
//            buffer1.get(str1);
//            System.out.println("String 1 : " + new String(str1));
//            System.out.println("Int 1 : " + buffer1.getInt());
//            System.out.println("Int 2 : " + buffer1.getInt());
//            byte[] str2 = new byte[outPutBytes2.length];
//            buffer1.get(str2);
//            System.out.println("String 2 : " + new String(str2));
//            System.out.println("Int 3 : " + buffer1.getInt());




//	        ByteBuffer buffer = ByteBuffer.allocate(outPutBytes.length);
//	        buffer.put(outPutBytes);
//	        buffer.flip();
//	        int numBytes = binChannel.write(buffer);
//            System.out.println("num Bytes written was " + numBytes);
//
//            ByteBuffer intNum = ByteBuffer.allocate(Integer.BYTES);
//            intNum.putInt(245);
//            intNum.flip();
//            int num = binChannel.write(intNum);
//            System.out.println("Num of bytes of integer is : "+num);
//
//           intNum.flip();
//            intNum.putInt(345);
//            intNum.flip();
//            int a = binChannel.write(intNum);
//            System.out.println(a);
//
//            RandomAccessFile rand  = new RandomAccessFile("data.dat","rwd");
//            FileChannel channel = rand.getChannel();
//           // outPutBytes[0] = 'a';
//            buffer.flip();
//            channel.read(buffer);
//
//            if (buffer.hasArray()){
//                System.out.println(new String(buffer.array()));
//            }
//          //  System.out.println("Output = " + new String(outPutBytes));
//            //Absolute read
//            intNum.flip();
//            channel.read(intNum);
//            System.out.println(intNum.getInt(0));
//            intNum.flip();
//            channel.read(intNum);
//            System.out.println(intNum.getInt(0));
//            //Relative read
////            intNum.flip();
////            channel.read(intNum);
////            intNum.flip();
////            System.out.println(intNum.getInt());
////            intNum.flip();
////            channel.read(intNum);
////            intNum.flip();
////            System.out.println(intNum.getInt());
//            channel.close();
//            rand.close();


//            RandomAccessFile rand = new  RandomAccessFile("data.dat","rwd");
//            byte[] b = new byte[outPutBytes.length];
//            rand.read(b);
//            System.out.println(new String(b));
//            int num1 = rand.readInt();
//            int num2 = rand.readInt();
//            System.out.println(num1 + "    " + num2);


//	        FileInputStream file = new FileInputStream("data.txt");
//	        FileChannel channel = file.getChannel();
//            Path dataPath = FileSystems.getDefault().getPath("data.txt");
//            Files.write(dataPath,"\nLine 5".getBytes("UTF-8"), StandardOpenOption.APPEND);
//            List<String> lines = Files.readAllLines(dataPath);
//            for (String line : lines){
//                System.out.println(line);
//            }
//        }catch(IOException ioe){
//	        ioe.getMessage();
//        }
    }
}
