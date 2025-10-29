package chapter_6;

public class SeriesCalculator {

    // Compute m(i) = 1/2 + 2/3 + 3/4 + ... + i/(i+1)
    public static double computeSeries(int i) {
        double sum = 0.0;
        for (int n = 1; n <= i; n++) {
            sum += (double) n / (n + 1);
        }
        return sum;
    }

    // Test program
    public static void main(String[] args) {
        System.out.printf("%-5s%-10s\n", "i", "m(i)");
        System.out.println("------------------");

        for (int i = 1; i <= 20; i++) {
            double result = computeSeries(i);
            System.out.printf("%-5d%-10.4f\n", i, result);
        }
    }
}

