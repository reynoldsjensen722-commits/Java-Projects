package chapter_7;

public class EfficientPrimeNumbers {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        int[] primes = new int[NUMBER_OF_PRIMES];
        int count = 0;
        int number = 2;

        while (count < NUMBER_OF_PRIMES) {
            boolean isPrime = true;
            double sqrt = Math.sqrt(number);

            for (int i = 0; i < count; i++) {
                if (primes[i] > sqrt) {
                    break;
                }
                if (number % primes[i] == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes[count] = number;
                count++;
            }

            number++;
        }

        // Display the 50 prime numbers
        for (int i = 0; i < primes.length; i++) {
            System.out.print(primes[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println(); // newline after every 10 primes
            }
        }
    }
}


