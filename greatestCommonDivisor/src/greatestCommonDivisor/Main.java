package greatestCommonDivisor;

public class Main {

    public static void main(String[] args) {
        getGreatestCommonDivisor(16,40);


    }
    public static int getGreatestCommonDivisor (int first ,int second) {
        if( first < 10 || second < 10) {
            return -1;
        }

            int x = (first >= second) ? second :first;
            for(int i = x; i >= 1; i--) {
             if(first % i == 0 && second % i == 0){
                 System.out.println(i);
                 return i;
             }
            }

        return 1;
    }

}


