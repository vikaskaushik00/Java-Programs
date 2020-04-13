package vikdev.com;

import java.io.EOFException;
import java.io.RandomAccessFile;

public class Main {

    public static void main(String[] args) throws Exception {

        try(RandomAccessFile read = new RandomAccessFile("names.txt","r")) {
            read.seek(4);
            System.out.println(read.readChar());
        }catch (EOFException e){
            System.out.println("End of file exception");
        }

//        char[] name = {'a','b','c','d','e','f'};
//        try(RandomAccessFile raf = new RandomAccessFile("names.txt","rw")){
//            for (int i = 0; i < name.length; i++){
//                raf.writeChar(name[i]);
//            }
//            System.out.println("Writing successFull");
//        }
    }
}
