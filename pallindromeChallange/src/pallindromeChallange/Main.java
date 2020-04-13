package pallindromeChallange;

public class Main {

    public static void main(String[] args) {
        isPalindrome(12321);

    }

    public static boolean isPalindrome(int number) {
        int original;
         original = number;
        int reverse = 0, lastDigit;
        while (number != 0) {
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;

        }
        if (original == reverse) {

            System.out.println(original + " is Palindrome");
            return true;
        }

            else {
                System.out.println(original + " is not palindrome");
            return false;
        }
    }
}
