package chapter_6;

public class TwinPrimes {

    // Check if a number is prime
    public static boolean isPrime(int number) {
        if (number < 2) return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }

    // Main method to find twin primes less than 1000
    public static void main(String[] args) {
        System.out.println("Twin primes less than 1000:");

        for (int i = 2; i < 1000 - 2; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }
}
