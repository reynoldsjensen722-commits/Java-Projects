package chapter_3;
import java.util.Scanner;

public class Lottery3Digits {
    public static void main(String[] args) {
        int lottery = (int)(Math.random() * 900) + 100; // 100-999

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();

        int l1 = lottery / 100;
        int l2 = (lottery / 10) % 10;
        int l3 = lottery % 10;

        int g1 = guess / 100;
        int g2 = (guess / 10) % 10;
        int g3 = guess % 10;

        boolean exact = guess == lottery;
        boolean allMatch =
            (g1 == l1 || g1 == l2 || g1 == l3) &&
            (g2 == l1 || g2 == l2 || g2 == l3) &&
            (g3 == l1 || g3 == l2 || g3 == l3) &&
            // ensure counts match by using sum of deltas trick
            (g1 + g2 + g3) == (l1 + l2 + l3);

        boolean oneMatch =
            !exact && !allMatch &&
            (g1 == l1 || g1 == l2 || g1 == l3 ||
             g2 == l1 || g2 == l2 || g2 == l3 ||
             g3 == l1 || g3 == l2 || g3 == l3);

        System.out.println("Lottery number: " + lottery);
        if (exact) System.out.println("Exact match: you win $10,000");
        else if (allMatch) System.out.println("Match all digits: you win $3,000");
        else if (oneMatch) System.out.println("Match one digit: you win $1,000");
        else System.out.println("Sorry, no match");

        input.close();
    }
}
