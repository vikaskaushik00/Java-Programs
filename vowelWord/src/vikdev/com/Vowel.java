package vikdev.com;
import java.util.Scanner;

public class Vowel  {
    Scanner scanner = new Scanner(System.in);
    String word;

    public void search(){
        System.out.println("Enter the word ");
        word = scanner.nextLine();
        int n = word.length();
        int a = 0;
        char start = word.charAt(0);


        if (word.charAt(0) == 'a'){
           System.out.println(word+"ay");
       }else if (word.charAt(0) == 'e'){
           System.out.println(word+"ay");

       }else if (word.charAt(0) == 'i'){
           System.out.println(word+"ay");

       }else if (word.charAt(0) == 'o'){
           System.out.println(word+"ay");

       }else if (word.charAt(0) == 'u'){
           System.out.println(word+"ay");

       }


       else if (word.charAt(0) != 'a'){

           for (int i = 1;i < n;i++){
             System.out.print(word.charAt(i));
           }
            System.out.print(start+"ay");

        }else if (word.charAt(0) != 'e'){
           for (int i = 1;i < n;i++){
               System.out.print(word.charAt(i));
           }
            System.out.print(start+"ay");
        }else if (word.charAt(0) != 'i'){
           for (int i = 1;i < n;i++){
               System.out.print(word.charAt(i));
           }
            System.out.print(start+"ay");

        }else if (word.charAt(0) != 'o'){
           for (int i = 1;i < n;i++){
               System.out.print(word.charAt(i));
           }
            System.out.print(start+"ay");

        }else if (word.charAt(0) != 'u'){
           for (int i = 1;i < n;i++){
               System.out.print(word.charAt(i));
           }
            System.out.print(start+"ay");
        }
    }



}
