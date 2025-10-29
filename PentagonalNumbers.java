package chapter_6;

public class PentagonalNumbers {

    // Method to compute the nth pentagonal number
    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }

    // Test program
    public static void main(String[] args) {
        final int TOTAL_NUMBERS = 100;
        final int NUMBERS_PER_LINE = 10;

        for (int i = 1; i <= TOTAL_NUMBERS; i++) {
            System.out.printf("%7d", getPentagonalNumber(i)); // Fixed width for alignment

            // Print new line after every 10 numbers
            if (i % NUMBERS_PER_LINE == 0) {
                System.out.println();
            }
        }
    }
}

