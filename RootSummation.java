package chapter_5;
import java.util.Scanner;

public class RootSummation {
    // Sum of square roots: sqrt(1) + sqrt(2) + ... + sqrt(n)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();

        double sum = 0.0;
        for (int i = 1; i <= n; i++) sum += Math.sqrt(i);

        System.out.printf("Sum of sqrt(1..%d) = %.6f%n", n, sum);
        input.close();
    }
}
