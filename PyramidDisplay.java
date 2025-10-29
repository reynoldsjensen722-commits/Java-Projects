package chapter_5;
import java.util.Scanner;

public class PyramidDisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines (1–15): ");
        int n = input.nextInt();
        if (n < 1 || n > 15) { System.out.println("Out of range"); input.close(); return; }

        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < (n - i) * 2; s++) System.out.print(" ");
            for (int j = i; j >= 1; j--) System.out.printf("%2d ", j);
            for (int j = 2; j <= i; j++) System.out.printf("%2d ", j);
            System.out.println();
        }
        input.close();
    }
}

