package vikdev.com;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the string or integer to check palindrome : ");
        String name = scanner.nextLine();
            Palindrome palindrome = new Palindrome(name);
        palindrome.palindrome();
    }
}
