package chapter_5;
import java.util.Scanner;

public class DisplayFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();

        System.out.print("Smallest factors in increasing order: ");
        int d = 2;
        while (n > 1) {
            while (n % d == 0) {
                System.out.print(d + " ");
                n /= d;
            }
            d++;
        }
        System.out.println();
        input.close();
    }
}

