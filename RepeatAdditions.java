package chapter_5;
import java.util.Scanner;

public class RepeatAdditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int correct = 0;
        for (int i = 0; i < 10; i++) {
            int a = (int)(Math.random() * 10);
            int b = (int)(Math.random() * 10);
            System.out.print("What is " + a + " + " + b + "? ");
            int ans = input.nextInt();
            if (ans == a + b) {
                System.out.println("Correct!");
                correct++;
            } else {
                System.out.println("Nope. The answer is " + (a + b));
            }
        }
        System.out.println("You got " + correct + " / 10 correct.");
        input.close();
    }
}

