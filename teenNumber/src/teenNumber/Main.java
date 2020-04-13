package teenNumber;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        boolean result = hasTeen(15,16,17);
        System.out.println(result);
        boolean res = isTeen(15);
        System.out.println(res);

    }

    public static boolean hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19 ) || (c >= 13 && c <= 19)) {

                return true;

        }
        else
            return false;

    }
    public static boolean isTeen(int d) {
        if(d >= 13 && d <= 19) {
            return true;

        }
        else
            return false;
    }

}
