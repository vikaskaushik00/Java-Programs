package descendingSort;

import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter how many integer you want to sort ");
        int a = input.nextInt();
        int[] myArray = getIntegers(a);
        for(int i = 0; i < a;i++){
            System.out.println("Values are "+myArray[i]);
        }
        int[] arr = sort(myArray);
        for (int i = 0; i < a;i++){
            System.out.println("sorted array is "+arr[i]);
        }

    }
    public static int[] getIntegers(int a){
        int[] num = new int[a];
        System.out.println("Enter the values ");
        for (int i = 0; i < num.length;i++){
            num[i] = input.nextInt();
        }
        return num;
    }


    public static int[] sort(int[] array){
        int temp;
        for (int i = 0;i < array.length; i++){
            for (int j = i+1;j < array.length;j++){
                if(array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
