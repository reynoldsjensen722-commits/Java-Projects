package chapter_3;
import java.util.Scanner;

public class PalindromeInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        int original = n;

        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        System.out.println(original + (original == rev ? " is" : " is not") + " a palindrome");
        input.close();
    }
}
