package vikdev.com;
import java.util.Scanner;

public class Resize {
    int[] arr = new int[5];

    public void size(){
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array");
        for (i = 0;i < arr.length;i++ ){
            arr[i] = scanner.nextInt();
        }
        for (i = 0;i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
        int[] newArray = arr;
        arr = new int[7];
        arr[5] = 9;
        arr[6] = 8;
        for (i= 0;i < newArray.length;i++){
            arr[i] = newArray[i];
        }
        for (i = 0;i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }



    }
}
