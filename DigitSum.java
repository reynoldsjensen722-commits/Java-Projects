package chapter_6;

public class DigitSum {

    // Method to compute the sum of digits of a number
    public static int sumDigits(long n) {
        int sum = 0;

        n = Math.abs(n); // Handle negative numbers

        while (n > 0) {
            sum += n % 10;  // Get last digit
            n /= 10;        // Remove last digit
        }

        return sum;
    }

    // Test program
    public static void main(String[] args) {
        long[] testNumbers = {12345, 9876543210L, -2468, 0};

        for (long num : testNumbers) {
            System.out.println("Sum of digits in " + num + " = " + sumDigits(num));
        }
    }
}

