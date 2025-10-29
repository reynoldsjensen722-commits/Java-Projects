package chapter_3;
import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        if (number1 + number2 == answer)
            System.out.println("You are correct!");
        else
            System.out.println("Your answer is wrong. " + number1 + " + " + number2 + " should be " + (number1 + number2));

        input.close();
    }
}
