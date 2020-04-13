package primitive.datatype;

public class Main {

    public static void main (String[] args) {
        int myMaxNumber = Integer.MAX_VALUE;
        int myMinNumber = Integer.MIN_VALUE;
        int Busted = myMaxNumber + 1;
        int minBusted = myMinNumber -1;
        System.out.println("Maximun number of the integer :"  + myMaxNumber);
        System.out.println("Minimum number of the integer :"  + myMinNumber);
        System.out.println("Maximum Busted number is :" + Busted );
        System.out.println("Minimum Busted number is :" + minBusted );

        byte maxByteValue = Byte.MAX_VALUE;
        byte minByteValue = Byte.MIN_VALUE;
        System.out.println("Maximum Byte value is :" + maxByteValue);
        System.out.println("minimum Byte value is :" + minByteValue);

        short maxShortValue = Short.MAX_VALUE;
        short minShortValue = Short.MIN_VALUE;
        System.out.println("Maximum Short value is :" + maxShortValue);
        System.out.println("Minimum Short value is :" + minShortValue);

        long maxLongValue = Long.MAX_VALUE;
        long minLongValue = Long.MIN_VALUE;
        System.out.println("Maximum Long number is :" + maxLongValue);
        System.out.println("Minimum Long number is :" + minLongValue);

        byte newByteValue = (byte) (maxByteValue / 2);

    }
}
