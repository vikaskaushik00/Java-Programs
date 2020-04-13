package reverseArrayChallange;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number how many integer you want to enter ");
        int numInt = scan.nextInt();
        System.out.println("Enter the array ");
        int[] arr = new int[numInt];
        for (int i = 0; i < numInt; i++){
            arr[i] = scan.nextInt();
        }
        reverse(arr);


    }

    public static void reverse(int[] array){
        int temp;
        int maxIndex = array.length-1;

        for(int i = 0; i < array.length-1; i++){
           temp = array[i];
           array[i] = array[maxIndex - i];
           array[maxIndex - i] = temp;
        }
        System.out.println("Reverse array is ");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
}
