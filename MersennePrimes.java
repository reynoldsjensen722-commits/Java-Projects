package chapter_6;

public class MersennePrimes {

    // Check if a number is prime
    public static boolean isPrime(int number) {
        if (number < 2) return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    // Main method to find Mersenne primes where p <= 31
    public static void main(String[] args) {
        System.out.printf("%-5s%-15s%n", "p", "2^p - 1 (Mersenne Prime)");
        System.out.println("-----------------------------");

        for (int p = 2; p <= 31; p++) {
            if (isPrime(p)) {
                long mersenne = (1L << p) - 1; // 2^p - 1
                if (isPrime((int) mersenne)) {
                    System.out.printf("%-5d%-15d%n", p, mersenne);
                }
            }
        }
    }
}

