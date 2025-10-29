package chapter_6;

import java.util.Scanner;

public class CreditCardValidator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number: ");
        long number = input.nextLong();

        if (isValid(number)) {
            System.out.println("Valid credit card number ✅");
        } else {
            System.out.println("Invalid credit card number ❌");
        }

        input.close();
    }

    // Main Luhn check
    public static boolean isValid(long number) {
        int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        boolean validPrefix =
            prefixMatched(number, 4) ||  // Visa
            prefixMatched(number, 5) ||  // MasterCard (5X)
            prefixMatched(number, 6) ||  // Discover
            prefixMatched(number, 37);   // American Express

        return (sum % 10 == 0) && validPrefix && getSize(number) >= 13 && getSize(number) <= 16;
    }

    // Step 1: double every second digit from right, sum results
    public static int sumOfDoubleEvenPlace(long number) {
        String numStr = Long.toString(number);
        int sum = 0;

        for (int i = numStr.length() - 2; i >= 0; i -= 2) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += getDigit(digit * 2);
        }

        return sum;
    }

    // Step 2: get single digit or sum of two-digit number
    public static int getDigit(int number) {
        if (number < 10) return number;
        return number / 10 + number % 10;
    }

    // Step 3: sum digits in odd places from right
    public static int sumOfOddPlace(long number) {
        String numStr = Long.toString(number);
        int sum = 0;

        for (int i = numStr.length() - 1; i >= 0; i -= 2) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += digit;
        }

        return sum;
    }

    // Step 4: check for matching prefix
    public static boolean prefixMatched(long number, int d) {
        int prefixSize = getSize(d);
        long prefix = getPrefix(number, prefixSize);
        return prefix == d;
    }

    // Step 5: get size (length) of number
    public static int getSize(long number) {
        return Long.toString(number).length();
    }

    // Step 6: get first k digits of number
    public static long getPrefix(long number, int k) {
        String numStr = Long.toString(number);
        if (numStr.length() < k) return number;
        return Long.parseLong(numStr.substring(0, k));
    }
}

