package chapter_5;
import java.util.Scanner;

public class SumSeries_iOveriPlus1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Compute sum_{i=1..n} i/(i+1). Enter n: ");
        int n = input.nextInt();

        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += (double) i / (i + 1.0);
        }
        System.out.printf("Sum for n=%d is %.6f%n", n, sum);
        input.close();
    }
}
