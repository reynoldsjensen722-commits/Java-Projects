package chapter_4;
import java.util.Scanner;

public class PhoneKeypad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char letter = input.next().toUpperCase().charAt(0);

        int number = 0;

        if (letter >= 'A' && letter <= 'Z') {
            if ("ABC".indexOf(letter) >= 0) number = 2;
            else if ("DEF".indexOf(letter) >= 0) number = 3;
            else if ("GHI".indexOf(letter) >= 0) number = 4;
            else if ("JKL".indexOf(letter) >= 0) number = 5;
            else if ("MNO".indexOf(letter) >= 0) number = 6;
            else if ("PQRS".indexOf(letter) >= 0) number = 7;
            else if ("TUV".indexOf(letter) >= 0) number = 8;
            else if ("WXYZ".indexOf(letter) >= 0) number = 9;

            System.out.println("The corresponding number is " + number);
        } else {
            System.out.println(letter + " is an invalid input");
        }

        input.close();
    }
}

