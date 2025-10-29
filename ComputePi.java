package chapter_5;

public class ComputePi {
    public static void main(String[] args) {
        // Leibniz series: pi = 4 * Σ (-1)^k / (2k+1)
        double sum = 0.0;
        int terms = 1_000_000;

        for (int k = 0; k < terms; k++) {
            double term = ((k % 2 == 0) ? 1.0 : -1.0) / (2 * k + 1);
            sum += term;
        }
        double pi = 4 * sum;
        System.out.printf("π ≈ %.12f using %,d terms%n", pi, terms);
    }
}
