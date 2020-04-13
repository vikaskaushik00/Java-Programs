package decimalComparator;

public class Main {

    public static void main(String[] args) {
        boolean result = areEqualByThreeDecimalPlaces(3.1758,3.1757);
        System.out.println(result);

    }

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {

        if((int) (first * 1000) == (int) (second * 1000)) {
            return true;
        }
        else
            return false;

    }
    }

