package refrenceType;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myIntArray = new int[5];
        int[] anotherArray =  myIntArray;
        System.out.println("myIntArray "+ Arrays.toString(myIntArray));
        System.out.println("anotherArray "+Arrays.toString(anotherArray));
        anotherArray[0] = 2;

        System.out.println("myIntArray "+ Arrays.toString(myIntArray));
        System.out.println("anotherArray "+Arrays.toString(anotherArray));

        array(myIntArray);

        System.out.println("myIntArray "+ Arrays.toString(myIntArray));
        System.out.println("anotherArray "+Arrays.toString(anotherArray));
    }
    public static void array(int[] thirdArray){
        thirdArray = new int[] {1,2,3,4,5};
        System.out.println("Third "+Arrays.toString(thirdArray));
    }
}
