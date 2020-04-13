package vikdev.com;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        binary();
    }


    public static void binary() throws Exception {
//        ArrayList<String> name = new ArrayList<>();
//        name.add("Vikas");
//        name.add("Ansh");
//        name.add("Akash");
//        name.add("Sarthak");
//        name.add("Shubham");
//        try (DataOutputStream file = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("names.dat")))) {
//            for (String s : name) {
//                file.writeUTF(s);
//            }
//        }
        boolean eof = false;
        try (DataInputStream reader = new DataInputStream(new BufferedInputStream(new FileInputStream("names.dat")))) {
            while (!eof){
                try{
                    String string = reader.readUTF();
                    System.out.println(string);
                }catch (EOFException e){
                    eof = true;
                }
            }
        }
    }
}