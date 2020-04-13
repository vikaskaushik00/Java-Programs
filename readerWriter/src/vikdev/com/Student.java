package vikdev.com;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class Student {
    Map<String, Integer> student = new LinkedHashMap<>();


    public void add() {
        student.put("Akash", 234);
        student.put("Vikas", 644);
        student.put("Sarthak", 322);
        student.put("Shubham", 575);
        student.put("Archit", 333);
        student.put("Rishab", 575);
        student.put("Jitik",424);
        student.put("Pratham",524);

        try (FileWriter writer = new FileWriter("students.txt")) {
            for (Map.Entry s : student.entrySet()) {
                writer.write(s.getKey() + "," + s.getValue() + "\n");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

    public void output() {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("students.txt")))) {
           scanner.useDelimiter(",");
           while (scanner.hasNextLine()){
               String name = scanner.next();
               scanner.skip(scanner.delimiter());
               int roll = Integer.parseInt(scanner.nextLine());
               System.out.println(name+" : "+roll);
           }
        }
    catch(IOException ioe)
    {
        ioe.printStackTrace();
    }
}
}
