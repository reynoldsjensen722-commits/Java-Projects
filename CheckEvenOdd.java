package chapter_3;
import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 2 == 0)
            System.out.println(number + " is even.");
        else
            System.out.println(number + " is odd.");

        input.close();
    }
}
