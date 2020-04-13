package vikdev.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {

    public static void main(String[] args) {
        //write();
         read();
    }

    public static void write(){
        Path path = Paths.get("First.txt");
        try(BufferedWriter writer = Files.newBufferedWriter(path)){
            writer.write(" Hey from vikas");
        }catch (IOException ioe){
            ioe.getMessage();
        }
    }

    public static void read(){
        Path path = Paths.get("First.txt");
        try(BufferedReader reader = Files.newBufferedReader(path)){
           String name =  reader.readLine();
           System.out.println(name);
        }catch (IOException io){
            io.getMessage();
        }
    }
}
