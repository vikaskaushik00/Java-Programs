package com.vikas;

public class Main {

    public static void main(String[] args) {

        int i,count = 0,sum = 0;

            for (i = 1; i <= 1000; i++) {
                if ((i % 3 == 0) && (i % 5 == 0)) {
                    System.out.println(i);
                    sum = sum + i;
                    count++;


                }
                if(count == 5)
                    break;
            }

        System.out.println("Sum of the numbers = " + sum);

    }
}
