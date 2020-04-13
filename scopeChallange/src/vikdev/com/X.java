package vikdev.com;
import java.util.Scanner;

public class X {
    private int x;
    Scanner scanner = new Scanner(System.in);
    public void x(){
        System.out.println("Enter the number for times : ");
        this.x = scanner.nextInt();
        for (int x = 1;x <= 12;x++ ){
            System.out.println(x+ " times "+this.x+" is : "+x * this.x );
        }
    }

}
