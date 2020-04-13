package linearSearch;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter how many integer you want to enter ");
        int num = scan.nextInt();
        linearSearch(num);
    }

    public static void linearSearch(int num){
        System.out.println("Enter the array ");
        int[] array = new int[num];
        for (int i = 0; i < num; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Enter which number you want search ");
        int searchNum = scan.nextInt();

        for (int i = 0; i < num; i++){
            if(array[i] == searchNum){
                int a = i+1;
                System.out.println("Number is found at "+a+" position in the array");
            }

        }

    }
}
