package minimumElementChallange;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

   System.out.println("Minimum Element is : "+findMin(readInteger(5)));

    }


    public static int[] readInteger(int count){
        System.out.println("Enter "+count+" integer and find the minimum value");
        int[] minValue = new int[count];
        for (int i = 0; i < minValue.length; i++){
            minValue[i] = scan.nextInt();
        }

        return minValue;
    }
    public static int findMin(int[] array){
        int min = array[0];
        for (int i = 0; i<array.length; i++){
            if(array[i] < min){
                min = array[i];
            }

        }
        return min;
    }
}
