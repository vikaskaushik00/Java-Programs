package largestPrime;

public class Main {

    public static void main(String[] args) {
            System.out.println(getLargestPrime(217));
    }

    public static int getLargestPrime(int number) {
        if( number < 2) return -1;
        int i,largest = 0;
        for(i=2;i<number;i++) {
            if(number % i == 0){
                int count = 0;
                    for (int j=1;j<i;j++) {
                        if(i%j == 0) {
                            count++;
                        }
                    }
                    if(count <= 1) {
                        largest = i;
                    }
            }

        }
        return largest;
    }
}
