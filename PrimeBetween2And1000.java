package chapter_5;

public class PrimeBetween2And1000 {
    public static void main(String[] args) {
        int count = 0;
        for (int n = 2; n <= 1000; n++) {
            if (isPrime(n)) {
                System.out.printf("%4d", n);
                count++;
                if (count % 10 == 0) System.out.println();
            }
        }
        if (count % 10 != 0) System.out.println();
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n % 2 == 0) return n == 2;
        for (int d = 3; d * d <= n; d += 2)
            if (n % d == 0) return false;
        return true;
    }
}

