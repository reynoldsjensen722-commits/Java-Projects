package chapter_5;
import java.util.Scanner;

public class ComputeE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Compute e using 1 + 1/1! + ... + 1/n!, enter n: ");
        int n = input.nextInt();

        double e = 1.0;
        double fact = 1.0;
        for (int k = 1; k <= n; k++) {
            fact *= k;
            e += 1.0 / fact;
        }
        System.out.printf("Approximation of e for n=%d: %.12f%n", n, e);
        input.close();
    }
}

