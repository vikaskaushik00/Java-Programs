package array;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myInt = getInt(5);
        for (int i = 0;i < myInt.length; i++){
            int a = i+1;
            System.out.println("Value "+a+" is "+myInt[i]);
        }
        System.out.println("Avg is "+avg(myInt));
    }

    public static int[] getInt(int num){
        System.out.println("Enter "+num+" of integer type");
        int[] values = new int[num];
        for (int i = 0;i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double avg(int[] array){
        int sum = 0;
        for (int i =0; i < array.length; i++){
            sum += array[i];
        }
        return (double) (sum) / (double) (array.length);
    }
}