package chapter_6;

/*
 * Author: Jensen Reynolds
 * Class: CS 2
 * Professor: Taylor
 * Date: 
 * Description: 
 */
import java.util.Scanner;

public class PalindromePattern {

    // Reverses the digits of a number
    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }

    // Checks if a number is a palindrome
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    // Displays a pattern: right-aligned triangle with decreasing numbers per row
    public static void displayPattern(int n) {
        for (int row = 1; row <= n; row++) {
            // Print leading spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print("  ");
            }

            // Print descending numbers
            for (int num = row; num >= 1; num--) {
                System.out.print(num + " ");
            }

            System.out.println();
        }
    }

    // Main method to test everything
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Palindrome test
        System.out.print("Enter an integer to check if it's a palindrome: ");
        int number = input.nextInt();
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        // Pattern display
        System.out.print("Enter a number n to display the pattern: ");
        int n = input.nextInt();
        System.out.println("Pattern:");
        displayPattern(n);

        input.close();
    }
}

