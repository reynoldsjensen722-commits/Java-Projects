package chapter_5;
import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to test for primality: ");
        int n = input.nextInt();

        System.out.println(n + (isPrime(n) ? " is prime" : " is not prime"));
        input.close();
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n % 2 == 0) return n == 2;
        for (int d = 3; d * d <= n; d += 2)
            if (n % d == 0) return false;
        return true;
    }
}
