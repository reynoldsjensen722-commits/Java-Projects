package chapter_6;

public class Emirps {

    // Check if number is prime
    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    // Reverse a number
    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }

    // Check if number is an emirp
    public static boolean isEmirp(int number) {
        int reversed = reverse(number);
        return isPrime(number) && isPrime(reversed) && number != reversed;
    }

    // Main method to print first 100 emirps
    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        while (count < 100) {
            if (isEmirp(number)) {
                System.out.print(number + " ");
                count++;

                // Print 10 numbers per line
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            number++;
        }
    }
}
