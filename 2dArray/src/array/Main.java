package array;

import  java.util.Scanner;
public class Main{
    public static void main(String[] args){

        int arr[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int [3][3];
        System.out.println("Enter the first matrix ");
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            for(int j = 0;j < 3;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the second matrix ");
        for (int i = 0;i < 3;i++){
            for (int j = 0;j < 3;j++){
                b[i][j] = scan.nextInt();
            }
            System.out.println();
        }
        System.out.println("The sum is ");
        for (int i = 0; i < 3;i++){
            for (int j = 0;j < 3;j++){
                c[i][j] = arr[i][j] + b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}