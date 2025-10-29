package chapter_6;

public class PrimeCounter {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number < 2) return false;
        
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false; // Not prime
            }
        }
        return true; // Prime
    }

    // Main method to count primes < 10,000
    public static void main(String[] args) {
        int primeCount = 0;

        for (int i = 2; i < 10000; i++) {
            if (isPrime(i)) {
                primeCount++;
            }
        }

        System.out.println("Number of prime numbers less than 10,000: " + primeCount);
    }
}

