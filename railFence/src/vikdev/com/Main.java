package vikdev.com;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        railFence();
    }
    public static void railFence(){
        String a = "",b = "";
        System.out.println("Enter the String : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0; i < name.length(); i++){
            if (i % 2 == 0){
                a = a +name.charAt(i);
            }else {
                b = b+name.charAt(i);
            }
        }
        System.out.println(a+b);
    }
}
