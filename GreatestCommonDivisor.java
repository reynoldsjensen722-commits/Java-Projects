package chapter_5;
import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        int gcd = gcd(a, b);
        System.out.println("GCD is " + gcd);
        input.close();
    }

    private static int gcd(int a, int b) {
        a = Math.abs(a); b = Math.abs(b);
        while (b != 0) {
            int t = a % b;
            a = b; b = t;
        }
        return a;
    }
}

