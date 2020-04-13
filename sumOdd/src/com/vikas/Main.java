package com.vikas;

public class Main {

    public static void main(String[] args) {

        sumOdd(1,10);

    }
    public static boolean isOdd(int number) {
        if (number > 0) {
            if(number % 2 != 0)
                return true;
            else
                return false;
        }
        else
            return false;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        for(int i = start; i <= end; i++)  {
            boolean num = isOdd(i);

            if(num == true) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("sum of odd numbers is  = " + sum);
        return sum;
    }
}
