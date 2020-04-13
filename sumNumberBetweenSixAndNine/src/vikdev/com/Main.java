package vikdev.com;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

    search();

    }
    public static void search() {
        ArrayList<Integer> num = new ArrayList<Integer>();
        int flag = 0, sum = 0, temp = 0, var = 0, a = 0, b = 0, add = 0, start = 0;
        System.out.println("Enter how many integer you want to enter ");
        int total = scan.nextInt();
        System.out.println("Enter the numbers");
        for (int i = 0; i < total; i++) {
            int inte = scan.nextInt();
            num.add(inte);
        }

        for (int i = 0; i < total; i++) {
            System.out.println("  " + num.get(i));
        }

        for (int i = 0; i < total; i++) {
            if (num.get(i) == 6) {
                temp = 1;
                a = i;
            }
            if (num.get(i) == 9) {
                var = 1;
                b = i;
            }

        }

        if (temp == 1 && var == 1) {

            for (int j = a + 1; j < b; j++) {
                add += num.get(j);
            }
            System.out.println("Both 6 and 9 integer found sum = "+add);
            start = 1;
        }

        if (start == 0) {
            for (int i = 0; i < total; i++) {
                if (num.get(i) == 6 || num.get(i) == 9) {
                    flag = 1;
                }
            }

            for (int i = 0; i < total; i++) {
                if (flag == 1) {
                    sum = sum + num.get(i);
                }
            }
            if (flag == 1) {

                System.out.println("Only one integer in 6 and 9 is found sum is = "+sum);
            }

        }
    }
}
