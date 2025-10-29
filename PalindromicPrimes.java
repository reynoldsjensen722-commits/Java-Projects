package chapter_6;

/*
 * Author: Jensen Reynolds
 * Class: CS 2
 * Professor: Taylor
 * Date: 
 * Description: 
 */
public class PalindromicPrimes {

    // Check if a number is prime
    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    // Check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;
    }

    // Main method to display first 100 palindromic primes
    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        while (count < 100) {
            if (isPrime(number) && isPalindrome(number)) {
                System.out.print(number + " ");
                count++;

                // Print 10 per line
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            number++;
        }
    }
}

