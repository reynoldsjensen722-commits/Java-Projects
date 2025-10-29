package chapter_3;
import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (num1 > num2)
            System.out.println(num1 + " is greater than " + num2);
        else if (num1 < num2)
            System.out.println(num1 + " is less than " + num2);
        else
            System.out.println(num1 + " and " + num2 + " are equal.");

        input.close();
    }
}
