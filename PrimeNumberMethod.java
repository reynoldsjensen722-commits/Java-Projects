package chapter_6;

public class PrimeNumberMethod {

    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are\n");
        printPrimeNumbers(50);
    }

    public static void printPrimeNumbers(int numberOfPrimes) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10;

        int count = 0;  // Count of found primes
        int number = 2; // Number to test for primality

        // Keep going until we've printed enough primes
        while (count < numberOfPrimes) {
            if (isPrime(number)) {
                count++;

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.printf("%-5d\n", number);
                } else {
                    System.out.printf("%-5d", number);
                }
            }
            number++;
        }
    }

    /** Check whether a number is prime */
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false; // Not prime
            }
        }
        return true; // Prime
    }
}

