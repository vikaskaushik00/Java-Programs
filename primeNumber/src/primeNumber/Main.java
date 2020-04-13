package primeNumber;

public class Main {

    public static void main(String[] args) {
          isPrime(11);

    }
    public static int isPrime(int n) {
        int i;
        if(n == 1)
            return 0;
        else {
            for(i = 2; i <= n/2; i++) {
                if (n % i == 0) {
                    System.out.println("Number is not prime " + n);
                    return 0;
                }

            }
                    System.out.println("Number is prime number " + n);
                    if (n == 3) {
                        System.out.println("number is  " + n);
                    } else
                        System.out.println(n++);
                    return 1;
            }
        }

    }

