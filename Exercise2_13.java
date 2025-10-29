package chapter_2;

import java.util.Scanner;

public class Exercise2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double saving = input.nextDouble();

        double monthlyRate = 0.00417;
        double account = 0;

        for (int i = 0; i < 6; i++) {
            account = (account + saving) * (1 + monthlyRate);
        }

        System.out.println("After the sixth month, the account value is $" + account);

        input.close();
    }
}
