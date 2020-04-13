package digonalStar;

public class Main {

    public static void main(String[] args) {
        printSquareStar(5);

    }

    public static void printSquareStar(int number) {
            int i,j;
            if(number < 5) {
                System.out.println("Invalid Value");
            }
            else {
                for (i = 1; i <= number; i++) {
                    for (j = 1; j <= number; j++) {
                        if (i == 1 || j == 1 || i == number || j == number || i == j || j == (number - i + 1)) {
                            System.out.print("*");
                        } else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
            }

    }
}
