package vikdev.com;

import java.util.Collections;
import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        reverse();
    }

    public  static void reverse(){
        System.out.println("Enter the sentence : ");
        String sentence = scanner.nextLine();
        String[] word = sentence.split(" ");
       for(String i : word){
           System.out.println(i);
       }


    }
}
