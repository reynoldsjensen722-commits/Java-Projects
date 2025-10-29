package chapter_5;
import java.util.Scanner;

public class SumSeries_AltHarmonic {
    // 1 - 1/2 + 1/3 - 1/4 + ... ± 1/n
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n for alternating harmonic sum: ");
        int n = input.nextInt();

        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += ((i % 2 == 1) ? 1.0 : -1.0) / i;
        }
        System.out.printf("Alternating harmonic sum for n=%d is %.12f%n", n, sum);
        input.close();
    }
}

